
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rohin
 */
public class Module {
    String modName;
    String modId;
    ArrayList<Student> listOfStudents = new ArrayList<Student>();
    ArrayList<Course> listOfCourses = new ArrayList<Course>();

    public Module(String modName, String modId){
        this.modName =modName;
        this.modId = modId;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName){
        this.modName = modName ;

    }

    public String getModId(){
        return modId;
    }

    public void setModId(String modId){
        this.modId = modId;
    }

    public ArrayList<Student> getListOfStudents(){
        return listOfStudents;
    }
    public void setStudentList(Student listOfStudents){
        this.listOfStudents.add(listOfStudents);
    }

    public ArrayList<Course> getListOfCourses(){
        return listOfCourses;
    }

    public void setCourseList(Course listOfCourses){
        this.listOfCourses.add(listOfCourses);
    }




}
