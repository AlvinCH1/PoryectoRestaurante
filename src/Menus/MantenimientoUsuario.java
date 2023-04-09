package Menus;

import Clases.Usuarios;

import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List; 
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author drake
 */
public class MantenimientoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form MantenimientoUsuarios
     */
    public MantenimientoUsuario() {
        initComponents();
        SpinnerNumberModel spn = new SpinnerNumberModel();
        spn.setMaximum(1);
        spn.setMinimum(0);
        spnUsuarios.setModel(spn);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtLogin = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        spnUsuarios = new javax.swing.JSpinner();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtNombres = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtApellidos = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(560, 240));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(112, 145, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mantenimiento Usuario");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login:");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));

        txtLogin.setBackground(new java.awt.Color(112, 145, 255));
        txtLogin.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(255, 255, 255));
        txtLogin.setBorder(null);
        txtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLoginKeyReleased(evt);
            }
        });

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        pass.setBackground(new java.awt.Color(112, 145, 255));
        pass.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nivel de Acceso:");

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));

        spnUsuarios.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        spnUsuarios.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1, 1));

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombres:");

        txtNombres.setBackground(new java.awt.Color(112, 145, 255));
        txtNombres.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(255, 255, 255));
        txtNombres.setBorder(null);
        txtNombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombresKeyTyped(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setForeground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Apellidos:");

        txtApellidos.setBackground(new java.awt.Color(112, 145, 255));
        txtApellidos.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtApellidos.setForeground(new java.awt.Color(255, 255, 255));
        txtApellidos.setBorder(null);
        txtApellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidosKeyTyped(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator7.setForeground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Lucida Sans", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Correo");

        txtCorreo.setBackground(new java.awt.Color(112, 145, 255));
        txtCorreo.setFont(new java.awt.Font("Lucida Sans", 1, 14)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });

        txtEstado.setBackground(new java.awt.Color(112, 145, 255));
        txtEstado.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(255, 255, 255));
        txtEstado.setBorder(null);

        btnGuardar.setBackground(new java.awt.Color(0, 255, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(255, 153, 0));
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modoficar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 0));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado:");

        jSeparator8.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator8.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(48, 48, 48)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(239, Short.MAX_VALUE))
            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 835, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(490, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        Grabar();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombresKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == KeyEvent.VK_SPACE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombresKeyTyped

    private void txtApellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidosKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c == KeyEvent.VK_SPACE)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidosKeyTyped

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCorreoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == '@') || (c == '_') || (c == '.') || Character.isISOControl(c)))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtCorreoKeyTyped

    private void txtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLoginKeyReleased
        // TODO add your handling code here:
        File arch = new File("Usuarios.txt");
        if (!arch.exists())
        {
            try
            {
                arch.createNewFile();
            } catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Error de archivo");
            }
        }

        txtEstado.setText("");
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        pass.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        spnUsuarios.setValue(0);

        List<Usuarios> ListaUsuarios = obtenerListaUsuarios();
     
        for (Usuarios usuario : ListaUsuarios)
        {
            if (txtLogin.getText().equals(usuario.getLogin_Usuario()))
            {
                pass.setText(usuario.getPass_Usuario());
                spnUsuarios.setValue(usuario.getNivel_Acceso());
                txtNombres.setText(usuario.getNombre_Usuario());
                txtApellidos.setText(usuario.getApllido_Usuario());
                txtCorreo.setText(usuario.getCorreo_Usuario());

                btnGuardar.setEnabled(false);
                btnEliminar.setEnabled(true);
                btnModificar.setEnabled(true);
                txtEstado.setText("Este Usuario ya existe");
                break;
            }
            
            if(("".equals(txtLogin.getText()))){
                txtEstado.setText("");
            }else{
                txtEstado.setText("Este Usuario no existe");
            }
            
        }
    }//GEN-LAST:event_txtLoginKeyReleased

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        modificarDatos();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        eliminarDatos();
    }//GEN-LAST:event_btnEliminarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(MantenimientoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() ->
        {
            new MantenimientoUsuario().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JPasswordField pass;
    private javax.swing.JSpinner spnUsuarios;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtNombres;
    // End of variables declaration//GEN-END:variables


    public boolean validarCampos(JTextField[] campos) {
        for (int i = 0; i < campos.length; i++)
        {
            String text = campos[i].getText();
            if (text.equals(""))
            {
                return false; //Si el campo está vacío, retorna false inmediatamente
            }
        }
        return true; //Si no encontró campos vacíos, retorna true
    }
    
    public void Grabar(){
        JTextField[] campos ={txtLogin, pass, txtNombres, txtApellidos, txtCorreo};
        if (validarCampos(campos))
        {
            File arch = new File("Usuarios.txt");

            try
            {
                if (!arch.exists())
                {
                    arch.createNewFile();
                }
                BufferedWriter bw = new BufferedWriter(new FileWriter(arch, true));
                Usuarios p1 = new Usuarios();

                p1.setLogin_Usuario(txtLogin.getText());
                p1.setPass_Usuario(pass.getText());
                p1.setNivel_Acceso((int) spnUsuarios.getValue());
                p1.setNombre_Usuario(txtNombres.getText());
                p1.setApllido_Usuario(txtApellidos.getText());
                p1.setCorreo_Usuario(txtCorreo.getText());

                try
                {
                    bw.write(p1.getLogin_Usuario() + "; "
                            + p1.getPass_Usuario() + "; "
                            + String.valueOf(p1.getNivel_Acceso()) + "; "
                            + p1.getNombre_Usuario() + "; "
                            + p1.getApllido_Usuario() + "; "
                            + p1.getCorreo_Usuario() + "\n");

                    bw.close();
                    txtLogin.setText("");
                    pass.setText("");
                    txtNombres.setText("");
                    txtApellidos.setText("");
                    txtCorreo.setText("");
                    spnUsuarios.setValue(0);
                } catch (FileNotFoundException ex)
                {
                  ex.printStackTrace();
                  JOptionPane.showMessageDialog(null, "Error Archivo no encontrado");
                }

            } catch (IOException ex)
            {
                JOptionPane.showMessageDialog(null, "Error de archivo");
                ex.printStackTrace();
            }
            
            JOptionPane.showMessageDialog(null, "Usuario Guardado correctamente.");
        } else
        {
            JOptionPane.showMessageDialog(null, "Llenar todos los campos obligatorios");
        }
        

    }
    
    public boolean contieneLetra(String cadena) {
        for (int i = 0; i < cadena.length(); i++)
        {
            char c = cadena.charAt(i);
            if (Character.isLetter(c))
            {
                return true;
            }
        }
        return false;
    }
    
    public static List<Usuarios> obtenerListaUsuarios() {
        List<Usuarios> listaUsuarios = new ArrayList<>();
        try
        {
            FileReader reader = new FileReader("Usuarios.txt");
            BufferedReader br = new BufferedReader(reader); 

            String linea;
            while ((linea = br.readLine()) != null)
            {
                String[] datos = linea.split("; ");
                Usuarios usuario = new Usuarios();
                usuario.setLogin_Usuario(datos[0]);
                usuario.setPass_Usuario(datos[1]);
                usuario.setNivel_Acceso(Integer.parseInt(datos[2].trim()));
                usuario.setNombre_Usuario(datos[3]);
                usuario.setApllido_Usuario(datos[4]);
                usuario.setCorreo_Usuario(datos[5]);
                listaUsuarios.add(usuario);
            }

            br.close();
            reader.close();
        } catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(null, "Archivo No Encontrado");
            ex.printStackTrace();
        } catch (IOException ex){
            JOptionPane.showMessageDialog(null, "Error de Archvo");
            ex.printStackTrace();
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Error");
            ex.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException ex){
             eliminarLineaEnBlanco("Usuarios.txt");
            JOptionPane.showMessageDialog(null, "Error, su archivo tenia una linea en blanco.\nEsto se  ha sido solucionado ");
        }
        return listaUsuarios;
    }
    
    public void modificarDatos(){
        JTextField[] campos ={txtLogin, pass, txtNombres, txtApellidos, txtCorreo};
        if (validarCampos(campos)){
                   // Obtener datos de los campos
        
        String login = txtLogin.getText();
        String loginAnterior = login;
        String pass = this.pass.getText();
        String nombres = txtNombres.getText();
        String apellidos = txtApellidos.getText();
        String correo = txtCorreo.getText();
        int nivelAcceso = (int) spnUsuarios.getValue();

        // Crear objeto Usuarios con los datos modificados
        Usuarios usuarioModificado = new Usuarios();
        usuarioModificado.setLogin_Usuario(login);
        usuarioModificado.setPass_Usuario(pass);
        usuarioModificado.setNivel_Acceso(nivelAcceso);
        usuarioModificado.setNombre_Usuario(nombres);
        usuarioModificado.setApllido_Usuario(apellidos);
        usuarioModificado.setCorreo_Usuario(correo);

        // Obtener la lista de usuarios
        List<Usuarios> listaUsuarios = obtenerListaUsuarios();

        // Modificar el usuario correspondiente en la lista
        for (int i = 0; i < listaUsuarios.size(); i++)
        {
            Usuarios usuario = listaUsuarios.get(i);
            if (usuario.getLogin_Usuario().equals(loginAnterior))
            {
                listaUsuarios.set(i, usuarioModificado);
                break;
            }
        }

        // Guardar la lista de usuarios modificada en el archivo
        try
        {
            FileWriter writer = new FileWriter("Usuarios.txt");
            for (Usuarios usuario : listaUsuarios)
            {
                writer.write(usuario.getLogin_Usuario() + "; " + usuario.getPass_Usuario() + "; " + usuario.getNivel_Acceso() + "; "
                        + usuario.getNombre_Usuario() + "; " + usuario.getApllido_Usuario() + "; " + usuario.getCorreo_Usuario() + "\n");
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "Usuario modificado correctamente.");
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al modificar usuario.");
            ex.printStackTrace();
        }
        }else{
            JOptionPane.showMessageDialog(null, "Llenar todos los campos obligatorios");
        }
        
        txtLogin.setText("");
        txtEstado.setText("");
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        pass.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        spnUsuarios.setValue(0);
        
    }
    
    public void eliminarDatos(){
        // Obtener el login del usuario que se desea eliminar
        String login = txtLogin.getText();

        // Obtener la lista de usuarios
        List<Usuarios> listaUsuarios = obtenerListaUsuarios();

        // Buscar el usuario correspondiente y eliminarlo
        for (int i = 0; i < listaUsuarios.size(); i++)
        {
            Usuarios usuario = listaUsuarios.get(i);
            if (usuario.getLogin_Usuario().equals(login))
            {
                listaUsuarios.remove(i);
                break;
            }
        }

        // Guardar la lista de usuarios modificada en el archivo
        try
        {
            FileWriter writer = new FileWriter("Usuarios.txt");
            for (Usuarios usuario : listaUsuarios)
            {
                writer.write(usuario.getLogin_Usuario() + "; " + usuario.getPass_Usuario() + "; " + usuario.getNivel_Acceso() + "; "
                        + usuario.getNombre_Usuario() + "; " + usuario.getApllido_Usuario() + "; " + usuario.getCorreo_Usuario() + "\n");
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente.");
        } catch (IOException ex)
        {
            JOptionPane.showMessageDialog(null, "Error al eliminar usuario.");
            ex.printStackTrace();
        }
        
        txtLogin.setText("");
        txtEstado.setText("");
        btnGuardar.setEnabled(true);
        btnEliminar.setEnabled(false);
        btnModificar.setEnabled(false);
        pass.setText("");
        txtNombres.setText("");
        txtApellidos.setText("");
        txtCorreo.setText("");
        spnUsuarios.setValue(0);
        
    }
    
    //Metodo Para Eliminar
    public static void eliminarLineaEnBlanco(String rutaArchivo) {
        try
        {
            // Leer el contenido del archivo
            List<String> lineas = Files.readAllLines(Paths.get(rutaArchivo));

            // Eliminar las líneas en blanco
            lineas.removeIf(linea -> linea.trim().isEmpty());

            // Escribir el contenido actualizado en el archivo
            Files.write(Paths.get(rutaArchivo), lineas, StandardCharsets.UTF_8);

        } catch (IOException ex)
        {
            ex.printStackTrace();
        }
    }

}
