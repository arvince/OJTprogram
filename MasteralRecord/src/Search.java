import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import masteralrecord.Data.*;
import masteralrecord.Entity.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import javax.swing.JTable;

public class Search extends javax.swing.JFrame { 
    public Search() {
        initComponents();
        TranscriptRecordDao.getInstance().SetFileName("C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt");
        TranscriptRecordDao.getInstance().LoadData();
    }
    public static String name = "";
    public static double diviend = 0;
    public static double divisor = 0;
    Scanner search;
    DefaultTableModel model1;
    DefaultTableModel model2;
    DefaultTableModel model3;
    DefaultTableModel model4;
    DefaultTableModel modeld;
    public static DefaultTableModel modelE1;
    public static DefaultTableModel modelE2;
    public static DefaultTableModel modelE3;
    public static DefaultTableModel modelE4;
    public static DefaultTableModel modelEd;
 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        jDialog1 = new javax.swing.JDialog();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setAutoscrolls(true);

        jLabel1.setText("Search");

        jTextField1.setText("Name or ID #");
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton1KeyPressed(evt);
            }
        });

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                jTable1ComponentResized(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Core Subjects");

        jLabel4.setText("Major Subjects");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("Elective Subjects");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jLabel6.setText("D / INC / NC / WP");

        jLabel7.setText("Name:");

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID #:");

        jTextField3.setEditable(false);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jButton3.setText("Add New Entry");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Edit Entry");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField4.setEditable(false);

        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(jTable5);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jLabel9.setText("Research Modality");

        jTextField5.setEditable(false);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Course:");

        jButton5.setText("Export");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Thesis / Dissertation");

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane7.setViewportView(jTable7);

        jLabel12.setText("Average:");

        jTextField6.setEditable(false);

        jLabel13.setText("PUBLIC LECTURE / COMPREHENSIVE EXAM:  ");

        jLabel14.setText("Date Conducted:");

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel15.setText("Grade:");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(14, 14, 14)
                        .addComponent(jButton5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane5)
                            .addComponent(jScrollPane6)
                            .addComponent(jScrollPane7)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(227, 227, 227)
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(10, 10, 10)
                                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(159, 159, 159)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 392, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel13)
                    .addContainerGap(949, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(549, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addContainerGap(468, Short.MAX_VALUE)))
        );

        jScrollPane4.setViewportView(jPanel1);

        jLabel2.setText("Search Student");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField2.setText(name);
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            model1.setRowCount(0);
            model2.setRowCount(0);
            model3.setRowCount(0);
            model4.setRowCount(0);
            modeld.setRowCount(0);
        }catch (NullPointerException e){

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyPressed

    }//GEN-LAST:event_jButton1KeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        name = jTextField1.getText();
        ArrayList<Check> list0 = allSubject();
        String[] names = new String [5];
        int repeat = 0;
        int j =0;
        try{
            if(list0.get(0).name != null){
                names [0] = list0.get(0).name;
            }
        }catch(IndexOutOfBoundsException IOoBE){
                JOptionPane.showMessageDialog(null, "Name or ID number not found", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        for (int i = 0; i < list0.size(); i++ ){
            if(!names[j].equals(list0.get(i).name)){
               repeat ++;
               names [repeat] = list0.get(i).name;
//                       System.out.println("number "+ (i+1) +" "+names[i]);
               j++;
    //                   break;                    
            }               
//                    JOptionPane.showMessageDialog(null, "There are two or more similar family name. Please pick one name.", "Error", JOptionPane.INFORMATION_MESSAGE);
//                    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
//                    "List of name:", JOptionPane.QUESTION_MESSAGE, null, 
//                    names, // Array of choices
//                    names[0]); // Initial choice               
//                    name = input;                
//                    break;
//                }
//            } 
            }   
        if(names[1] != null){
                JOptionPane.showMessageDialog(null, "There are two or more similar family name. Please pick one name.", "Error", JOptionPane.INFORMATION_MESSAGE);
                String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
                "List of name:", JOptionPane.QUESTION_MESSAGE, null, 
                names, // Array of choices
                names[0]); // Initial choice               
                name = input; 
        } 
        
        for(int i = 0; i < list0.size(); i++){
            if(name == null ? list0.get(i).name == null : name.equals(list0.get(i).name)){
                jTextField2.setText(list0.get(i).name);
                jTextField3.setText(list0.get(i).idnum);
                jTextField5.setText(list0.get(i).course); 
                break;
            } else {
                jTextField2.setText(list0.get(0).name);
                jTextField3.setText(list0.get(0).idnum);
                jTextField5.setText(list0.get(0).course); 
//                System.out.println(list0.get(0).name);
            }
        }
//        System.out.println(list0.get(0).name);
//        System.out.println(jTextField2.getText());
        jTextField2.setText(list0.get(0).name);
        jTextField3.setText(list0.get(0).idnum);
        jTextField5.setText(list0.get(0).course); 
                
        model1 = (DefaultTableModel) jTable1.getModel();
        ArrayList<Check> list1 = basic();
        Object rowData1[] = new Object[5];
        for(int i = 0; i < list1.size(); i++){
            rowData1[0] = list1.get(i).courseno;
            rowData1[1] = list1.get(i).title;
            rowData1[2] = list1.get(i).units;
            rowData1[3] = list1.get(i).term;
            rowData1[4] = list1.get(i).grade;
//            jTextField2.setText(list1.get(i).name);
//            jTextField3.setText(list1.get(i).idnum);
//            jTextField5.setText(list1.get(i).course); 
            model1.addRow(rowData1);
//            diviend += Integer.parseInt(list1.get(i).grade);
//            divisor += list1.size();
//            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                diviend += Integer.parseInt(list1.get(i).grade);
//                divisor ++;
//            }
        }
            model2 = (DefaultTableModel) jTable2.getModel();
            ArrayList<Check> listm1 = major1();
            Object rowDatam1[] = new Object[5];
            for(int i = 0; i < listm1.size(); i++){
                rowDatam1[0] = listm1.get(i).courseno;
                rowDatam1[1] = listm1.get(i).title;
                rowDatam1[2] = listm1.get(i).units;
                rowDatam1[3] = listm1.get(i).term;
                rowDatam1[4] = listm1.get(i).grade;
                model2.addRow(rowDatam1);
    //            diviend += Integer.parseInt(listm1.get(i).grade);
    //            divisor += listm1.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm1.get(i).grade);
//                    divisor ++;
//                }
//                jTextField4.setText("Maternal and Child Health Nursing");
            }
            ArrayList<Check> listm2 = major2();
            Object rowDatam2[] = new Object[5];
            for(int i = 0; i < listm2.size(); i++){
                rowDatam2[0] = listm2.get(i).courseno;
                rowDatam2[1] = listm2.get(i).title;
                rowDatam2[2] = listm2.get(i).units;
                rowDatam2[3] = listm2.get(i).term;
                rowDatam2[4] = listm2.get(i).grade;
                model2.addRow(rowDatam2);
    //            diviend += Integer.parseInt(listm2.get(i).grade);
    //            divisor += listm2.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm2.get(i).grade);
//                    divisor ++;
//                }
//                jTextField4.setText("Adult Health Nursing");
            }
            ArrayList<Check> listm3 = major3();
            Object rowDatam3[] = new Object[5];
            for(int i = 0; i < listm3.size(); i++){
                rowDatam3[0] = listm3.get(i).courseno;
                rowDatam3[1] = listm3.get(i).title;
                rowDatam3[2] = listm3.get(i).units;
                rowDatam3[3] = listm3.get(i).term;
                rowDatam3[4] = listm3.get(i).grade;
                model2.addRow(rowDatam3);
    //            diviend += Integer.parseInt(listm3.get(i).grade);
    //            divisor += listm3.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm3.get(i).grade);
//                    divisor ++;
//                }

//                jTextField4.setText("Community Health Nursing");
            }
            ArrayList<Check> listm4 = major4();
            Object rowDatam4[] = new Object[5];
            for(int i = 0; i < listm4.size(); i++){
                rowDatam4[0] = listm4.get(i).courseno;
                rowDatam4[1] = listm4.get(i).title;
                rowDatam4[2] = listm4.get(i).units;
                rowDatam4[3] = listm4.get(i).term;
                rowDatam4[4] = listm4.get(i).grade;
                model2.addRow(rowDatam4);
    //            diviend += Integer.parseInt(listm4.get(i).grade);
    //            divisor += listm4.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm4.get(i).grade);
//                    divisor ++;
//                }
//                jTextField4.setText("Mental Health and Psychiatric Nursing");
            }
            ArrayList<Check> listm5 = major5();
            Object rowDatam5[] = new Object[5];
            for(int i = 0; i < listm5.size(); i++){
                rowDatam5[0] = listm5.get(i).courseno;
                rowDatam5[1] = listm5.get(i).title;
                rowDatam5[2] = listm5.get(i).units;
                rowDatam5[3] = listm5.get(i).term;
                rowDatam5[4] = listm5.get(i).grade;
                model2.addRow(rowDatam5);
    //            diviend += Integer.parseInt(listm5.get(i).grade);
    //            divisor += listm5.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm5.get(i).grade);
//                    divisor ++;
//                }

//                jTextField4.setText("Nursing Administration");
            }
            jTextField4.setText(MajorTitle());
        
        model4 = (DefaultTableModel) jTable3.getModel();
        ArrayList<Check> list4 = elective();
        Object rowData4[] = new Object[5];
        for(int i = 0; i < list4.size(); i++){
            rowData4[0] = list4.get(i).courseno;
            rowData4[1] = list4.get(i).title;
            rowData4[2] = list4.get(i).units;
            rowData4[3] = list4.get(i).term;
            rowData4[4] = list4.get(i).grade;
            model4.addRow(rowData4);
//            diviend += Integer.parseInt(list4.get(i).grade);
//            divisor += list4.size();
//            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                diviend += Integer.parseInt(list4.get(i).grade);
//                divisor ++;
//            }

        }
        model3 = (DefaultTableModel) jTable7.getModel();
        ArrayList<Check> list3 = thesis();
        Object rowData3[] = new Object[5];
        for(int i = 0; i < list3.size(); i++){
            rowData3[0] = list3.get(i).courseno;
            rowData3[1] = list3.get(i).title;
            rowData3[2] = list3.get(i).units;
            rowData3[3] = list3.get(i).term;
            rowData3[4] = list3.get(i).grade;
            model3.addRow(rowData3);
//            diviend += Integer.parseInt(list3.get(i).grade);
//            divisor += list3.size();
//            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                diviend += Integer.parseInt(list3.get(i).grade);
//                divisor ++;
//            }
        }
        modeld = (DefaultTableModel) jTable6.getModel();
        ArrayList<Check> listd = backSubject();
        Object rowDatad[] = new Object[5];
        for(int i = 0; i < listd.size(); i++){
            rowDatad[0] = listd.get(i).courseno;
            rowDatad[1] = listd.get(i).title;
            rowDatad[2] = listd.get(i).units;
            rowDatad[3] = listd.get(i).term;
            rowDatad[4] = listd.get(i).grade;
//            jTextField2.setText(listd.get(i).name);
//            jTextField3.setText(listd.get(i).idnum);
//            jTextField5.setText(listd.get(i).course); 
            modeld.addRow(rowDatad);
//            diviend += Integer.parseInt(listd.get(i).grade);
//            divisor += listd.size();
//            try{
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listd.get(i).grade);
//                    divisor ++;
//                } 
//            }catch (NumberFormatException n){
//            }
        }
        
//        for(int i =0; i < list0.size(); i++){
//            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                diviend += Integer.parseInt(list0.get(i).grade);
//                divisor += list0.size();
//            }
//        }        
        
//        divisor = list1.size() + listm1.size() + listm2.size() + listm3.size() + listm4.size() + listm5.size() + list3.size() + list4.size() + listd.size();
//        JOptionPane.showMessageDialog(null, diviend +"/ "+ divisor +" = "+ (String.format("%.3f",average)), "Error", JOptionPane.INFORMATION_MESSAGE);

            for(int i = 0; i < list0.size(); i++){
                try{
                    if(names[1] != null && (name == null ? list0.get(i).name == null : name.equals(list0.get(i).name)) ){                       
                        if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
                            diviend += Integer.parseInt(list0.get(i).grade);
                            divisor ++;
                        } 
                    } else {
                        if(names[1] == null){
                            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
                                diviend += Integer.parseInt(list0.get(i).grade);
                                divisor ++;
                            } 
                        }
                    }
                    }catch (NumberFormatException n){
                    }
            }

//        for(int i = 0; i < list0.size(); i++){
//                try{
//                        if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                            diviend += Integer.parseInt(list0.get(i).grade);
//                            divisor ++;
//                        } 
//                    }catch (NumberFormatException n){
//                    }
//            }

        jTextField6.setText(String.format ("%.3f", average(diviend, divisor)));
        diviend = 0;
        divisor = 0;         
        
//        printCard();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private static final ArrayList<Check> Records = TranscriptRecordDao.getInstance().GetRecords();

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTable1ComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentResized

    }//GEN-LAST:event_jTable1ComponentResized

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         /**
             * Export to Excel File.
             */
        
            class ExcelExporter {
            public ExcelExporter(){
            }
            public void exportTable(JTable table, File file) throws IOException{
                 JTable model1 = jTable1;
                 JTable model2 = jTable2;
                 JTable model3 = jTable3;
                 JTable model4 = jTable6;
                 JTable model5 = jTable7;
                try (FileWriter excel = new FileWriter(file)) {
                    excel.write("Name:"+jTextField2.getText()+ "\t");
                    excel.write("ID:"+jTextField3.getText()+ "\t");
                    excel.write("Course:"+jTextField5.getText()+ "\r\n");
                    excel.write("Basic Subject \r\n");
                    for(int i = 0; i < model1.getColumnCount(); i++){
                        excel.write(model1.getColumnName(i) + "\t");
                    }
                    excel.write("\n");
                    for(int i=0; i< model1.getRowCount(); i++) {
                        for(int j=0; j < model1.getColumnCount(); j++) {
                            excel.write(model1.getValueAt(i,j).toString()+"\t");
                        }
                        excel.write("\n");
                    }   
                    excel.write("\r\n");
                    excel.write("Major Subject \t");
                    excel.write(jTextField4.getText()+ "\r\n");
                    for(int i = 0; i < model2.getColumnCount(); i++){
                        excel.write(model2.getColumnName(i) + "\t");
                    }
                    excel.write("\n");
                    for(int i=0; i< model2.getRowCount(); i++) {
                        for(int j=0; j < model2.getColumnCount(); j++) {
                            excel.write(model2.getValueAt(i,j).toString()+"\t");
                        }
                        excel.write("\n");
                    }
                    
                    excel.write("\r\n");
                    excel.write("Elective Subject \r\n");
                    for(int i = 0; i < model3.getColumnCount(); i++){
                        excel.write(model3.getColumnName(i) + "\t");
                    }
                    excel.write("\n");
                    for(int i=0; i< model3.getRowCount(); i++) {
                        for(int j=0; j < model3.getColumnCount(); j++) {
                            excel.write(model3.getValueAt(i,j).toString()+"\t");
                        }
                        excel.write("\n");
                    }
                    
                    excel.write("\r\n");
                    excel.write("Average: "+jTextField6.getText()+ "\r\n");
                    excel.write("Back Subject \r\n");
                    for(int i = 0; i < model4.getColumnCount(); i++){
                        excel.write(model4.getColumnName(i) + "\t");
                    }
                    excel.write("\n");
                    for(int i=0; i< model4.getRowCount(); i++) {
                        for(int j=0; j < model4.getColumnCount(); j++) {
                            excel.write(model4.getValueAt(i,j).toString()+"\t");
                        }
                        excel.write("\n");
                    }
                    
                    excel.write("\r\n");
                    excel.write("Thesis Subject \r\n");
                    for(int i = 0; i < model5.getColumnCount(); i++){
                        excel.write(model5.getColumnName(i) + "\t");
                    }
                    excel.write("\n");
                    for(int i=0; i< model5.getRowCount(); i++) {
                        for(int j=0; j < model5.getColumnCount(); j++) {
                            excel.write(model5.getValueAt(i,j).toString()+"\t");
                        }
                        excel.write("\n");
                    }
                    
                }
               
            }
        }
        ExcelExporter exp = new ExcelExporter();
        File file = new File(jTextField2.getText()+"xls");
        JTable t2 = null;
        try {
            exp.exportTable(t2, file);
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JOptionPane.showMessageDialog(null, "Research Data Successfully Exported", "Success", JOptionPane.INFORMATION_MESSAGE);
//        if (t1 == null) {
//            JOptionPane.showMessageDialog(null, "No data to be exported.", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Edit editFrame =  new Edit();
        setVisible(false);
        editFrame.setVisible(true);
        editFrame.setBasic(Search.basic());
//        editFrame.setMajor2(Search.major2());
//        editFrame.setMajor3(Search.major3());
//        editFrame.setMajor4(Search.major4());
//        editFrame.setMajor5(Search.major5());
        editFrame.setThesis(Search.thesis());
        editFrame.setElective(Search.elective());
        editFrame.setBackSubject(Search.backSubject());
//        new GetValue().setVisible(true);
        ArrayList<Check> list1 = Search.basic();
        modelE1 = (DefaultTableModel) Edit.jTable8.getModel();
        Object rowData[] = new Object[5];
        for(int i = 0; i < list1.size(); i++){
            rowData[0] = list1.get(i).courseno;
            rowData[1] = list1.get(i).title;
            rowData[2] = list1.get(i).units;
            rowData[3] = list1.get(i).term;
            rowData[4] = list1.get(i).grade;
            Edit.jTextField2.setText(list1.get(i).name);
            Edit.jTextField3.setText(list1.get(i).idnum);
            Edit.jTextField5.setText(list1.get(i).course); 
            modelE1.addRow(rowData);
        }
        ArrayList<Check> majorList = new ArrayList<>();
        ArrayList<Check> listm1 = Search.major1();
        modelE2 = (DefaultTableModel) Edit.jTable4.getModel();
         Object rowDatam1[] = new Object[5];
        for(int i = 0; i < listm1.size(); i++){
            rowDatam1[0] = listm1.get(i).courseno;
            rowDatam1[1] = listm1.get(i).title;
            rowDatam1[2] = listm1.get(i).units;
            rowDatam1[3] = listm1.get(i).term;
            rowDatam1[4] = listm1.get(i).grade;
           modelE2.addRow(rowDatam1);
           Edit.jTextField4.setText("Maternal and Child Health Nursing");
        }
        majorList.addAll(listm1);
        
        ArrayList<Check> listm2 = Search.major2();
        Object rowDatam2[] = new Object[5];
        for(int i = 0; i < listm2.size(); i++){
            rowDatam2[0] = listm2.get(i).courseno;
            rowDatam2[1] = listm2.get(i).title;
            rowDatam2[2] = listm2.get(i).units;
            rowDatam2[3] = listm2.get(i).term;
            rowDatam2[4] = listm2.get(i).grade;
            modelE2.addRow(rowDatam2);
            Edit.jTextField4.setText("Adult Health Nursing");
        }
        majorList.addAll(listm2);
         ArrayList<Check> listm3 = Search.major3();
        Object rowDatam3[] = new Object[5];
        for(int i = 0; i < listm3.size(); i++){
            rowDatam3[0] = listm3.get(i).courseno;
            rowDatam3[1] = listm3.get(i).title;
            rowDatam3[2] = listm3.get(i).units;
            rowDatam3[3] = listm3.get(i).term;
            rowDatam3[4] = listm3.get(i).grade;
            modelE2.addRow(rowDatam3);
            Edit.jTextField4.setText("Community Health Nursing");
        } 
        majorList.addAll(listm3);
        ArrayList<Check> listm4 = Search.major4();
        Object rowDatam4[] = new Object[5];
        for(int i = 0; i < listm4.size(); i++){
            rowDatam4[0] = listm4.get(i).courseno;
            rowDatam4[1] = listm4.get(i).title;
            rowDatam4[2] = listm4.get(i).units;
            rowDatam4[3] = listm4.get(i).term;
            rowDatam4[4] = listm4.get(i).grade;
            modelE2.addRow(rowDatam4);
            Edit.jTextField4.setText("Mental Health and Psychiatric Nursing");
        } 
        majorList.addAll(listm4);
        ArrayList<Check> listm5 = Search.major5();
        editFrame.setMajor(listm5);
        Object rowDatam5[] = new Object[5];
        for(int i = 0; i < listm5.size(); i++){
            rowDatam5[0] = listm5.get(i).courseno;
            rowDatam5[1] = listm5.get(i).title;
            rowDatam5[2] = listm5.get(i).units;
            rowDatam5[3] = listm5.get(i).term;
            rowDatam5[4] = listm5.get(i).grade;
            modelE2.addRow(rowDatam5);
            Edit.jTextField4.setText("Nursing Administration");
        } 
        majorList.addAll(listm5);
        model4 = (DefaultTableModel) Edit.jTable6.getModel();
        ArrayList<Check> list4 = Search.elective();
        Object rowData4[] = new Object[5];
        for(int i = 0; i < list4.size(); i++){
            rowData4[0] = list4.get(i).courseno;
            rowData4[1] = list4.get(i).title;
            rowData4[2] = list4.get(i).units;
            rowData4[3] = list4.get(i).term;
            rowData4[4] = list4.get(i).grade;
            model4.addRow(rowData4);
        }
        model3 = (DefaultTableModel) Edit.jTable10.getModel();
        ArrayList<Check> list3 = Search.thesis();
        Object rowData3[] = new Object[5];
        for(int i = 0; i < list3.size(); i++){
            rowData3[0] = list3.get(i).courseno;
            rowData3[1] = list3.get(i).title;
            rowData3[2] = list3.get(i).units;
            rowData3[3] = list3.get(i).term;
            rowData3[4] = list3.get(i).grade;
            model3.addRow(rowData3);
        }
        modeld = (DefaultTableModel) Edit.jTable7.getModel();
        ArrayList<Check> listd = Search.backSubject();
        Object rowDatad[] = new Object[5];
        for(int i = 0; i < listd.size(); i++){
            rowDatad[0] = listd.get(i).courseno;
            rowDatad[1] = listd.get(i).title;
            rowDatad[2] = listd.get(i).units;
            rowDatad[3] = listd.get(i).term;
            rowDatad[4] = listd.get(i).grade;
            modeld.addRow(rowDatad);
        }
        Edit.jTextField8.setText(String.format("%.3f",average(diviend, divisor)));        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AddUser addUserFrame = new AddUser();
        addUserFrame.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        // TODO add your handling code here:
        try{
            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");
            model1.setRowCount(0);
            model2.setRowCount(0);
            model3.setRowCount(0);
            model4.setRowCount(0);
            modeld.setRowCount(0);
        }catch (Exception e){
            
        }
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            name = jTextField1.getText();
            ArrayList<Check> list0 = allSubject();
            String[] names = new String [5];
            int repeat = 0;
            int j =0;
            try{
                if(list0.get(0).name != null){
                    names [0] = list0.get(0).name;
                }
            }catch(IndexOutOfBoundsException IOoBE){
                    JOptionPane.showMessageDialog(null, "Name or ID number not found", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
            for (int i = 0; i < list0.size(); i++ ){
                if(!names[j].equals(list0.get(i).name)){
                   repeat ++;
                   names [repeat] = list0.get(i).name;
//                   System.out.println("numeber "+ (i+1) +" "+names[i]);
                   j++;
//                   break;                    
                }               
//                    JOptionPane.showMessageDialog(null, "There are two or more similar family name. Please pick one name.", "Error", JOptionPane.INFORMATION_MESSAGE);
//                    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
//                    "List of name:", JOptionPane.QUESTION_MESSAGE, null, 
//                    names, // Array of choices
//                    names[0]); // Initial choice               
//                    name = input;                
//                    break;
//                }
//            } 
            }   
            if(names[1] != null){
                    JOptionPane.showMessageDialog(null, "There are two or more similar family name. Please pick one name.", "Error", JOptionPane.INFORMATION_MESSAGE);
                    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
                    "List of name:", JOptionPane.QUESTION_MESSAGE, null, 
                    names, // Array of choices
                    names[0]); // Initial choice               
                    name = input;
                }
                      
//            JOptionPane.showMessageDialog(null, "There are two or more similar family name. Please pick one name.", "Error", JOptionPane.INFORMATION_MESSAGE);
//                    String input = (String) JOptionPane.showInputDialog(null, "Choose now...",
//                    "List of name:", JOptionPane.QUESTION_MESSAGE, null, 
//                    names, // Array of choices
//                    names[0]); // Initial choice               
//                    name = input; 
            for(int i = 0; i < list0.size(); i++){
                if(name == null ? list0.get(i).name == null : name.equals(list0.get(i).name)){
                    jTextField2.setText(list0.get(i).name);
                    jTextField3.setText(list0.get(i).idnum);
                    jTextField5.setText(list0.get(i).course); 
                    break;
                } else {
                    jTextField2.setText(list0.get(0).name);
                    jTextField3.setText(list0.get(0).idnum);
                    jTextField5.setText(list0.get(0).course); 
//                    System.out.println(list0.get(0).name);
                }
            }

            model1 = (DefaultTableModel) jTable1.getModel();
            ArrayList<Check> list1 = basic();
            Object rowData1[] = new Object[5];
            for(int i = 0; i < list1.size(); i++){
                rowData1[0] = list1.get(i).courseno;
                rowData1[1] = list1.get(i).title;
                rowData1[2] = list1.get(i).units;
                rowData1[3] = list1.get(i).term;
                rowData1[4] = list1.get(i).grade;
//                jTextField2.setText(list1.get(i).name);
//                jTextField3.setText(list1.get(i).idnum);
//                jTextField5.setText(list1.get(i).course); 
                model1.addRow(rowData1);
    //            diviend += Integer.parseInt(list1.get(i).grade);
    //            divisor += list1.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(list1.get(i).grade);
//                    divisor ++;
//                }
            }
            model2 = (DefaultTableModel) jTable2.getModel();
            ArrayList<Check> listm1 = major1();
            Object rowDatam1[] = new Object[5];
            for(int i = 0; i < listm1.size(); i++){
                rowDatam1[0] = listm1.get(i).courseno;
                rowDatam1[1] = listm1.get(i).title;
                rowDatam1[2] = listm1.get(i).units;
                rowDatam1[3] = listm1.get(i).term;
                rowDatam1[4] = listm1.get(i).grade;
                model2.addRow(rowDatam1);
    //            diviend += Integer.parseInt(listm1.get(i).grade);
    //            divisor += listm1.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm1.get(i).grade);
//                    divisor ++;
//                }
//                jTextField4.setText("Maternal and Child Health Nursing");
            }
            ArrayList<Check> listm2 = major2();
            Object rowDatam2[] = new Object[5];
            for(int i = 0; i < listm2.size(); i++){
                rowDatam2[0] = listm2.get(i).courseno;
                rowDatam2[1] = listm2.get(i).title;
                rowDatam2[2] = listm2.get(i).units;
                rowDatam2[3] = listm2.get(i).term;
                rowDatam2[4] = listm2.get(i).grade;
                model2.addRow(rowDatam2);
    //            diviend += Integer.parseInt(listm2.get(i).grade);
    //            divisor += listm2.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm2.get(i).grade);
//                    divisor ++;
//                }
//                jTextField4.setText("Adult Health Nursing");
            }
            ArrayList<Check> listm3 = major3();
            Object rowDatam3[] = new Object[5];
            for(int i = 0; i < listm3.size(); i++){
                rowDatam3[0] = listm3.get(i).courseno;
                rowDatam3[1] = listm3.get(i).title;
                rowDatam3[2] = listm3.get(i).units;
                rowDatam3[3] = listm3.get(i).term;
                rowDatam3[4] = listm3.get(i).grade;
                model2.addRow(rowDatam3);
    //            diviend += Integer.parseInt(listm3.get(i).grade);
    //            divisor += listm3.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm3.get(i).grade);
//                    divisor ++;
//                }

//                jTextField4.setText("Community Health Nursing");
            }
            ArrayList<Check> listm4 = major4();
            Object rowDatam4[] = new Object[5];
            for(int i = 0; i < listm4.size(); i++){
                rowDatam4[0] = listm4.get(i).courseno;
                rowDatam4[1] = listm4.get(i).title;
                rowDatam4[2] = listm4.get(i).units;
                rowDatam4[3] = listm4.get(i).term;
                rowDatam4[4] = listm4.get(i).grade;
                model2.addRow(rowDatam4);
    //            diviend += Integer.parseInt(listm4.get(i).grade);
    //            divisor += listm4.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm4.get(i).grade);
//                    divisor ++;
//                }
//                jTextField4.setText("Mental Health and Psychiatric Nursing");
            }
            ArrayList<Check> listm5 = major5();
            Object rowDatam5[] = new Object[5];
            for(int i = 0; i < listm5.size(); i++){
                rowDatam5[0] = listm5.get(i).courseno;
                rowDatam5[1] = listm5.get(i).title;
                rowDatam5[2] = listm5.get(i).units;
                rowDatam5[3] = listm5.get(i).term;
                rowDatam5[4] = listm5.get(i).grade;
                model2.addRow(rowDatam5);
    //            diviend += Integer.parseInt(listm5.get(i).grade);
    //            divisor += listm5.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(listm5.get(i).grade);
//                    divisor ++;
//                }

//                jTextField4.setText("Nursing Administration");
            }
            jTextField4.setText(MajorTitle());
            model4 = (DefaultTableModel) jTable3.getModel();
            ArrayList<Check> list4 = elective();
            Object rowData4[] = new Object[5];
            for(int i = 0; i < list4.size(); i++){
                rowData4[0] = list4.get(i).courseno;
                rowData4[1] = list4.get(i).title;
                rowData4[2] = list4.get(i).units;
                rowData4[3] = list4.get(i).term;
                rowData4[4] = list4.get(i).grade;
                model4.addRow(rowData4);
    //            diviend += Integer.parseInt(list4.get(i).grade);
    //            divisor += list4.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(list4.get(i).grade);
//                    divisor ++;
//                }

            }
            model3 = (DefaultTableModel) jTable7.getModel();
            ArrayList<Check> list3 = thesis();
            Object rowData3[] = new Object[5];
            for(int i = 0; i < list3.size(); i++){
                rowData3[0] = list3.get(i).courseno;
                rowData3[1] = list3.get(i).title;
                rowData3[2] = list3.get(i).units;
                rowData3[3] = list3.get(i).term;
                rowData3[4] = list3.get(i).grade;
                model3.addRow(rowData3);
    //            diviend += Integer.parseInt(list3.get(i).grade);
    //            divisor += list3.size();
//                if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                    diviend += Integer.parseInt(list3.get(i).grade);
//                    divisor ++;
//                }
            }
            modeld = (DefaultTableModel) jTable6.getModel();
            ArrayList<Check> listd = backSubject();
            Object rowDatad[] = new Object[5];
            for(int i = 0; i < listd.size(); i++){
                rowDatad[0] = listd.get(i).courseno;
                rowDatad[1] = listd.get(i).title;
                rowDatad[2] = listd.get(i).units;
                rowDatad[3] = listd.get(i).term;
                rowDatad[4] = listd.get(i).grade;
//                jTextField2.setText(listd.get(i).name);
//                jTextField3.setText(listd.get(i).idnum);
//                jTextField5.setText(listd.get(i).course); 
                modeld.addRow(rowDatad);
    //            diviend += Integer.parseInt(listd.get(i).grade);
    //            divisor += listd.size();
//                try{
//                    if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
//                        diviend += Integer.parseInt(listd.get(i).grade);
//                        divisor ++;
//                    } else{
//                        System.out.print("drop subject");
//                    }
//                }catch (NumberFormatException n){
//                }
            }

    //        for(int i =0; i < list0.size(); i++){
    //            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
    //                diviend += Integer.parseInt(list0.get(i).grade);
    //                divisor += list0.size();
    //            }
    //        }        

    //        divisor = list1.size() + listm1.size() + listm2.size() + listm3.size() + listm4.size() + listm5.size() + list3.size() + list4.size() + listd.size();
    //        JOptionPane.showMessageDialog(null, diviend +"/ "+ divisor +" = "+ (String.format("%.3f",average)), "Error", JOptionPane.INFORMATION_MESSAGE);
    
            for(int i = 0; i < list0.size(); i++){
                try{
                    if(names[1] != null && (name == null ? list0.get(i).name == null : name.equals(list0.get(i).name)) ){                       
                        if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
                            diviend += Integer.parseInt(list0.get(i).grade);
                            divisor ++;
                        } 
                    } else {
                        if(names[1] == null){
                            if(!list0.get(i).grade.equals("D") && !list0.get(i).grade.equals("WP") && !list0.get(i).grade.equals("NC") && !list0.get(i).grade.equals("INC") && !list0.get(i).grade.equals("F")){
                                diviend += Integer.parseInt(list0.get(i).grade);
                                divisor ++;
                            } 
                        }
                    }
                    }catch (NumberFormatException n){
                    }
            }

            jTextField6.setText(String.format ("%.3f", average(diviend, divisor)));
            diviend = 0;
            divisor = 0;
            
            /**
             * Export to Excel File.
             */
        
//            class ExcelExporter {
//            public ExcelExporter(){
//            }
//            public void exportTable(JTable table, File file) throws IOException{
//                 JTable model1 = jTable1;
//                 JTable model2 = jTable2;
//                 JTable model3 = jTable3;
//                 JTable model4 = jTable6;
//                 JTable model5 = jTable7;
//                try (FileWriter excel = new FileWriter(file)) {
//                    excel.write("Name:"+jTextField2.getText()+ "\t");
//                    excel.write("ID:"+jTextField3.getText()+ "\t");
//                    excel.write("Course:"+jTextField5.getText()+ "\r\n");
//                    excel.write("Basic Subject \r\n");
//                    for(int i = 0; i < model1.getColumnCount(); i++){
//                        excel.write(model1.getColumnName(i) + "\t");
//                    }
//                    excel.write("\n");
//                    for(int i=0; i< model1.getRowCount(); i++) {
//                        for(int j=0; j < model1.getColumnCount(); j++) {
//                            excel.write(model1.getValueAt(i,j).toString()+"\t");
//                        }
//                        excel.write("\n");
//                    }   
//                    excel.write("\r\n");
//                    excel.write("Major Subject \t");
//                    excel.write(jTextField4.getText()+ "\r\n");
//                    for(int i = 0; i < model2.getColumnCount(); i++){
//                        excel.write(model2.getColumnName(i) + "\t");
//                    }
//                    excel.write("\n");
//                    for(int i=0; i< model2.getRowCount(); i++) {
//                        for(int j=0; j < model2.getColumnCount(); j++) {
//                            excel.write(model2.getValueAt(i,j).toString()+"\t");
//                        }
//                        excel.write("\n");
//                    }
//                    
//                    excel.write("\r\n");
//                    excel.write("Elective Subject \r\n");
//                    for(int i = 0; i < model3.getColumnCount(); i++){
//                        excel.write(model3.getColumnName(i) + "\t");
//                    }
//                    excel.write("\n");
//                    for(int i=0; i< model3.getRowCount(); i++) {
//                        for(int j=0; j < model3.getColumnCount(); j++) {
//                            excel.write(model3.getValueAt(i,j).toString()+"\t");
//                        }
//                        excel.write("\n");
//                    }
//                    
//                    excel.write("\r\n");
//                    excel.write("Average: "+jTextField6.getText()+ "\r\n");
//                    excel.write("Back Subject \r\n");
//                    for(int i = 0; i < model4.getColumnCount(); i++){
//                        excel.write(model4.getColumnName(i) + "\t");
//                    }
//                    excel.write("\n");
//                    for(int i=0; i< model4.getRowCount(); i++) {
//                        for(int j=0; j < model4.getColumnCount(); j++) {
//                            excel.write(model4.getValueAt(i,j).toString()+"\t");
//                        }
//                        excel.write("\n");
//                    }
//                    
//                    excel.write("\r\n");
//                    excel.write("Thesis Subject \r\n");
//                    for(int i = 0; i < model5.getColumnCount(); i++){
//                        excel.write(model5.getColumnName(i) + "\t");
//                    }
//                    excel.write("\n");
//                    for(int i=0; i< model5.getRowCount(); i++) {
//                        for(int j=0; j < model5.getColumnCount(); j++) {
//                            excel.write(model5.getValueAt(i,j).toString()+"\t");
//                        }
//                        excel.write("\n");
//                    }
//                    
//                }
//               
//            }
//        }
//        ExcelExporter exp = new ExcelExporter();
//        File file = new File("test.xls");
//        JTable t2 = null;
//        try {
//            exp.exportTable(t2, file);
//        } catch (IOException ex) {
//            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        JOptionPane.showMessageDialog(null, "Research Data Successfully Exported", "Success", JOptionPane.INFORMATION_MESSAGE);
////        if (t1 == null) {
////            JOptionPane.showMessageDialog(null, "No data to be exported.", "Error", JOptionPane.ERROR_MESSAGE);
////        }
            
        }
    }//GEN-LAST:event_jTextField1KeyPressed

    public static void main(String args[]) throws FileNotFoundException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }
    
    private static Scanner input;
    
    private static boolean CheckGrade(Check rec) throws NumberFormatException {
        int num = 0;
        try{
            num = Integer.parseInt(rec.grade);
        }catch(NumberFormatException e){
            num = 0;
        }
        return !rec.grade.equals("D") && !rec.grade.equals("WP") && 
                !rec.grade.equals("NC") && !rec.grade.equals("INC") && 
                !rec.grade.equals("NFE") && 
                !rec.grade.equals("F") && (num > 84 || rec.grade.equals("P"));
    }

    private static boolean CheckFailedGrade(Check rec) throws NumberFormatException {
        int num;
        try{
            num = Integer.parseInt(rec.grade);
        }catch(NumberFormatException e){
            num = 0;
        }
        return rec.grade.equals("D") || rec.grade.equals("WP") || 
                rec.grade.equals("NC") || rec.grade.equals("INC") || 
                rec.grade.equals("NFE") || 
                rec.grade.equals("F") || (num < 84 && num != 0);
    }
    
    
    public static ArrayList<Check> allSubject(){
         ArrayList<Check> allSubject = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
          ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-201","NU-202","NU-203","NU-204",
             "NU-211","NU-212","NU-213","NU-214",
             "NU-221","NU-222","NU-223","NU-224",
             "NU-231","NU-232","NU-233","NU-234",
             "NU-241","NU-242","NU-243","NU-244",
             "NU-251","NU-252","NU-253","NU-254",
             "NU-215","NU-216","NU-217","NU-225","NU-226",
             "NU-227","NU-235","NU-236","NU-237","NU-245",
             "NU-255","NU-256","NU-257",
             "NU-299A","NU-299B",
             "NU-205","NU-206", "NU-207",
             "NU-261","NU-262","NU-263","NU-264","NU-265",
             "NU-271","NU-272","NU-273","NU-274","NU-275",
             "NU-281","NU-282","NU-283","NU-284","NU-285",
             "NU-291","NU-292","NU-293","NU-294","NU-295",
             "NU-301","NU-302","NU-303","NU-304","NU-305",
             "NU-311","NU-312","NU-313","NU-314","NU-315",
             "NU-321","NU-322","NU-323","NU-324","NU-325",            
             "NU-331","NU-332","NU-333","NU-334",
             "NU-335","NU-336","NU-337","NU-338",
             "NU-339","NU-340","NU-341","NU-342",
             "NU-343","NU-344","NU-345","NU-346","NU-347"
         }));
          
          Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno)){
                     allSubject.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno)){
                         allSubject.add(rec);
                     }
                 }
             }
        });

         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
             input = new Scanner(System.in);
            

//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){                   
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                allSubject.add(ch);                    
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){                    
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                allSubject.add(ch);                   
//                }
//                    }
//            }
         }catch (IOException e) {
            e.printStackTrace();
        }
         return allSubject;
     }
    
    public static ArrayList<Check> basic(){
         ArrayList<Check> basic = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-201","NU-202","NU-203","NU-204",
         }));
         
         Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     basic.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         basic.add(rec);
                     }
                 }
             }
        });

         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
             input = new Scanner(System.in);

//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-201") || record[2].equals("NU-202") || record[2].equals("NU-203")|| record[2].equals("NU-204")) && ( !record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                basic.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if((record[2].equals("NU-201") || record[2].equals("NU-202") || record[2].equals("NU-203")|| record[2].equals("NU-204")) && (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P")  && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                basic.add(ch);
//                    }
//                }
//                    }
//            }
         }catch (IOException e) {
            e.printStackTrace();
        }
         return basic;
     }
    
    public static ArrayList<Check> major1(){
         ArrayList<Check> major1 = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-211","NU-212","NU-213","NU-214",
         }));
         
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     major1.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         major1.add(rec);
                     }
                 }
             }
        });
                  
         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
             input = new Scanner(System.in);
            

//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-211") || record[2].equals("NU-212") || record[2].equals("NU-213")|| record[2].equals("NU-214"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major1.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){                   
//                    if((record[2].equals("NU-211") || record[2].equals("NU-212") || record[2].equals("NU-213")|| record[2].equals("NU-214"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major1.add(ch);
//                    }
//                }
//                    }
//            } 
         }catch (IOException e) {
            e.printStackTrace();
        }
         return major1;
     }
    
    public static ArrayList<Check> major2(){
         ArrayList<Check> major2 = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-221","NU-222","NU-223","NU-224",
         }));
         
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     major2.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         major2.add(rec);
                     }
                 }
             }
        });
                 
//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-221") || record[2].equals("NU-222") || record[2].equals("NU-223")|| record[2].equals("NU-224"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major2.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if((record[2].equals("NU-221") || record[2].equals("NU-222") || record[2].equals("NU-223")|| record[2].equals("NU-224"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major2.add(ch);
//                    }
//                        }
//                }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return major2;
     }
    
    public static ArrayList<Check> major3(){
         ArrayList<Check> major3 = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-231","NU-232","NU-233","NU-234",
         }));
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     major3.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         major3.add(rec);
                     }
                 }
             }
        });

//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-231") || record[2].equals("NU-232") || record[2].equals("NU-233")|| record[2].equals("NU-234"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major3.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if((record[2].equals("NU-231") || record[2].equals("NU-232") || record[2].equals("NU-233")|| record[2].equals("NU-234"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major3.add(ch);
//                    }
//                }
//                    }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return major3;
     }
    
    public static ArrayList<Check> major4(){
         ArrayList<Check> major4 = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-241","NU-242","NU-243","NU-244",
         }));
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     major4.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         major4.add(rec);
                     }
                 }
             }
        });
         
//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-241") || record[2].equals("NU-242") || record[2].equals("NU-243")|| record[2].equals("NU-244"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major4.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if((record[2].equals("NU-241") || record[2].equals("NU-242") || record[2].equals("NU-243")|| record[2].equals("NU-244"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major4.add(ch);
//                        }
//                    }
//                }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return major4;
     }
    
    public static ArrayList<Check> major5(){
         ArrayList<Check> major5 = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-251","NU-252","NU-253","NU-254",
         }));
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     major5.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         major5.add(rec);
                     }
                 }
             }
        });
         
//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-251") || record[2].equals("NU-252") || record[2].equals("NU-253")|| record[2].equals("NU-254"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major5.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if((record[2].equals("NU-251") || record[2].equals("NU-252") || record[2].equals("NU-253")|| record[2].equals("NU-254"))&& (!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("P") && Integer.parseInt(record[6]) > 84)){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                major5.add(ch);
//                    }
//                 }
//               }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return major5;
     }
    
    public static String MajorTitle(){
        int m1 = major1().size();
        int m2 = major2().size();
        int m3 = major3().size();
        int m4 = major4().size();
        int m5 = major5().size();
        String title = "";
        
        
        if(m1 > m2 && m1 > m3 && m1 > m4 && m1 > m5 ){
            title = "Maternal and Child Health Nursing";
        }else if(m2 > m1 && m2 > m3 && m2 > m4 && m2 > m5 ){
            title = "Adult Health Nursing";
        }else if(m3 > m1 && m3 > m2 && m3 > m4 && m3 > m5 ){
            title = "Community Health Nursing";
        }else if(m4 > m1 && m4 > m2 && m4 > m3 && m4 > m5 ){
            title = "Mental Health and Psychiatric Nursing";
        }else if(m5 > m1 && m5 > m2 && m5 > m3 && m5 > m4 ){
            title = "Nursing Administration";
        }
        return title;
    }
    
    public static ArrayList<Check> thesis(){
         ArrayList<Check> thesis = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-299A","NU-299B"
         }));
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                     thesis.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(subjects.contains(rec.courseno) && CheckGrade(rec)){
                         thesis.add(rec);
                     }
                 }
             }
        });
         
//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if( (record[2].equals("NU-299A") ||  record[2].equals("NU-299B")) &&  record[6].contains("P")){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                thesis.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if( (record[2].equals("NU-299A") ||  record[2].equals("NU-299B")) &&   record[6].contains("P")){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                thesis.add(ch);
//                        }
//                    }
//                }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return thesis;
     }
    
    public static ArrayList<Check> elective(){
         ArrayList<Check> elective = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         ArrayList<String> subjects = new ArrayList<>(Arrays.asList(new String[]{
             "NU-201","NU-202","NU-203","NU-204",
             "NU-211","NU-212","NU-213","NU-214",
             "NU-221","NU-222","NU-223","NU-224",
             "NU-231","NU-232","NU-233","NU-234",
             "NU-241","NU-242","NU-243","NU-244",
             "NU-251","NU-252","NU-253","NU-254",
             "NU-299A","NU-299B"
         }));
         
        Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(!subjects.contains(rec.courseno) && CheckGrade(rec)){
                     elective.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(!subjects.contains(rec.courseno) && CheckGrade(rec)){
                         elective.add(rec);
                     }
                 }
             }
        });
         
         
         
//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains(name)){
//                    if((record[2].equals("NU-201") || record[2].equals("NU-202") || record[2].equals("NU-203")|| record[2].equals("NU-204"))){                               
//                                
//                            }else if (record[2].equals("NU-211") || record[2].equals("NU-212") || record[2].equals("NU-213")|| record[2].equals("NU-214")) {
//                            
//                             }else if (record[2].equals("NU-221") || record[2].equals("NU-222") || record[2].equals("NU-223")|| record[2].equals("NU-224")) {
//                            
//                            }else if (record[2].equals("NU-231") || record[2].equals("NU-232") || record[2].equals("NU-233")|| record[2].equals("NU-234")){
//                               
//                            }else if (record[2].equals("NU-241") || record[2].equals("NU-242") || record[2].equals("NU-243")|| record[2].equals("NU-244")) {
//                              
//                            }else if (record[2].equals("NU-251") || record[2].equals("NU-252") || record[2].equals("NU-253")|| record[2].equals("NU-254")){
//                               
//                            }else if ((record[2].equals("NU-299A") ||  record[2].equals("NU-299B"))) {
//                               
//                            } else{
//                                if(!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("F") && Integer.parseInt(record[6]) > 84 ){
//                                    Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                                    elective.add(ch);
//                                }
//                            }
//                } else if (!record[0].equals("")){
//                    if (record[1].contains(name)){                    
//                    if((record[2].equals("NU-201") || record[2].equals("NU-202") || record[2].equals("NU-203")|| record[2].equals("NU-204"))){                               
//                                
//                            }else if (record[2].equals("NU-211") || record[2].equals("NU-212") || record[2].equals("NU-213")|| record[2].equals("NU-214")) {
//                            
//                             }else if (record[2].equals("NU-221") || record[2].equals("NU-222") || record[2].equals("NU-223")|| record[2].equals("NU-224")) {
//                            
//                            }else if (record[2].equals("NU-231") || record[2].equals("NU-232") || record[2].equals("NU-233")|| record[2].equals("NU-234")) {
//                               
//                            }else if (record[2].equals("NU-241") || record[2].equals("NU-242") || record[2].equals("NU-243")|| record[2].equals("NU-244")) {
//                              
//                            }else if (record[2].equals("NU-251") || record[2].equals("NU-252") || record[2].equals("NU-253")|| record[2].equals("NU-254")) {
//                               
//                            }else if ((record[2].equals("NU-299A") ||  record[2].equals("NU-299B"))) {
//                               
//                            } else{
//                                if(!record[6].equals("D") && !record[6].equals("WP") && !record[6].equals("NC") && !record[6].equals("INC") && !record[6].equals("F") && Integer.parseInt(record[6]) > 84){
//                                
//                                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                                elective.add(ch);
//                                }
//                            }
//                    }
//                } 
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return elective;
     }
    
    public static ArrayList<Check> backSubject(){
         ArrayList<Check> backSubject = new ArrayList<Check>();
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         String line = "";
         
         Records.forEach((rec) -> {
             if(rec.name.contains(name)){
                 if(CheckFailedGrade(rec)){
                     backSubject.add(rec);
                 }
             } else if(!rec.name.equals("")){
                 if(rec.idnum.equals(name)){
                     if(CheckFailedGrade(rec)){
                         backSubject.add(rec);
                     }
                 }
             }
        });
         
//         Records.forEach((rec) -> {
//             if(rec.name.contains(name)){
//                 if(CheckFailedGrade(rec)){
//                     backSubject.add(rec);
//                 }
//             }else if(rec.name.equals("")){
//                 if(CheckFailedGrade(rec)){
//                     backSubject.add(rec);
//                 }
//             }
//        });

//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                try{
//                if (record[0].contains(name)){
//                    if(( record[6].contains("D") ||  record[6].contains("WP") ||  record[6].contains("NC")||  record[6].contains("INC") ||  record[6].contains("F")) ||  (Integer.parseInt(record[6]) < 84 )){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                backSubject.add(ch);
//                    }
//                } else if (!record[0].equals("")){
//                        if (record[1].contains(name)){
//                    if( (  record[6].contains("D") ||  record[6].contains("WP") ||  record[6].contains("NC")||  record[6].contains("INC") ||  record[6].contains("F")) || Integer.parseInt(record[6]) < 84){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                backSubject.add(ch);
//                        }
//                    }
//                }
//                } catch(NumberFormatException e){
//                    
//                }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return backSubject;
     }
    
    public static double average(double dividend, double divisor){
        double average = 0;
        average = dividend / divisor;
        return average;
    }
    
//    private void printCard(){
//
//    PrinterJob printjob = PrinterJob.getPrinterJob();
//    printjob.setJobName(" personal card ");
//
//    printjob.setPrintable (new Printable() {      
//         public int print(Graphics pg, PageFormat pf, int pageNum){                  
//
//             pf.setOrientation(PageFormat.LANDSCAPE);
//
//             if (pageNum > 0){
//                return Printable.NO_SUCH_PAGE;
//             }
//
//             Graphics2D g2 = (Graphics2D) pg;
//             g2.translate(pf.getImageableX(), pf.getImageableY());
//             g2.translate( 0f, 0f );
//             jPanel1.paint(g2);
//
//             return Printable.PAGE_EXISTS;
//         }
//    });
//
//    if (printjob.printDialog() == false)
//       return;
//
//    try {
//       printjob.print();
//    }
//    catch (PrinterException ex) {
//       System.out.println("NO PAGE FOUND."+ex);
//       }
//    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    public static javax.swing.JTable jTable3;
    private javax.swing.JTable jTable5;
    public static javax.swing.JTable jTable6;
    public static javax.swing.JTable jTable7;
    public static javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    protected static javax.swing.JTextField jTextField5;
    public static javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}