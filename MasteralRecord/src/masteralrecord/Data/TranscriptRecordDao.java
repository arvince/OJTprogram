/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package masteralrecord.Data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import masteralrecord.Entity.*;


/**
 *
 * @author Arvince Neil
 */
public class TranscriptRecordDao {
    
    private static TranscriptRecordDao _instance = new TranscriptRecordDao();
    
    private String _fileName;
    private StringBuilder dataBuilder;
    private ArrayList<Check> _records;
    
    public String GetFileName(){
        return _fileName;
    }
    
    public void SetFileName(String fileName){
        _fileName = fileName;
    }
    
    public ArrayList<Check> GetRecords(){
        return _records;
    }
    
    public TranscriptRecordDao(){
        dataBuilder = new StringBuilder();
        _records = new ArrayList<Check>();
    }
    
    public static TranscriptRecordDao getInstance(){
        return _instance;
    }
    
    public TranscriptRecordDao(String fileName){
        this();
        _fileName = fileName;
    }
    
    public boolean LoadData(){
        boolean isSuccess = true;
        String line;
        int recordId = 1;
        
        if(_fileName != null && _fileName.isEmpty()) 
            return false;
        
        try(BufferedReader reader = new BufferedReader(new FileReader(_fileName))){
            while ((line = reader.readLine()) != null) {      
                String[] record = line.split("/");
                if(record.length == 1) continue;
                
                Check ch = new Check((record.length > 1) ? record[0] : "", (record.length > 2) ? record[1] : "",
                        (record.length > 3) ? record[2] : "", (record.length > 4) ? record[3] : "", (record.length > 5) ? record[4] : "", 
                        (record.length > 6) ? record[5] : "", (record.length > 7) ? record[6] : "",
                        (record.length == 8) ? record[7] : "", recordId);
                _records.add(ch);
                recordId++;
            }
        }catch(Exception e){
            System.out.println(e.toString());
            isSuccess = false;
        }
        
        return isSuccess;
    }
    
    public boolean SaveContentToFile(){
        return SaveContentToFile(PrepareFileContent(_records));
    }
    
    public boolean SaveContentToFile(StringBuilder content){
        boolean isSuccess = true;
        
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(_fileName))){
            writer.write(content.toString());
        }catch(Exception e){
            System.out.println(e.toString());
            isSuccess = false;
        }
        
        return isSuccess;
    }
    
    public static StringBuilder PrepareFileContent(ArrayList<Check> records){
        StringBuilder builder = new StringBuilder();
        
        records.forEach((record) -> {
            builder.append(record.toString()).append("\r\n");
        });
        
        return builder;
    }
}
