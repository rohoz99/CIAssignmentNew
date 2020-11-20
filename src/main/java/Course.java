
import org.joda.time.DateTime;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * * @author rohin

 */
public class Course {
    String courseName;
    ArrayList<String> modules = new ArrayList<String>();
    ArrayList<String> students = new ArrayList<String>();
    DateTime startDate;
    DateTime endDate;

    public Course(String course, DateTime start,DateTime end)
    {
        course= courseName;
        start = startDate;
        end = endDate;
    }


    public ArrayList<String> getModules(){

        return modules;
    }

    public void setModules(String modules){

        this.modules.add(modules);
    }


    public ArrayList<String> getStudents(){

        return students;
    }

    public void setStudents(String students){

        this.students.add(students);
    }

    public DateTime getStartDate(){
        return startDate;
    }

    public void setStartDate(DateTime startDate){

        this.startDate = startDate;
    }

    public DateTime getEndDate(){
        return endDate;
    }

    public void setEndDate(DateTime endDate){
        this.endDate = endDate;

    }

    public String getCourseName() {

        return courseName;

    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
}

