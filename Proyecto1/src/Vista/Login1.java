/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.LogicaUsuario;
import Modelo.Usuario;
import VistaAdmin.CrearUsuario;
import VistaAdmin.HomeAdmin;
import VistaOdon.HomeOdon;
import VistaPaciente.HomePaciente;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import rojeru_san.complementos.RSUtilities;

/**
 *
 * @author diego
 */
public class Login1 extends javax.swing.JFrame {

    private Login login;
    private HomeAdmin homeAdmin;
    private HomeOdon homeOdon;
    private HomePaciente homePaciente;
    private CrearUsuario crearUsuario;
    
    
    public Login1() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setName("pricipalJFrame");
        setTitle("Proyecto");
        setResizable(false);
        pack(); 
        setLocationRelativeTo(null);//mirat
        iniciar(); 
    }
    public Login1(Login1 login){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setName("Nuevo Usuario");
        setTitle("Fruithz");
        NuevoUsuario();
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login1().setVisible(true);
            }
        });
    }
    private void iniciar() {
        login = new Login(this);
        login.setVisible(true);
        add(login);
        pack();
        setLocationRelativeTo(null);  
    }
    public void irAHome(JPanel jPanel) {
        remove(jPanel);
        homeAdmin = new HomeAdmin(this);
        homeAdmin.setVisible(true);
        add(homeAdmin);
        pack();
        setLocationRelativeTo(null);         
    }
    public void regresarALogin(JPanel jPanel){
        remove(jPanel);
        login = new Login(this);
        login.setVisible(true);
        add(login);
        pack();
        setLocationRelativeTo(null);
    }
    public void irAHomeOdon(JPanel jPanel) {
        remove(jPanel);
        homeOdon = new HomeOdon(this);
        homeOdon.setVisible(true);
        add(homeOdon);
        pack();
        setLocationRelativeTo(null);         
    }
    public void irAHomePaciente(JPanel jPanel) {
        remove(jPanel);
        homePaciente = new HomePaciente(this);
        homePaciente.setVisible(true);
        add(homePaciente);
        pack();
        setLocationRelativeTo(null);         
    }
    public void NuevoUsuario(){
        crearUsuario = new CrearUsuario(this);
        crearUsuario.setVisible(true);
        add(crearUsuario);
        pack();
        setLocationRelativeTo(null);
    }
    
   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

      
}


