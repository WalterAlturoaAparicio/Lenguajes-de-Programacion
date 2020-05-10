/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Conexion;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 *
 * @author walter
 */
public class LogicaUsuario {

    ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
    private Connection conexion = null;
    private PreparedStatement sentencias;
    private Statement stmt = null;
    private ResultSet rs;
    private Usuario usuario;
    private DefaultTableModel modelo;
    String[] titulos = {"Nombre", "Apellido(s)", "Dirección", "Correo", "Contacto", "usuario", "Password", "Cedula", "ID"};
    String[] titulos2= {"IdCita", "IdOdontologo","IdPaciente","Valor","FechaGenerada","FechaCita","Descripcion"};
    String[] fila = new String[9];

    public ArrayList<Usuario> obtenerListaUsuarios() {
        return ListaUsuarios;
    }

    public Usuario iniciaSesion(String user, String pass) {
        try {
            conexion = Conexion.getConnection();
            sentencias = conexion.prepareStatement("select * from usuarios where  Usuario= ? and Pass= ?");
            sentencias.setString(1, user);
            sentencias.setString(2, pass);
            rs = sentencias.executeQuery(); // ejecuto en la base de datos

            if (rs != null) {
                while (rs.next()) {
                    usuario = new Usuario();
                    usuario.setIdUsario(rs.getInt(1));
                    usuario.setNombre(rs.getString(2));
                    usuario.setPrimerApellido(rs.getString(3));
                    usuario.setSedundoApellido(rs.getString(4));
                    usuario.setContrasena(rs.getString(5));
                    usuario.setCorreo(rs.getString(6));
                    usuario.setDireccion(rs.getString(7));
                    usuario.setNickname(rs.getString(8));
                    usuario.setContacto(rs.getString(9));
                    usuario.setCedula(rs.getString(10));
                    usuario.setTipoUsuario(rs.getString(11));
                    ListaUsuarios.add(usuario); // en mi lista queda cargada toda la informacion
                }
            }

            return usuario;

        } catch (Exception e) {
            System.out.println("error en la consulta de la base de datos: " + e.getMessage());
        }
        return null;
    }

    public void crearUsuario(String nombre, String apellido, String cedula, String correo, String numeroContacto, String apellid2, String pass, String usuario, String direccion, String tipoUsuario) throws SQLException {
        try {
            conexion = Conexion.getConnection();
            stmt = (Statement) conexion.createStatement();
            if (conexion != null) {
                stmt.executeUpdate("INSERT INTO usuarios(Nombre,PrimerApellido,SegundoApellido,Pass,Correo,Direccion,Usuario,NumeroContacto,Cedula,tipoUsuario) values(" + "'" + nombre + "','" + apellido + "','"
                        + apellid2 + "','" + pass + "','" + correo + "','" + direccion + "','" + usuario + "','" + numeroContacto + "','"
                        + cedula + "','" + tipoUsuario + "')");
                System.out.println("Registro exitoso");
            } else {
                System.out.println("conexion fallida");
            }

        } catch (SQLException e) {
            System.out.println("error en la consulta de la base de datos: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("error en la consulta de la base de datos: " + e.getMessage());
        }
        finally{
            sentencias=null;
            conexion.close();
        }
    }
    
    public void crearCita(String idCita, String idOdontologo, String idCliente, String valor, String fechaCita, String fechaActual, String descripcion){
        
        try{
            conexion = Conexion.getConnection();
            stmt = (Statement) conexion.createStatement();
            if (conexion != null) {
                stmt.executeUpdate("INSERT INTO citas(IdCliente,IdOdontologo,Precio,FechaGenerada,FechaCita,Descripcion) values(" + "'"  + idOdontologo + "','"
                        + idCliente + "','" + valor + "','" + fechaActual + "','" + fechaCita + "','"+ descripcion + "')");
                System.out.println("Registro exitoso");
            } else {
                System.out.println("conexion fallida");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LogicaUsuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            sentencias=null;
            try {
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(LogicaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    

    public void consultaTabla(JTable tabla, String tipoUsuario) {
        try {
            conexion = Conexion.getConnection();
            stmt = (Statement) conexion.createStatement();
            if (conexion != null) //System.out.println("conexion exitosa");
            {
                modelo = new DefaultTableModel(null, titulos);
            }
            ResultSet rs = stmt.executeQuery("select * from Usuarios");

            while (rs.next()) {
                if (tipoUsuario.equals(rs.getString("tipoUsuario"))) {
                    fila[0] = rs.getString("Nombre");
                    fila[1] = rs.getString("PrimerApellido");
                    fila[2] = rs.getString("Direccion");
                    fila[3] = rs.getString("Correo");
                    fila[4] = rs.getString("NumeroContacto");
                    fila[5] = rs.getString("Usuario");
                    fila[6] = rs.getString("Pass");
                    fila[7] = rs.getString("Cedula");
                    fila[8] = rs.getString("Id");

                    modelo.addRow(fila);

                }
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            System.out.println("Error al extraer los datos de las tabals" + e.getMessage());
        }

    }
    
    
    public void consultaTablaCitas(JTable tabla) throws SQLException {
        try {
            conexion = Conexion.getConnection();
            stmt = (Statement) conexion.createStatement();
            if (conexion != null) //System.out.println("conexion exitosa");
            {
                modelo = new DefaultTableModel(null, titulos2);
            }
            ResultSet rs = null;
            try {
                rs = stmt.executeQuery("select * from citas");
            } catch (SQLException ex) {
                Logger.getLogger(LogicaUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

            while (rs.next()) {
                
                    fila[0] = rs.getString("Id");
                    fila[1] = rs.getString("IdCliente");
                    fila[2] = rs.getString("IdOdontologo");
                    fila[3] = rs.getString("Precio");
                    fila[4] = rs.getString("FechaGenerada");
                    fila[5] = rs.getString("FechaCita");
                    fila[6] = rs.getString("Descripcion");
                    

                    modelo.addRow(fila);

                
            }
            tabla.setModel(modelo);

        } catch (Exception e) {
            System.out.println("Error al extraer los datos de las tabals" + e.getMessage());
        }

    }
    

    public void actualizar(String nombre, String apellido, String direccion, String correo, String numeroContacto, String user, String pass, String cedula, String id) throws SQLException {
        try {
            conexion = Conexion.getConnection();
            sentencias = conexion.prepareStatement("UPDATE usuarios SET Nombre= "+"'"+nombre+"', "
                + "PrimerApellido= "+"'"+apellido+"', "
                + "Direccion= "+"'"+direccion+"', "
                + "Correo= "+"'"+correo+"', "
                + "NumeroContacto= "+"'"+numeroContacto+"', "
                + "Usuario= "+"'"+user+"', "
                + "Pass= "+"'"+pass+"', "
                + "Cedula= "+"'"+cedula+"'"
                + " where Id= " + id);
            if (conexion != null) 
                System.out.println("conexion exitosa");
            
            sentencias.executeUpdate();
            System.out.println("exito");
    

        } catch (Exception e) {
            System.out.println("Error al extraer los datos de las tabals" + e.getMessage());
        }
        finally{
            sentencias=null;
            conexion.close();
        }

    }
    
    public void actualizarCita(String idCliente , String idOdontologo, String valor, String fechaActual , String fechaCita , String descripcion) throws SQLException {
        try {
            conexion = Conexion.getConnection();
            sentencias = conexion.prepareStatement("UPDATE citas SET IdCliente= "+"'"+idCliente+"', "
                + "IdOdontologo= "+"'"+idOdontologo+"', "
                + "Precio= "+"'"+valor+"', "
                + "FechaGenerada= "+"'"+fechaActual+"', "
                + "FechaCita= "+"'"+fechaCita+"', "
                + "Descripcion= "+"'"+descripcion);
            if (conexion != null) 
                System.out.println("conexion exitosa");
            
            sentencias.executeUpdate();
            System.out.println("exito");
    

        } catch (Exception e) {
            System.out.println("Error al extraer los datos de las tablas" + e.getMessage());
        }
        finally{
            sentencias=null;
            conexion.close();
        }

    }
    
    
    
    public void eliminar(String user) {
        try {
            conexion = Conexion.getConnection();
            sentencias = conexion.prepareStatement("DELETE FROM usuarios WHERE Id= "+user);

            sentencias.executeUpdate();
            System.out.println("Exito");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
        
    }
    
    public void eliminarCita(String idCita){
        try {
            conexion = Conexion.getConnection();
            sentencias = conexion.prepareStatement("DELETE FROM citas WHERE Id= "+idCita);

            sentencias.executeUpdate();
            System.out.println("Exito");
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }

}
