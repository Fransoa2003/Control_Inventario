
import javax.swing.JOptionPane;
<<<<<<< HEAD



=======
import Modelos.Usuarios;
>>>>>>> f995912b64e0b74e50302967d0d2981f13c85508
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Jesus Vazquez
 */
public class Register_user extends javax.swing.JFrame {

    /**
     * Creates new form Register_user
     */
    public Register_user() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNameUser = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtEmailUser = new javax.swing.JTextField();
        lblEmailUser = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        lblPasswordUser = new javax.swing.JLabel();
        txtPhoneUser = new javax.swing.JTextField();
        lblGanderUser = new javax.swing.JLabel();
        lblPhoneUser = new javax.swing.JLabel();
        comboGander = new javax.swing.JComboBox<>();
        lblAge = new javax.swing.JLabel();
        txtEge = new javax.swing.JTextField();
        lblRole = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();
        txtRfcUser = new javax.swing.JTextField();
        btnAddSignUp = new java.awt.Label();
        jLabel2 = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        lblRfcUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Img_user_SignUp.png"))); // NOI18N
        jLabel1.setText("Sign Up");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 70));

        txtNameUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtNameUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtNameUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 180, 290, -1));

        lblName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name:");
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, 30));

        lblLastName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblLastName.setForeground(new java.awt.Color(255, 255, 255));
        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last name:");
        jPanel1.add(lblLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 90, 30));

        txtLastName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtLastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 290, -1));

        txtEmailUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtEmailUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtEmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 290, -1));

        lblEmailUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblEmailUser.setForeground(new java.awt.Color(255, 255, 255));
        lblEmailUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailUser.setText("Email:");
        jPanel1.add(lblEmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 80, 30));

        txtPassword.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 290, -1));

        lblPasswordUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPasswordUser.setForeground(new java.awt.Color(255, 255, 255));
        lblPasswordUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPasswordUser.setText("Password:");
        jPanel1.add(lblPasswordUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 90, 30));

        txtPhoneUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtPhoneUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtPhoneUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 120, -1));

        lblGanderUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblGanderUser.setForeground(new java.awt.Color(255, 255, 255));
        lblGanderUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGanderUser.setText("Gender:");
        jPanel1.add(lblGanderUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 70, 30));

        lblPhoneUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblPhoneUser.setForeground(new java.awt.Color(255, 255, 255));
        lblPhoneUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPhoneUser.setText("Phone:");
        jPanel1.add(lblPhoneUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 90, 30));

        comboGander.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboGander.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        comboGander.setSelectedIndex(-1);
        jPanel1.add(comboGander, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, -1, -1));

        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblAge.setForeground(new java.awt.Color(255, 255, 255));
        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");
        jPanel1.add(lblAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 90, 30));

        txtEge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtEge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEgeActionPerformed(evt);
            }
        });
        jPanel1.add(txtEge, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 50, -1));

        lblRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblRole.setForeground(new java.awt.Color(255, 255, 255));
        lblRole.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRole.setText("Role:");
        jPanel1.add(lblRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 50, 30));

        comboRole.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Employee" }));
        comboRole.setSelectedIndex(-1);
        jPanel1.add(comboRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 150, -1));

        txtRfcUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtRfcUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRfcUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtRfcUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 290, -1));

        btnAddSignUp.setAlignment(java.awt.Label.CENTER);
        btnAddSignUp.setBackground(new java.awt.Color(153, 255, 153));
        btnAddSignUp.setFont(new java.awt.Font("Cambria", 0, 24)); // NOI18N
        btnAddSignUp.setText("Add");
        btnAddSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddSignUpMouseClicked(evt);
            }
        });
        jPanel1.add(btnAddSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 430, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/img_return.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, -1, -1));

        lblUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblUser.setForeground(new java.awt.Color(255, 255, 255));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblUser.setText("User:");
        jPanel1.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, -1, 30));

        txtUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel1.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 290, -1));

        lblRfcUser.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N
        lblRfcUser.setForeground(new java.awt.Color(255, 255, 255));
        lblRfcUser.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRfcUser.setText("RFC:");
        jPanel1.add(lblRfcUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameUserActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtEmailUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailUserActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPhoneUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneUserActionPerformed

    private void txtEgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEgeActionPerformed

    private void txtRfcUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRfcUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRfcUserActionPerformed

    private void btnAddSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddSignUpMouseClicked
        //Instanciamos nuevos objetos
        Usuarios usuario = new Usuarios();
        validaciones vali = new validaciones();
        //Obtenemos los datos del formulario
        String strRfc = txtRfcUser.getText();
        String strName = txtNameUser.getText();
        String strLastName = txtLastName.getText();
        String strUser = txtUser.getText();
        String strEge = txtEge.getText();
        String strPass = txtPassword.getText();
        String strEmail = txtEmailUser.getText();
        String strPhone = txtPhoneUser.getText();
        
        int posRole = comboRole.getSelectedIndex();
        int posGender = comboGander.getSelectedIndex();
        
        if(!vali.valRfc(strRfc)){
            JOptionPane.showMessageDialog(null, "El campo Rfc solo acepta caracteres y numeros");
        }else if(!vali.valUser(strUser)){
            JOptionPane.showMessageDialog(null, "El campo User solo acepta caracteres minusculas");
        }else if(!vali.valName(strName)){
            JOptionPane.showMessageDialog(null, "El campo Name solo acepta caracteres");
        }else if(!vali.valName(strLastName)){
            JOptionPane.showMessageDialog(null, "El campo Last Name solo acepta caracteres");
        }else if(!vali.valNumbers(strEge)){
            JOptionPane.showMessageDialog(null, "El campo Age solo acepta caracteres numericos");
        }else if(!vali.validarCorreo(strEmail)){
            JOptionPane.showMessageDialog(null, "El campo Email contiene una estructura invalida");
        }else if(!vali.valPassword(strPass)){
            JOptionPane.showMessageDialog(null, "El campo Password contiene valores incompatibles");
        }else if(!(vali.valNumbers(strPhone) && strPhone.length() == 10)){
            JOptionPane.showMessageDialog(null, "El campo Phone contiene valores incompatibles");
        }else if(posRole == -1){
            JOptionPane.showMessageDialog(null, "Selecciona algun Rol");
        }else if(posGender == -1){
            JOptionPane.showMessageDialog(null, "Selecciona algun Genero");
        }else{
            
            String strRole = comboRole.getSelectedItem().toString();
            String strGander = comboGander.getSelectedItem().toString();
            
            //Intriducimos los datos a un array para hacer el Query de la base de datos
        
            String [] dataUser = new String[]{
                strRfc,
                strUser,
                strName,
                strLastName,
                strRole,
                strEge,
                strPass,
                strGander,
                strEmail,
                strPhone
            };
            
<<<<<<< HEAD
            Usuarios usuarioBuscado = usuario.obtenerUsuario(strRfc);
=======
            Usuarios usuarioBuscado = usuario.obtenerUsuarioBusqueda(strUser);
>>>>>>> f995912b64e0b74e50302967d0d2981f13c85508
            if(!(usuarioBuscado.getUsuario() != null)){
                if(usuario.crearUsuario(dataUser)){
                    JOptionPane.showMessageDialog(null, "Usuario " + strUser + " creado de manera exitosa.");
                    
                    login log = new login();
                    log.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Ocurrio un error al intentar crear el usuario " + strUser);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El usuario " + strUser + " ya existe");
            }
            
        }
    }//GEN-LAST:event_btnAddSignUpMouseClicked

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    /**
     * @param args the command line arguments
     */
    public void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Register_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register_user.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register_user().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label btnAddSignUp;
    private javax.swing.JComboBox<String> comboGander;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblEmailUser;
    private javax.swing.JLabel lblGanderUser;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPasswordUser;
    private javax.swing.JLabel lblPhoneUser;
    private javax.swing.JLabel lblRfcUser;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUser;
    private javax.swing.JTextField txtEge;
    private javax.swing.JTextField txtEmailUser;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtNameUser;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneUser;
    private javax.swing.JTextField txtRfcUser;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
