
package gui;

import data.DatabaseMYSQL;
import data.DatabaseSQL;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mgkar
 */
public class Consult extends javax.swing.JFrame {

    PreparedStatement ps, ps1;
    ResultSet rs, rs1;

    public Consult() {
        initComponents();
        //   this.ids.removeAllItems();
//        try {
//            
//            //SQL
//            Connection con2 = DriverManager.getConnection("jdbc:sqlserver://163.178.107.130:1433;databaseName=TAREA3_B64543_B65875;user=laboratorios;password=Saucr.118");
//            Statement sent2 = con2.createStatement();
//            ResultSet rs2 = sent2.executeQuery("Select*from persona");
//            
//            
//            ///mysql
//             Connection con = (Connection) DriverManager.getConnection(URL, USER, PASSWORD);
//            Statement sent = con.createStatement();
//            ResultSet rs1 = sent.executeQuery("Select*from persona");
//            
//            while (rs2.next() && rs1.next()) {
//                
//              String mysql=String.valueOf(rs1.next());
//              String sql=String.valueOf(rs2.next());
//              
//            for(int i=0; i<mysql.length(); i++){
//            for(int j=0; j<sql.length(); j++){
//                System.out.println("i "+i +"j"+j);
//           if(i==j){
//             ResultSet setFinal;
//              setFinal=rs1;
//              setFinal=rs2;
//              this.ids.addItem(String.valueOf(setFinal.getInt("cedula")));
//            }else if(j!=i){
//                System.out.println("no son equals");
//              //   this.ids.removeAllItems();
//                 //break;
//            }
//            }
//            }
//            
//               // 
//
//               
//               
//               
//               
//               
//            }
//
//           
//           
//
//          
//
//        } catch (SQLException e) {
//            System.out.println(e);
//        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        ids = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setFocusCycleRoot(true);
        jPanel1.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel1.setText("Identification. ");

        jLabel2.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel2.setText("Name.");

        jLabel3.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel3.setText("First Name.");

        jLabel4.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel4.setText("Last Name.");

        jLabel5.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel5.setText("Gender.");

        jLabel6.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jLabel6.setText("Age.");

        name.setEditable(false);

        fname.setEditable(false);

        lname.setEditable(false);

        age.setEditable(false);

        jButton1.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_67_111124 (1).png"))); // NOI18N
        jButton1.setText("Consult");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        gender.setFont(new java.awt.Font("Gabriola", 3, 18)); // NOI18N
        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male" }));

        jButton2.setFont(new java.awt.Font("Gabriola", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/if_return-back-redo-arrow_2075802.png"))); // NOI18N
        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel6)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ids, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(gender, 0, 136, Short.MAX_VALUE)
                    .addComponent(age)
                    .addComponent(lname)
                    .addComponent(fname)
                    .addComponent(name))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(19, 19, 19))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ids, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(16, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
           
            validateFields((ids.getText()));
        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JTextField ids;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables

    public boolean
            consult() {
        boolean condition = false;
        try {
            DatabaseMYSQL dataMysql = new DatabaseMYSQL() {
            };
            Connection conexionMysql = DatabaseMYSQL.getConection();

            DatabaseSQL dataSql = new DatabaseSQL() {
            };
            Connection conexionSql = DatabaseSQL.getConexion();

            ///mysql
            ps = conexionMysql.prepareStatement("SELECT *FROM persona WHERE cedula=?");
            ps.setInt(1, Integer.parseInt(ids.getText()));//Integer.parseInt((String) ids.getSelectedItem()));
            rs = ps.executeQuery();

            //sql
            ps1 = conexionSql.prepareStatement("SELECT *FROM persona WHERE cedula=?");

            ps1.setInt(1, Integer.parseInt(ids.getText()));//Integer.parseInt((String) ids.getSelectedItem()));
            rs1 = ps1.executeQuery();

            if (rs.next() && rs1.next()) {
                name.setText(rs.getString("nombre"));
                fname.setText(rs.getString("apellido1"));
                lname.setText(rs.getString("apellido2"));
                age.setText(rs.getString("edad"));
                gender.setSelectedItem(rs.getString("sexo"));
                ids.setText(rs.getString("cedula"));

                name.setText(rs1.getString("nombre"));
                fname.setText(rs1.getString("apellido1"));
                lname.setText(rs1.getString("apellido2"));
                age.setText(rs1.getString("edad"));
                gender.setSelectedItem(rs1.getString("sexo"));
                ids.setText(rs1.getString("cedula"));

                condition = true;

            } else {
                JOptionPane.showMessageDialog(null, "ID no registrado");
                condition = false;
            }
            conexionMysql.close();
            conexionSql.close();
        } catch (HeadlessException | ClassNotFoundException | NumberFormatException | SQLException e) {
            System.out.println(e);
        }
        return condition;

    }

    public void validateFields(String id) {
        try {
            boolean condition = false;
            if (id.equals("")) {
                JOptionPane.showMessageDialog(null, "Error!  Complete this field.");

            } else if (id != null && !isNumeric(id)) {

                JOptionPane.showMessageDialog(null, id + " Must be number, not string.");
            } else {
                consult();

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

}
