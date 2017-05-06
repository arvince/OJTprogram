

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import masteralrecord.Data.*;
import masteralrecord.Entity.*;

public class Edit extends javax.swing.JFrame {
    public Edit() {
        initComponents();
    }
    public static String FileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
    DefaultTableModel model1 = null;
    DefaultTableModel model2 = null;
    DefaultTableModel model3 = null;
    DefaultTableModel model4 = null;
    DefaultTableModel modeld = null;
    public static DefaultTableModel modelE1;
    public static DefaultTableModel modelE2;
    public static DefaultTableModel modelE3;
    public static DefaultTableModel modelE4;
    public static DefaultTableModel modelEd;
    public static double diviend = 0;
    public static double divisor = 0;
    private ArrayList<Check> _basic;
    private ArrayList<Check> _major;
    private ArrayList<Check> _thesis;
    private ArrayList<Check> _elective;
    private ArrayList<Check> _backSubject;
    public void setBasic(ArrayList<Check> basic){
        _basic = basic;
    }
    public void setMajor(ArrayList<Check> major){
        _major = major;
    }
    public void setThesis(ArrayList<Check> thesis){
        _thesis = thesis;
    }
    public void setElective(ArrayList<Check> elective){
        _elective = elective;
    }
    public void setBackSubject(ArrayList<Check> backSubject){
        _backSubject = backSubject;
    }
    
    private void updateTableValue(JTable table, ArrayList<Check> list){
        for(int i = 0; i < table.getRowCount(); i++){
            list.get(i).courseno = table.getModel().getValueAt(i, 0).toString();
            list.get(i).title = table.getModel().getValueAt(i, 1).toString();
            list.get(i).units = table.getModel().getValueAt(i, 2).toString();
            list.get(i).term = table.getModel().getValueAt(i, 3).toString();
            list.get(i).grade = table.getModel().getValueAt(i, 4).toString();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTable7 = new javax.swing.JTable();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTable8 = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTable9 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTable10 = new javax.swing.JTable();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Core Subjects");

        jLabel4.setText("Major Subjects");

        jLabel5.setText("Elective Subjects");

        jLabel6.setText("D / INC / NC / WP");

        jLabel7.setText("Name:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("ID #:");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel9.setText("Research Modality");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Course:");

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        jTable7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jTable7.getTableHeader().setReorderingAllowed(false);
        jScrollPane7.setViewportView(jTable7);

        jTable8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jScrollPane8.setViewportView(jTable8);

        jTable9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jScrollPane9.setViewportView(jTable9);

        jLabel1.setText("Thesis / Dissertation");

        jTable10.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jScrollPane10.setViewportView(jTable10);

        jLabel12.setText("PUBLIC LECTURE:         Date Conducted:");

        jLabel13.setText("Grade:");

        jLabel14.setText("Average Grade:");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Code", "Title", "Units", "Semester", "Grade"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel2.setText("Add Subject");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(76, 76, 76)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(590, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8)
                    .addComponent(jScrollPane7)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 136, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addGap(49, 49, 49))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        updateTableValue(jTable8, _basic);
        updateTableValue(jTable4, _major);
        updateTableValue(jTable6, _elective);
        updateTableValue(jTable7, _backSubject);

        TranscriptRecordDao.getInstance().SaveContentToFile();
        
                 try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileName,true))) {
                    int row = 0;

                    while(jTable1.getModel().getValueAt(row, 0) != null){
                        String content = (String) jTextField2.getText()+"/"+jTextField3.getText()+"/"+jTable1.getModel().getValueAt(row, 0)+"/"+jTable1.getModel().getValueAt(row, 1)+"/"+jTable1.getModel().getValueAt(row, 2)+"/"+jTable1.getModel().getValueAt(row, 3)+"/"+jTable1.getModel().getValueAt(row, 4)+"/"+jTextField5.getText();
                        bw.newLine();
                        bw.write(content);
                        row++;
                    }                  

			// no need to close it.
			//bw.close();

                    System.out.println("Done");
                    bw.flush();
                    bw.close();

		} catch (IOException e) {
                    System.out.print("error");
		}
                 
        JOptionPane.showMessageDialog(this, "Edit Saved", "Success", JOptionPane.INFORMATION_MESSAGE);
//        File log = new File("edit.txt");
//    try{
//    if(log.exists()==false){
//            JOptionPane.showMessageDialog(this, "Text file does not exist", "Error", JOptionPane.ERROR_MESSAGE);
//            log.createNewFile();
//    }
//            PrintWriter out = new PrintWriter(log);
//            out.println("\n" + jTextField2.getText() + "/" + jTextField3.getText() + "/" + jTextField5.getText() + "/" + "\n");
//            out.close();
//    }catch(IOException e){
//        JOptionPane.showMessageDialog(this, "We have to create text file", "Creating text file", JOptionPane.INFORMATION_MESSAGE);
//    }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed

    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        jTextField2.setText("");
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
//        new Search().setVisible(true);
        Search searchFrame =  new Search();
        searchFrame.setVisible(true);
        ArrayList<Check> list1 = Search.basic();
        modelE1 = (DefaultTableModel) searchFrame.jTable1.getModel();
        Object rowData[] = new Object[5];
        for(int i = 0; i < list1.size()/2; i++){
            rowData[0] = list1.get(i).courseno;
            rowData[1] = list1.get(i).title;
            rowData[2] = list1.get(i).units;
            rowData[3] = list1.get(i).term;
            rowData[4] = list1.get(i).grade;
            searchFrame.jTextField2.setText(list1.get(i).name);
            searchFrame.jTextField3.setText(list1.get(i).idnum);
            searchFrame.jTextField5.setText(list1.get(i).course); 
            modelE1.addRow(rowData);
            if(!list1.get(i).grade.equals("D") && !list1.get(i).grade.equals("WP") && !list1.get(i).grade.equals("NC") && !list1.get(i).grade.equals("INC") && !list1.get(i).grade.equals("F")){
                diviend += Integer.parseInt(list1.get(i).grade);
                divisor ++;
            }
        }
        ArrayList<Check> listm1 = Search.major1();
        modelE2 = (DefaultTableModel) Search.jTable2.getModel();
         Object rowDatam1[] = new Object[5];
        for(int i = 0; i < listm1.size()/2; i++){
            rowDatam1[0] = listm1.get(i).courseno;
            rowDatam1[1] = listm1.get(i).title;
            rowDatam1[2] = listm1.get(i).units;
            rowDatam1[3] = listm1.get(i).term;
            rowDatam1[4] = listm1.get(i).grade;
           modelE2.addRow(rowDatam1);
           if(!listm1.get(i).grade.equals("D") && !listm1.get(i).grade.equals("WP") && !listm1.get(i).grade.equals("NC") && !listm1.get(i).grade.equals("INC") && !listm1.get(i).grade.equals("F")){
                diviend += Integer.parseInt(listm1.get(i).grade);
                divisor ++;
            }
           searchFrame.jTextField4.setText("Maternal and Child Health Nursing");
        }
        ArrayList<Check> listm2 = Search.major2();
        Object rowDatam2[] = new Object[5];
        for(int i = 0; i < listm2.size()/2; i++){
            rowDatam2[0] = listm2.get(i).courseno;
            rowDatam2[1] = listm2.get(i).title;
            rowDatam2[2] = listm2.get(i).units;
            rowDatam2[3] = listm2.get(i).term;
            rowDatam2[4] = listm2.get(i).grade;
            modelE2.addRow(rowDatam2);
            if(!listm2.get(i).grade.equals("D") && !listm2.get(i).grade.equals("WP") && !listm2.get(i).grade.equals("NC") && !listm2.get(i).grade.equals("INC") && !listm2.get(i).grade.equals("F")){
                diviend += Integer.parseInt(listm2.get(i).grade);
                divisor ++;
            }
            searchFrame.jTextField4.setText("Adult Health Nursing");
        }
         ArrayList<Check> listm3 = Search.major3();
        Object rowDatam3[] = new Object[5];
        for(int i = 0; i < listm3.size()/2; i++){
            rowDatam3[0] = listm3.get(i).courseno;
            rowDatam3[1] = listm3.get(i).title;
            rowDatam3[2] = listm3.get(i).units;
            rowDatam3[3] = listm3.get(i).term;
            rowDatam3[4] = listm3.get(i).grade;
            modelE2.addRow(rowDatam3);
            if(!listm3.get(i).grade.equals("D") && !listm3.get(i).grade.equals("WP") && !listm3.get(i).grade.equals("NC") && !listm3.get(i).grade.equals("INC") && !listm3.get(i).grade.equals("F")){
                diviend += Integer.parseInt(listm3.get(i).grade);
                divisor ++;
            }
            searchFrame.jTextField4.setText("Community Health Nursing");
        } 
        ArrayList<Check> listm4 = Search.major4();
        Object rowDatam4[] = new Object[5];
        for(int i = 0; i < listm4.size()/2; i++){
            rowDatam4[0] = listm4.get(i).courseno;
            rowDatam4[1] = listm4.get(i).title;
            rowDatam4[2] = listm4.get(i).units;
            rowDatam4[3] = listm4.get(i).term;
            rowDatam4[4] = listm4.get(i).grade;
            modelE2.addRow(rowDatam4);
            if(!listm4.get(i).grade.equals("D") && !listm4.get(i).grade.equals("WP") && !listm4.get(i).grade.equals("NC") && !listm4.get(i).grade.equals("INC") && !listm4.get(i).grade.equals("F")){
                diviend += Integer.parseInt(listm4.get(i).grade);
                divisor ++;
            }
            searchFrame.jTextField4.setText("Mental Health and Psychiatric Nursing");
        } 
        ArrayList<Check> listm5 = Search.major5();
        Object rowDatam5[] = new Object[5];
        for(int i = 0; i < listm5.size()/2; i++){
            rowDatam5[0] = listm5.get(i).courseno;
            rowDatam5[1] = listm5.get(i).title;
            rowDatam5[2] = listm5.get(i).units;
            rowDatam5[3] = listm5.get(i).term;
            rowDatam5[4] = listm5.get(i).grade;
            modelE2.addRow(rowDatam5);
            if(!listm5.get(i).grade.equals("D") && !listm5.get(i).grade.equals("WP") && !listm5.get(i).grade.equals("NC") && !listm5.get(i).grade.equals("INC") && !listm5.get(i).grade.equals("F")){
                diviend += Integer.parseInt(listm5.get(i).grade);
                divisor ++;
            }
            if(!listm5.get(i).grade.equals("D") && !listm5.get(i).grade.equals("WP") && !listm5.get(i).grade.equals("NC") && !listm5.get(i).grade.equals("INC") && !listm5.get(i).grade.equals("F")){
                diviend += Integer.parseInt(listm5.get(i).grade);
                divisor ++;
            }
            searchFrame.jTextField4.setText("Nursing Administration");
        } 
        model4 = (DefaultTableModel) Search.jTable3.getModel();
        ArrayList<Check> list4 = Search.elective();
        Object rowData4[] = new Object[5];
        for(int i = 0; i < list4.size()/2; i++){
            rowData4[0] = list4.get(i).courseno;
            rowData4[1] = list4.get(i).title;
            rowData4[2] = list4.get(i).units;
            rowData4[3] = list4.get(i).term;
            rowData4[4] = list4.get(i).grade;
            model4.addRow(rowData4);
            if(!list4.get(i).grade.equals("D") && !list4.get(i).grade.equals("WP") && !list4.get(i).grade.equals("NC") && !list4.get(i).grade.equals("INC") && !list4.get(i).grade.equals("F")){
                diviend += Integer.parseInt(list4.get(i).grade);
                divisor ++;
            }
        }
        model3 = (DefaultTableModel) Search.jTable6.getModel();
        ArrayList<Check> list3 = Search.thesis();
        Object rowData3[] = new Object[5];
        for(int i = 0; i < list3.size()/2; i++){
            rowData3[0] = list3.get(i).courseno;
            rowData3[1] = list3.get(i).title;
            rowData3[2] = list3.get(i).units;
            rowData3[3] = list3.get(i).term;
            rowData3[4] = list3.get(i).grade;
            model3.addRow(rowData3);
            if(!list3.get(i).grade.equals("D") && !list3.get(i).grade.equals("WP") && !list3.get(i).grade.equals("NC") && !list3.get(i).grade.equals("INC") && !list3.get(i).grade.equals("F")){
                diviend += Integer.parseInt(list3.get(i).grade);
                divisor ++;
            }
        }
        modeld = (DefaultTableModel) Search.jTable7.getModel();
        ArrayList<Check> listd = Search.backSubject();
        Object rowDatad[] = new Object[5];
        for(int i = 0; i < listd.size()/2; i++){
            rowDatad[0] = listd.get(i).courseno;
            rowDatad[1] = listd.get(i).title;
            rowDatad[2] = listd.get(i).units;
            rowDatad[3] = listd.get(i).term;
            rowDatad[4] = listd.get(i).grade;
            modeld.addRow(rowDatad);
            try{
                if(!listd.get(i).grade.equals("D") && !listd.get(i).grade.equals("WP") && !listd.get(i).grade.equals("NC") && !listd.get(i).grade.equals("INC") && !listd.get(i).grade.equals("F")){
                    diviend += Integer.parseInt(listd.get(i).grade);
                    divisor ++;
                } 
            }catch (NumberFormatException n){
            }
        }
        searchFrame.jTextField6.setText(String.format("%.3f",Search.average(diviend, divisor)));
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable10;
    public static javax.swing.JTable jTable4;
    public static javax.swing.JTable jTable6;
    public static javax.swing.JTable jTable7;
    public static javax.swing.JTable jTable8;
    public static javax.swing.JTable jTable9;
    public static javax.swing.JTextField jTextField2;
    public static javax.swing.JTextField jTextField3;
    public static javax.swing.JTextField jTextField4;
    public static javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    public static javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}