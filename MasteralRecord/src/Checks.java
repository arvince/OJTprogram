/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvince Neil
 */
import java.io.*;

public class Checks implements Comparable, Serializable {
	String idnum;
	String name;
	String courseno;
	String title;
	String units;
	String term;
	String grade;
        String course;
        int recordId;

	public Checks(){
		name="";
		idnum="";
		courseno="";
		title="";
		units="";
		term="";
		grade="";
                course="";
	}

	public Checks(String n, String i, String c, String t, String u, String tm, String g, String cr, int id){
		name=n;
		idnum=i;
		courseno=c;
		title=t;
		units=u;
		term=tm;
		grade = g;
                course=cr;
                recordId = id;
	}

	public void setName(String n){
		name=n;
	}
        
        public void setIdnum(String i){
		idnum=i;
	}

	public void setCourseno(String c){
		courseno=c;
	}

	public void setTitle(String t){
		title=t;
	}

	public void setUnits(String u){
		units=u;
	}

	public void setTerm(String tm){
		term=tm;
	}

	public void setGrade(String g){
		grade = g;
	}
        public void setCourse(String cr){
		course = cr;
	}

	public String getName(){
		return name;
	}
        public String getIdnum(){
		return idnum;
	}
	public String getCourseno(){
		return courseno;
	}
	public String getTitle(){
		return title;
	}
	public String getUnits(){
		return units;
	}
	public String getTerm(){
		return term;
	}
	public String getGrade(){
		return grade;
	}
        public String getCourse(){
		return course;
	}
        public int getRecordId(){
            return recordId;
        }
        
        public String toString(){
		return (name+"/"+idnum+"/"+courseno+"/"+title+"/"+units+"/"+term+"/"+grade+"/"+course);
	}


        @Override
	public int compareTo(Object o){
		int result=0;
		result = this.toString().compareToIgnoreCase(((Checks) o).toString());
		return result;
	}

	}




