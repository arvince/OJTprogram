import java.awt.BorderLayout;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HelloWorld{
    private static Scanner input;
     public static void main(String []args){

        try{
//        ArrayList<Check> records = loadDataFile();
        Object columnNames[] = { "Name", "ID Number", "Course No.", "Descriptive Title", "Unit", "Term", "Grade" };
        String result [][] = new String [1][7];
//        for(int i = 0; i < records.size(); i++){
//            result[i][0] = records.get(i).getName();
//            result[i][1] = records.get(i).getIdnum();
//            result[i][2] = records.get(i).getCourseno();
//            result[i][3] = records.get(i).getTitle();
//            result[i][4] = records.get(i).getUnits();
//            result[i][5] = records.get(i).getTerm();
//            result[i][6] = records.get(i).getGrade();
//        }
//        
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = new JTable(result, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.setSize(1500, 1500);
        frame.setVisible(true);

     } catch (Exception e) {
             
             }
     } 

//     public static ArrayList<Check> loadDataFile(){
//         ArrayList<Check> rows = new ArrayList<Check>();
//         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
//         String line = "";
//
//         try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
//             input = new Scanner(System.in);
//            String in;
//
//            System.out.print("Please enter you search: ");
//                in = input.nextLine();
//            while ((line = br.readLine()) != null) {
//                String[] record = line.split("/");
//                if (record[0].equals(in)){
// //                   if(record[2].equals("NU-201") || record[2].equals("NU-202") || record[2].equals("NU-203")|| record[2].equals("NU-204")){
//                Check ch = new Check(record[0], record[1], record[2], record[3], record[4], record[5], record[6], record[7]);
//                rows.add(ch);
//                System.out.println(ch.toString());
// //                   }
//                }
//            }
//         }catch (IOException e) {
//            e.printStackTrace();
//        }
//         return rows;
//     }
}
