
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
    ArrayList<Module> modules = new ArrayList<Module>();
    ArrayList<Student> students = new ArrayList<Student>();
    DateTime startDate;
    DateTime endDate;

    public Course(String courseName, DateTime startDate,DateTime endDate)
    {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate =endDate;
    }


    public ArrayList<Module> getModules(){

        return modules;
    }

    public void setModules(Module modules){

        this.modules.add(modules);
    }


    public ArrayList<Student> getStudents(){

        return students;
    }

    public void setStudents(Student students){

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

