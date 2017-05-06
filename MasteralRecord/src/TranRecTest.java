/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import masteralrecord.Data.*;
import masteralrecord.Entity.*;
/**
 *
 * @author Arvince Neil
 */
public class TranRecTest {
    public static void main(String[] args){
         String fileName = "C:\\Users\\Arvince Neil\\Desktop\\MasteralRecord\\src\\masteral.txt";
         
         TranscriptRecordDao transRec = TranscriptRecordDao.getInstance();
         transRec.SetFileName(fileName);
         if(transRec.LoadData()){
             for(Check chr : transRec.GetRecords()){
                 System.out.println(chr.getRecordId() + ": " + chr.toString());
                 if(chr.getName().contains("Alcaide, Arvince Neil A.")){
                     chr.setTitle("Bean");
                     break;
                 }
             }
             
             System.out.println("Writing contents");
             transRec.SaveContentToFile();
             System.out.println("Writing contents finished");
         }else{
             
         }
    }
}
