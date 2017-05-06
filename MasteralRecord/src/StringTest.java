import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvince Neil
 */
public class StringTest {
    
    public static String FILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\test.txt";
    public static String OVERWRITEFILENAME = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\myFile.txt";
    public static String line = "";
    public static String value = "";
    
    public static void main(String args[]) throws FileNotFoundException, IOException{  
//        
//        try{
//            BufferedReader br;           
//                br = new BufferedReader(new FileReader(FILENAME));
//            BufferedWriter bw;
//                bw = new BufferedWriter(new FileWriter(OVERWRITEFILENAME,true));
//            StringBuilder sb = new StringBuilder();
//            
//            while ((line = br.readLine()) != null) {
//                sb.append(line +"\r\n");
//            } 
//            sb.replace(0,7,"Death"); 
//            value = sb.toString();
//            while ((value = br.readLine()) != null) {
//                bw.write(value + System.getProperty("line.separator"));
//            } 
//            System.out.println(value);
//            
//            br.close();  
//            bw.close();
//        }catch (Exception e) {
//            
//        }
        
        try{  
            BufferedReader br;           
            br = new BufferedReader(new FileReader(FILENAME));
            BufferedWriter bw;
            bw = new BufferedWriter(new FileWriter(OVERWRITEFILENAME));
                    
            
            
            while ((line = br.readLine()) != null) {
                bw.write(line.replaceAll("Alcaide", "ALCAIDE")+ System.getProperty("line.separator"));
            } 
            br.close();  
            bw.close();
            
           
         }catch (IOException e) {
            e.printStackTrace();
        }
    }  
    
}
