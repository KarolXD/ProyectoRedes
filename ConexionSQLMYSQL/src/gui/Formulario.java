/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import data.DatabaseMYSQL;
import static data.DatabaseMYSQL.PASSWORD;
import static data.DatabaseMYSQL.URL;
import static data.DatabaseMYSQL.USER;
import data.DatabaseSQL;
import static gui.Formulario.age;
import static gui.Formulario.card;
import static gui.Formulario.firstname;
import static gui.Formulario.gender;
import static gui.Formulario.lastname;
import static gui.Formulario.nombre;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author mgkar
 */
public class Formulario extends javax.swing.JFrame {

    PreparedStatement ps, ps2;
    ResultSet resulset1, resultset2;
    public static int res, res2;
 
    
    public Formulario() {
       
        initComponents();

        
       
 
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        consult = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        card = new javax.swing.JTextField();
        SQLTOMYSQL = new javax.swing.JButton();
        MYSQLTOSQL = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        repeat = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel2.setText("Nombre.");

        save.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_ui_58_3556100.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_icons_update_1564533.png"))); // NOI18N
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_ic_delete_48px_3669361 (1).png"))); // NOI18N
        delete.setText("delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        consult.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        consult.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_67_111124 (1).png"))); // NOI18N
        consult.setText("consult");
        consult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel3.setText("FirstName.");

        jLabel4.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel4.setText("LastName.");

        jLabel5.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel5.setText("Age.");

        jLabel6.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel6.setText("Gender.");

        gender.setFont(new java.awt.Font("Gabriola", 3, 14)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel7.setText("Card.");

        SQLTOMYSQL.setFont(new java.awt.Font("Gabriola", 3, 14)); // NOI18N
        SQLTOMYSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_Save_10594.png"))); // NOI18N
        SQLTOMYSQL.setText("INSERT...STAR");
        SQLTOMYSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SQLTOMYSQLActionPerformed(evt);
            }
        });

        MYSQLTOSQL.setFont(new java.awt.Font("Gabriola", 3, 14)); // NOI18N
        MYSQLTOSQL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_Save_10594.png"))); // NOI18N
        MYSQLTOSQL.setText("STOP");
        MYSQLTOSQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MYSQLTOSQLActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Gabriola", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_icons_update_1564533.png"))); // NOI18N
        jButton2.setText("Update");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Gabriola", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_icons_update_1564533.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        repeat.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel8.setText("SQL TO MYSQL");

        jLabel9.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel9.setText("MYSQL TO SQL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(update)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel7)))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(age)
                                    .addComponent(card)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(72, 72, 72)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(lastname))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                        .addComponent(nombre)))))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton2)
                                    .addComponent(jLabel8)
                                    .addComponent(SQLTOMYSQL))
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton3)
                                    .addComponent(MYSQLTOSQL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(17, 17, 17)))
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SQLTOMYSQL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MYSQLTOSQL, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(card, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(repeat, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3)
                            .addComponent(jButton2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consult, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        try {
 validateFields(nombre.getText(), firstname.getText(), lastname.getText(), (String) gender.getSelectedItem(), age.getText(), card.getText());
           
        } catch (IOException | ClassNotFoundException | NumberFormatException | SQLException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        try {

            Update c = new Update();
            c.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_updateActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        try {
          
            Delete delete = new Delete();
            delete.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void consultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultActionPerformed

        try {

            Consult consul = new Consult();
            consul.setVisible(true);

        } catch (Exception ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_consultActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
    
    }//GEN-LAST:event_genderActionPerformed
Timer t;
int count=0;
    private void SQLTOMYSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SQLTOMYSQLActionPerformed
        t= new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    mirroring_de_SQL_A_MYSQL();
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
                }
//                try {
//                    
//                    //  pruebaMYSQL_SQL();
//                    mirroringMysql_toSql();
//                }catch (ClassNotFoundException | SQLException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
        
//                try {
//                    mirroringUpdate_From_Sql_to_MySql();
//                } catch (SQLException | ClassNotFoundException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//                try {
//                   mirroringUpdate_From_Mysql_to_Sql();
//                } catch (SQLException | ClassNotFoundException ex) {
//                    Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
//                }
//              
            }
        });
        t.start();
        
        //  mirrorinfsql_A_mysqlPRUEBA();

    }//GEN-LAST:event_SQLTOMYSQLActionPerformed

    private void MYSQLTOSQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MYSQLTOSQLActionPerformed
        //   mirroringMysql_toSql();
        //    mirroring_de_SQL_A_MYSQL();
        t.stop();
    }//GEN-LAST:event_MYSQLTOSQLActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            
            mirroringUpdate_From_Sql_to_MySql();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            mirroringUpdate_From_Mysql_to_Sql();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Formulario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MYSQLTOSQL;
    private javax.swing.JButton SQLTOMYSQL;
    public static javax.swing.JTextField age;
    public static javax.swing.JTextField card;
    private javax.swing.JButton consult;
    private javax.swing.JButton delete;
    public static javax.swing.JTextField firstname;
    public static javax.swing.JComboBox<String> gender;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField lastname;
    public static javax.swing.JTextField nombre;
    private javax.swing.JLabel repeat;
    private javax.swing.JButton save;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    public boolean insert() {
        boolean condition = false;
        try {
            DatabaseMYSQL dataMysql = new DatabaseMYSQL() {
            };
            Connection conexionMysql = dataMysql.getConection();

            DatabaseSQL dataSql = new DatabaseSQL() {
            };
            Connection conexionSql = dataSql.getConexion();

            ps = conexionMysql.prepareStatement("INSERT INTO persona(nombre, apellido1, apellido2, sexo,edad, cedula)VALUES(?,?,?,?,?,?)");
            ps.setString(1, nombre.getText());
            ps.setString(2, firstname.getText());
            ps.setString(3, lastname.getText());
            ps.setString(4, (String) gender.getSelectedItem());
            ps.setInt(5, Integer.parseInt(age.getText()));
            ps.setInt(6, Integer.parseInt(card.getText()));

            res = ps.executeUpdate();

            ps2 = conexionSql.prepareStatement("INSERT INTO persona(nombre, apellido1, apellido2, sexo,edad, cedula)VALUES(?,?,?,?,?,?)");
            ps2.setString(1, nombre.getText());
            ps2.setString(2, firstname.getText());
            ps2.setString(3, lastname.getText());
            ps2.setString(4, (String) gender.getSelectedItem());
            ps2.setInt(5, Integer.parseInt(age.getText()));
            ps2.setInt(6, Integer.parseInt(card.getText()));

            res2 = ps2.executeUpdate();

            if (res > 0 && res2 > 0) {
                JOptionPane.showMessageDialog(null, "Person registed");
                condition = true;
            } else {
                System.out.println("");
                JOptionPane.showMessageDialog(null, "Person NOT  registed");
                condition = false;
            }
            conexionMysql.close();
            conexionSql.close();

        } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println(e); 
        }
        return condition;
    }

    public void validateFields(String name, String fname, String lname, String gender, String age, String card) throws ClassNotFoundException, SQLException, IOException {
        boolean condition = false;

        try {

            if ("".equals(name) || fname.equals("") || lname.equals("") || gender.equals("") || age.equals("") || card.equals("")) {//   ){
                JOptionPane.showMessageDialog(null, "Haz dejado campos vacios, completalos!");
                condition = false;

            } else if ((card != null && !isNumeric(card)) || (age != null && !isNumeric(age))) {

                JOptionPane.showMessageDialog(null, "Has ingresado un texto, en lugar de un numero");

            } else {
                insert();
            }

        } catch (HeadlessException e) {

        }
    }

    private static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }

    }


    public void mirroringUpdate_From_Sql_to_MySql() throws SQLException, ClassNotFoundException {
        try {

             Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TAREA3_B64543_B6587;user=karol;password=12345");
            //Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");
            Statement sqlSent = sqlCon.createStatement();
            ResultSet sqlRs = sqlSent.executeQuery("Select DISTINCT * from persona");//le puse DISTINCTZ

            Connection mysqlCon = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            Statement mysqlSent = mysqlCon.createStatement();
            ResultSet mysqlRs = mysqlSent.executeQuery("Select DISTINCT * from persona");

            //insertar de sql to mysql
            while (mysqlRs.next()) {

                int id_mysql = mysqlRs.getInt(6);

                while (sqlRs.next()) {

                    String Nombre_sql = sqlRs.getString(1);
                    String apellido_sql = sqlRs.getString(2);
                    String apellido2_sql = sqlRs.getString(3);
                    String gender_sql = sqlRs.getString(4);
                    int edad_sql = sqlRs.getInt(5);
                    int id_sql = sqlRs.getInt(6);
                    for (int i = 0; i < id_mysql; i++) {
                        for (int j = 0; j < id_sql; j++) {

                            Statement stm1 = DatabaseMYSQL.getConection().createStatement();
                            stm1.execute("update persona set nombre = '" + Nombre_sql + "', apellido1 ='" + apellido_sql + "' , apellido2 ='" + apellido2_sql + "' , sexo ='" + gender_sql + "' , edad ='" + edad_sql + "'  Where cedula=" + id_sql);
                         //   System.out.println("nombre: " + Nombre_sql + "  id:" + id_sql + " i:" + i + " j:" + j);
                            System.out.println("This can update successfully");

                        }
                    }

                }//while chico mysql
            }//whilegrande sql

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public void mirroringUpdate_From_Mysql_to_Sql() throws SQLException, ClassNotFoundException {
        try {
          Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TAREA3_B64543_B6587;user=karol;password=12345");
         //  Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");
            Statement sqlSent = sqlCon.createStatement();
            ResultSet sqlRs = sqlSent.executeQuery("Select * from persona");

            Connection mysqlCon = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            Statement mysqlSent = mysqlCon.createStatement();
            ResultSet mysqlRs = mysqlSent.executeQuery("Select * from persona");

            //insertar de mysql a sql
            while (sqlRs.next()) {

                int id_sql = sqlRs.getInt(6);

                while (mysqlRs.next()) {

                    String Nombre_mysql = mysqlRs.getString(1);
                    String apellido_mysql = mysqlRs.getString(2);
                    String apellido2_mysql = mysqlRs.getString(3);
                    String gender_mysql = mysqlRs.getString(4);
                    int edad_mysql = mysqlRs.getInt(5);
                    int id_mysql = mysqlRs.getInt(6);
                   for (int i = 0; i < id_sql; i++) {
                        for (int j = 0; j < id_mysql; j++) {

                            Statement stm1 = DatabaseSQL.getConexion().createStatement();
                            stm1.execute("update persona set nombre = '" + Nombre_mysql + "', apellido1 ='" + apellido_mysql + "' , apellido2 ='" + apellido2_mysql + "' , sexo ='" + gender_mysql + "' , edad ='" + edad_mysql + "'  Where cedula=" + id_mysql);

                         ///   System.out.println("nombre: " + Nombre_mysql + "  id:" + id_mysql + " i:" + i + " j:" + j);
                            System.out.println("Exito update s a m");

                        }
                    }

                }//while chico mysql
            }//whilegrande sql

        } catch (SQLException e) {
            System.out.println(e);
        }

    }


    public void mirroring_de_SQL_A_MYSQL() throws ClassNotFoundException {
        try {
            Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TAREA3_B64543_B6587;user=karol;password=12345");
           // Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");
            Statement sqlSent = sqlCon.createStatement();
            ResultSet sqlRs = sqlSent.executeQuery("Select  * from persona");

            Connection mysqlCon = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            Statement mysqlSent = mysqlCon.createStatement();
            ResultSet mysqlRs = mysqlSent.executeQuery("Select   * from persona");
           
            
            while (mysqlRs.next()) {
               int id_mysql = mysqlRs.getInt(6);
            
            while (sqlRs.next()) {

                String Nombre_sql = sqlRs.getString(1);
                String apellido_sql = sqlRs.getString(2);
                String apellido2_sql = sqlRs.getString(3);
                String gender_sql = sqlRs.getString(4);
                int edad_sql = sqlRs.getInt(5);
                    int id_sql = sqlRs.getInt(6);
                    //insertar de sql a mysql
                    Statement stm1 = DatabaseMYSQL.getConection().createStatement();
                    if (id_mysql != id_sql) {

//                        stm1.execute("CREATE TABLE temp_table LIKE persona");
//                        stm1.execute(" ALTER TABLE temp_table ADD UNIQUE(cedula)");
//                        stm1.execute("INSERT IGNORE INTO temp_table SELECT * FROM persona");
//                        stm1.execute("RENAME TABLE persona TO old_table1  , temp_table TO persona");
//                        stm1.execute("DROP TABLE old_table1");
///                             TRUE
                        stm1.execute("CREATE TABLE temp_table LIKE persona");
                        stm1.execute(" ALTER TABLE temp_table ADD UNIQUE(cedula)");
                        stm1.execute("INSERT IGNORE INTO temp_table SELECT * FROM persona");
                        stm1.execute("RENAME TABLE persona TO old_table1  , temp_table TO persona");
                        stm1.execute("DROP TABLE old_table1");

                        stm1.execute("Insert into persona values ('" + Nombre_sql + "','" + apellido_sql + "','" + apellido2_sql + "','" + gender_sql + "','" + edad_sql + "','" + id_sql + "')");
                        System.out.println("Insert suceesfully");

                        //   if (stm1.execute("select cedula, count(cedula) from persona group by cedula having count(cedula) > 1")) {
                    }

                }

            }

        } catch (ClassNotFoundException | SQLException e) {
        }

    }

   


    public void mirroringMysql_toSql() throws SQLException, ClassNotFoundException {///INSERTO DE MYSQL, Y SE VE REFLEJADO EN SQL
       
        try {

                Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=TAREA3_B64543_B6587;user=karol;password=12345");
            //Connection sqlCon = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");
            Statement sqlSent = sqlCon.createStatement();
            ResultSet sqlRs = sqlSent.executeQuery("Select DISTINCT * from persona");

            Connection mysqlCon = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
            Statement mysqlSent = mysqlCon.createStatement();
            ResultSet mysqlRs = mysqlSent.executeQuery("Select DISTINCT * from persona");

            //insertar de mysql a sql
            while (sqlRs.next()) {

                int id_sql = sqlRs.getInt(6);

                while (mysqlRs.next()) {

                    String Nombre_mysql = mysqlRs.getString(1);
                    String apellido_mysql = mysqlRs.getString(2);
                    String apellido2_mysql = mysqlRs.getString(3);
                    String gender_mysql = mysqlRs.getString(4);
                    int edad_mysql = mysqlRs.getInt(5);
                    int id_mysql = mysqlRs.getInt(6);

                    if (id_sql != id_mysql) {

                        Statement stm1 = DatabaseSQL.getConexion().createStatement();
                       
                        stm1.execute("Insert into persona values ('" + Nombre_mysql + "','" + apellido_mysql + "','" + apellido2_mysql + "','" + gender_mysql + "','" + edad_mysql + "','" + id_mysql + "')");
                        stm1.execute("WITH T AS ( SELECT * , ROW_NUMBER() OVER(PARTITION BY  cedula ORDER BY cedula) AS [F]  FROM persona T)  DELETE FROM T WHERE F <> 1");
                        System.out.println("Exito");
                        
                        
                    }//if cedula

                }//while chico mysql
            }//whilegrande sql

        } catch (SQLException e) {
            System.out.println(e);
        }
    }




}//end

