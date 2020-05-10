/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaOdon;

import Controlador.LogicaUsuario;
import Vista.Login1;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import rojerusan.RSPanelsSlider;
import rojerusan.RSTableMetro1;

/**
 *
 * @author walter
 */
public class HomeOdon extends javax.swing.JPanel {

    /**
     * Creates new form HomeOdon
     */
    int filaSelected;
    String idCIta, idOdontologo, idPaciente, valor,fechaActual,fechaCita,descripcion;
    LogicaUsuario logica = new LogicaUsuario();
    private Login1 login;
    public HomeOdon(Login1 login) {
        initComponents();
        this.login=login;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panele = new rojeru_san.rspanel.RSPanelGradiente();
        boton_salir = new RSMaterialComponent.RSButtonMaterialIconUno();
        boton_home = new RSMaterialComponent.RSButtonMaterialIconUno();
        boton_pacientes = new RSMaterialComponent.RSButtonMaterialIconUno();
        boton_perfil = new RSMaterialComponent.RSButtonMaterialIconUno();
        jSeparator1 = new javax.swing.JSeparator();
        boton_citas = new RSMaterialComponent.RSButtonMaterialIconUno();
        panel = new rojerusan.RSPanelsSlider();
        panelHome = new javax.swing.JPanel();
        rSCalendar2 = new rojeru_san.rsdate.RSCalendar();
        jPanel2 = new javax.swing.JPanel();
        rSLabelHora1 = new rojeru_san.rsdate.RSLabelHora();
        jLabel1 = new javax.swing.JLabel();
        panelPaci = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        rSButtonMaterialIconUno7 = new RSMaterialComponent.RSButtonMaterialIconUno();
        modPaci = new RSMaterialComponent.RSButtonMaterialIconUno();
        jPanel7 = new javax.swing.JPanel();
        rSLabelHora4 = new rojeru_san.rsdate.RSLabelHora();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablePaci = new rojerusan.RSTableMetro1();
        persona1 = new necesario.TextField();
        paneCitas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        idCita = new javax.swing.JTextField();
        IdPaciente = new javax.swing.JTextField();
        Valor = new javax.swing.JTextField();
        FechaCita = new javax.swing.JTextField();
        fechaAsignacion = new javax.swing.JTextField();
        IdOdontologo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        observacion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaCitas = new rojerusan.RSTableMetro1();
        eliminar = new RSMaterialComponent.RSButtonMaterialUno();
        agregar = new RSMaterialComponent.RSButtonMaterialUno();
        editar = new RSMaterialComponent.RSButtonMaterialUno();

        boton_salir.setBackground(new java.awt.Color(0, 37, 64));
        boton_salir.setText("Salir");
        boton_salir.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXIT_TO_APP);
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        boton_home.setBackground(new java.awt.Color(0, 37, 64));
        boton_home.setText("Home");
        boton_home.setToolTipText("");
        boton_home.setAutoscrolls(true);
        boton_home.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        boton_home.setSelected(true);
        boton_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_homeActionPerformed(evt);
            }
        });

        boton_pacientes.setBackground(new java.awt.Color(0, 37, 64));
        boton_pacientes.setText("Pacientes");
        boton_pacientes.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        boton_pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_pacientesActionPerformed(evt);
            }
        });

        boton_perfil.setBackground(new java.awt.Color(0, 37, 64));
        boton_perfil.setText("Perfil");
        boton_perfil.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        boton_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_perfilActionPerformed(evt);
            }
        });

        boton_citas.setBackground(new java.awt.Color(0, 37, 64));
        boton_citas.setText("Citas");
        boton_citas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.PERSON);
        boton_citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_citasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneleLayout = new javax.swing.GroupLayout(panele);
        panele.setLayout(paneleLayout);
        paneleLayout.setHorizontalGroup(
            paneleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_home, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
            .addComponent(boton_pacientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(boton_perfil, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(boton_salir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(jSeparator1)
            .addComponent(boton_citas, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        paneleLayout.setVerticalGroup(
            paneleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneleLayout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addComponent(boton_home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(boton_pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(boton_citas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelHome.setBackground(new java.awt.Color(255, 255, 255));
        panelHome.setName("panelHome"); // NOI18N

        jPanel2.setBackground(new java.awt.Color(0, 112, 192));
        jPanel2.setForeground(new java.awt.Color(0, 112, 192));
        jPanel2.setToolTipText("");

        rSLabelHora1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelHomeLayout = new javax.swing.GroupLayout(panelHome);
        panelHome.setLayout(panelHomeLayout);
        panelHomeLayout.setHorizontalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );
        panelHomeLayout.setVerticalGroup(
            panelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHomeLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rSCalendar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panel.add(panelHome, "card2");

        panelPaci.setName("panelPaci"); // NOI18N

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        rSButtonMaterialIconUno7.setText("Agregar");
        rSButtonMaterialIconUno7.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD_CIRCLE_OUTLINE);
        rSButtonMaterialIconUno7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rSButtonMaterialIconUno7ActionPerformed(evt);
            }
        });

        modPaci.setText("Guardar");
        modPaci.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CACHED);
        modPaci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modPaciActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(0, 112, 192));

        rSLabelHora4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pacientes");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rSLabelHora4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rSLabelHora4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        tablePaci.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido(s)", "Dirección", "Correo", "Contacto", "Usuario", "Password", "Cedula", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, true, true, true, true, true, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablePaci.setName("tablePaci"); // NOI18N
        tablePaci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablePaciMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tablePaci);

        persona1.setEditable(false);
        persona1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        persona1.setPlaceholder("");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addComponent(persona1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(rSButtonMaterialIconUno7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modPaci, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addComponent(jScrollPane5)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rSButtonMaterialIconUno7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modPaci, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(persona1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelPaciLayout = new javax.swing.GroupLayout(panelPaci);
        panelPaci.setLayout(panelPaciLayout);
        panelPaciLayout.setHorizontalGroup(
            panelPaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPaciLayout.setVerticalGroup(
            panelPaciLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel.add(panelPaci, "card5");

        paneCitas.setBackground(new java.awt.Color(255, 255, 255));
        paneCitas.setName("paneCitas"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 112, 192));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Citas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        observacion.setColumns(20);
        observacion.setRows(5);
        jScrollPane1.setViewportView(observacion);

        tablaCitas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaCitas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCitasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaCitas);

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        agregar.setText("Agregar");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout paneCitasLayout = new javax.swing.GroupLayout(paneCitas);
        paneCitas.setLayout(paneCitasLayout);
        paneCitasLayout.setHorizontalGroup(
            paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneCitasLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCitasLayout.createSequentialGroup()
                        .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(IdPaciente)
                            .addComponent(idCita, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Valor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
                            .addComponent(IdOdontologo))
                        .addGap(51, 51, 51)
                        .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(paneCitasLayout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addGap(18, 18, 18)
                        .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))))
        );
        paneCitasLayout.setVerticalGroup(
            paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCitasLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCitasLayout.createSequentialGroup()
                        .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paneCitasLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(FechaCita, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paneCitasLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(idCita, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IdOdontologo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15)
                        .addComponent(IdPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paneCitasLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(paneCitasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneCitasLayout.createSequentialGroup()
                        .addComponent(agregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        panel.add(paneCitas, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panele, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panele, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 644, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        login.regresarALogin(this);
    }//GEN-LAST:event_boton_salirActionPerformed

    private void boton_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_homeActionPerformed
        this.boton_home.setSelected(true);
        this.boton_pacientes.setSelected(false);
        this.boton_perfil.setSelected(false);
        this.boton_citas.setSelected(false);

        panel.setPanelSlider(1, panelHome, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_boton_homeActionPerformed

    private void boton_pacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_pacientesActionPerformed

        this.boton_home.setSelected(false);
        this.boton_pacientes.setSelected(true);
        this.boton_perfil.setSelected(false);
        this.boton_citas.setSelected(false);
        actualizar("Cliente", tablePaci);
        panel.setPanelSlider(1, panelPaci, RSPanelsSlider.DIRECT.LEFT);

    }//GEN-LAST:event_boton_pacientesActionPerformed

    private void boton_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_perfilActionPerformed
        this.boton_home.setSelected(false);
        this.boton_pacientes.setSelected(false);
        this.boton_perfil.setSelected(true);
        this.boton_citas.setSelected(false);

        panel.setPanelSlider(1, panelHome, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_boton_perfilActionPerformed

    private void boton_citasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_citasActionPerformed
        this.boton_home.setSelected(false);
        this.boton_pacientes.setSelected(false);
        this.boton_perfil.setSelected(false);
        this.boton_citas.setSelected(true);
        actualizarCita(tablaCitas);
        panel.setPanelSlider(1, paneCitas, RSPanelsSlider.DIRECT.LEFT);
    }//GEN-LAST:event_boton_citasActionPerformed

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        // TODO add your handling code here:
        idCIta= idCita.getText();
        idOdontologo= IdOdontologo.getText();
        idPaciente= IdPaciente.getText();
        valor= Valor.getText();
        fechaActual= fechaAsignacion.getText();
        fechaCita= FechaCita.getText();
        descripcion = observacion.getText();
        
        if (idCIta.equals("") || idOdontologo.equals("") || idPaciente.equals("") || valor.equals("") || fechaActual.equals("") || fechaCita.equals("")) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");
        }else{
            logica.crearCita(idCIta, idOdontologo, idPaciente, valor, fechaCita, fechaActual, descripcion);
            actualizarCita(tablaCitas);
        }
        
    }//GEN-LAST:event_agregarActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
        
        modificarCita(tablaCitas);
        actualizarCita(tablaCitas);

    }//GEN-LAST:event_editarActionPerformed

    private void tablePaciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablePaciMouseClicked
        filaSelected = tablePaci.rowAtPoint(evt.getPoint());
        persona1.setText(tablePaci.getValueAt(filaSelected, 5).toString());
    }//GEN-LAST:event_tablePaciMouseClicked

    private void modPaciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modPaciActionPerformed
        if(!persona1.getText().equals(""))
        modificar(tablePaci);
        actualizar("Cliente",tablePaci);
    }//GEN-LAST:event_modPaciActionPerformed

    private void rSButtonMaterialIconUno7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rSButtonMaterialIconUno7ActionPerformed
        new Login1(login).setVisible(true);
    }//GEN-LAST:event_rSButtonMaterialIconUno7ActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        borrarCita(tablaCitas.getValueAt(filaSelected, 0).toString());
        actualizarCita(tablaCitas);
        
    }//GEN-LAST:event_eliminarActionPerformed

    private void tablaCitasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCitasMouseClicked
        // TODO add your handling code here:
        
        filaSelected = tablaCitas.rowAtPoint(evt.getPoint());
        idCita.setText(tablaCitas.getValueAt(filaSelected,0).toString());
        IdOdontologo.setText(tablaCitas.getValueAt(filaSelected,1).toString());
        IdPaciente.setText(tablaCitas.getValueAt(filaSelected,2).toString());
        Valor.setText(tablaCitas.getValueAt(filaSelected,3).toString());
        FechaCita.setText(tablaCitas.getValueAt(filaSelected,4).toString());
        fechaAsignacion.setText(tablaCitas.getValueAt(filaSelected,5).toString());
        observacion.setText(tablaCitas.getValueAt(filaSelected,6).toString());
    }//GEN-LAST:event_tablaCitasMouseClicked
    
    public void modificarCita(RSTableMetro1 tabla){
        
        
        try {
            logica.actualizarCita(tabla.getValueAt(filaSelected, 0).toString(),
                tabla.getValueAt(filaSelected, 1).toString(),
                tabla.getValueAt(filaSelected, 2).toString(),
                tabla.getValueAt(filaSelected, 3).toString(),
                tabla.getValueAt(filaSelected, 4).toString(),
                tabla.getValueAt(filaSelected, 5).toString());
        } catch (SQLException ex) {
            Logger.getLogger(HomeOdon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void borrarCita(String id){
        
        logica.eliminarCita(id);
    }
    
    public void actualizar(String tipo, RSTableMetro1 tabla){
        logica.consultaTabla(tabla,tipo);
    }
    
    public void actualizarCita(RSTableMetro1 tabla){
        try {
            logica.consultaTablaCitas(tabla);
        } catch (SQLException ex) {
            Logger.getLogger(HomeOdon.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void modificar(RSTableMetro1 tabla){

        try {
            logica.actualizar(tabla.getValueAt(filaSelected, 0).toString(),
                tabla.getValueAt(filaSelected, 1).toString(),
                tabla.getValueAt(filaSelected, 2).toString(),
                tabla.getValueAt(filaSelected, 3).toString(),
                tabla.getValueAt(filaSelected, 4).toString(),
                tabla.getValueAt(filaSelected, 5).toString(),
                tabla.getValueAt(filaSelected, 6).toString(),
                tabla.getValueAt(filaSelected, 7).toString(),
                tabla.getValueAt(filaSelected, 8).toString());
        } catch (SQLException ex) {
            Logger.getLogger(HomeOdon.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField FechaCita;
    private javax.swing.JTextField IdOdontologo;
    private javax.swing.JTextField IdPaciente;
    private javax.swing.JTextField Valor;
    private RSMaterialComponent.RSButtonMaterialUno agregar;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_citas;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_home;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_pacientes;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_perfil;
    private RSMaterialComponent.RSButtonMaterialIconUno boton_salir;
    private RSMaterialComponent.RSButtonMaterialUno editar;
    private RSMaterialComponent.RSButtonMaterialUno eliminar;
    private javax.swing.JTextField fechaAsignacion;
    private javax.swing.JTextField idCita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private RSMaterialComponent.RSButtonMaterialIconUno modPaci;
    private javax.swing.JTextArea observacion;
    private javax.swing.JPanel paneCitas;
    private rojerusan.RSPanelsSlider panel;
    private javax.swing.JPanel panelHome;
    private javax.swing.JPanel panelPaci;
    private rojeru_san.rspanel.RSPanelGradiente panele;
    private necesario.TextField persona1;
    private RSMaterialComponent.RSButtonMaterialIconUno rSButtonMaterialIconUno7;
    private rojeru_san.rsdate.RSCalendar rSCalendar2;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora1;
    private rojeru_san.rsdate.RSLabelHora rSLabelHora4;
    private rojerusan.RSTableMetro1 tablaCitas;
    private rojerusan.RSTableMetro1 tablePaci;
    // End of variables declaration//GEN-END:variables
}
