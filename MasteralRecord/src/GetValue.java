
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import masteralrecord.Data.*;
import masteralrecord.Entity.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvince Neil
 */
public class GetValue extends javax.swing.JFrame {

    /**
     * Creates new form GetValue
     */
    public GetValue() {
        initComponents();
    }
    public static String FileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\test.txt";
    public static String FILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\myFile.txt";
    public static String OVERREADFILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\myTempFile.txt";
    public static String OVERWRITEFILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\myFile.txt";
    public static String TEMPFILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\myTempFile.txt";
    DefaultTableModel model1;
    String line = "";
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "ID", "Code", "Title", "Unit", "Sem", "Grade", "Course"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Alcaide, Arvince Neil A.", "2153240", "NU-201", "Webtech", "3", "1 sem 2016-2017", "80", "BSIT"}
            },
            new String [] {
                "Name", "ID", "Code", "Title", "Units", "Sem", "Grade", "Course"
            }
        ));
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setHeaderValue("Name");
            jTable2.getColumnModel().getColumn(1).setHeaderValue("ID");
            jTable2.getColumnModel().getColumn(2).setHeaderValue("Code");
            jTable2.getColumnModel().getColumn(3).setHeaderValue("Title");
            jTable2.getColumnModel().getColumn(4).setHeaderValue("Units");
            jTable2.getColumnModel().getColumn(5).setHeaderValue("Sem");
            jTable2.getColumnModel().getColumn(6).setHeaderValue("Grade");
            jTable2.getColumnModel().getColumn(7).setHeaderValue("Course");
        }

        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(15, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

//        model1 = (DefaultTableModel) jTable1.getModel();
//        ArrayList<Check> list1 = allSubject();
//        Object rowData1[] = new Object[5];
//        for(int i = 0; i < list1.size(); i++){
//            rowData1[0] = list1.get(i).courseno;
//            rowData1[1] = list1.get(i).title;
//            rowData1[2] = list1.get(i).units;
//            rowData1[3] = list1.get(i).term;
//            rowData1[4] = list1.get(i).grade;
//            model1.addRow(rowData1);
//        }
//        
//        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileName,true))) {

//			for (int i = 0; i < list1.size(); i++ ){
                            String content = (String) jTable1.getModel().getValueAt(0, 0)+"/"+jTable1.getModel().getValueAt(0, 1)+"/"+jTable1.getModel().getValueAt(0, 2)+"/"+jTable1.getModel().getValueAt(0, 3)+"/"+jTable1.getModel().getValueAt(0, 4)+"/"+jTable1.getModel().getValueAt(0, 5)+"/"+jTable1.getModel().getValueAt(0, 6)+"/"+jTable1.getModel().getValueAt(0, 7);
                            bw.newLine();
                            bw.write(content);
//                        }
			

			// no need to close it.
			//bw.close();

			System.out.println("Done");
                        bw.close();

		} catch (IOException e) {

			e.printStackTrace();

		}

        try{  
            BufferedReader br;           
            br = new BufferedReader(new FileReader(FILENAME));
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(TEMPFILENAME));
                    
            
            
            while ((line = br.readLine()) != null) {
                String trimmedLine = line.trim();
                if(trimmedLine.contains("bbb"))continue;{
                    bw.write(line + System.getProperty("line.separator"));
                }
                System.out.println("Done1");
            } 
            br.close();  
            bw.close();
            
           
         }catch (IOException e) {
            e.printStackTrace();
        }
        try{
            BufferedReader bro;   
            bro = new BufferedReader(new FileReader(OVERREADFILENAME));
            BufferedWriter bwo;
            bwo = new BufferedWriter(new FileWriter(OVERWRITEFILENAME));
             while ((line = bro.readLine()) != null) {

                bwo.write(line + System.getProperty("line.separator"));               
                System.out.println("Done2");
            } bwo.write("fff" + System.getProperty("line.separator"));
            bro.close();  
            bwo.close();
        }catch (Exception e){
            
        }

        
            //         try (BufferedWriter bw = new BufferedWriter(new FileWriter(FileName,false))) {
//
//             if(jTable2.getModel().getValueAt(0, 6) == "80"){
//
////			for (int i = 0; i < list1.size(); i++ ){
//                            String content = (String) jTable2.getModel().getValueAt(0, 0)+"/"+jTable2.getModel().getValueAt(0, 1)+"/"+jTable2.getModel().getValueAt(0, 2)+"/"+jTable2.getModel().getValueAt(0, 3)+"/"+jTable2.getModel().getValueAt(0, 4)+"/"+jTable2.getModel().getValueAt(0, 5)+"/"+jTable2.getModel().getValueAt(0, 6)+"/"+jTable2.getModel().getValueAt(0, 7);
//                            bw.newLine();
//                            bw.write(content);
////                        }
//
//
//			// no need to close it.
//			//bw.close();
//             }
//
//			System.out.println("Done");
//
//                        bw.close();
//
//		} catch (IOException e) {
//
//			e.printStackTrace();
//
//		}
        try {
            jTable2.print();
        } catch (PrinterException ex) {
            Logger.getLogger(GetValue.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(GetValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetValue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GetValue().setVisible(true);
            }
        });
    }
    
        public static ArrayList<Check> allSubject(){
         ArrayList<Check> allSubject = new ArrayList<Check>();
         String line = "";
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\myFile.txt";
         if(TranscriptRecordDao.getInstance().GetFileName().equals("") && 
                 TranscriptRecordDao.getInstance().GetRecords().size() < 1){
             TranscriptRecordDao.getInstance().SetFileName(fileName);
             TranscriptRecordDao.getInstance().LoadData();
         }
         TranscriptRecordDao.getInstance().GetRecords().forEach((rec) -> {
             if(rec.name.contains("Yaranon")){
                 allSubject.add(rec);
             }else if(rec.name.equals("")){
                 if (rec.idnum.contains("Yaranon")){
                     allSubject.add(rec);
                 }
             }
        });

//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//            
//
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].contains("Yaranon")){                   
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                allSubject.add(ch);                    
//                } else if (!record[0].equals("")){
//                        if (record[1].contains("Yaranon")){                    
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                allSubject.add(ch);                   
//                }
//                    }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
         return allSubject;
     }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
