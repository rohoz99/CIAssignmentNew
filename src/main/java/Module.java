
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
    int modId;
    ArrayList<String> listOfStudents = new ArrayList<String>();
    ArrayList<String> listOfCourses = new ArrayList<String>();

    public Module(String moduleName, int idNum){
        moduleName = modName;
        idNum = modId;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName){
        this.modName = modName ;

    }

    public int getModId(){
        return modId;
    }

    public void setModId(int modId){
        this.modId = modId;
    }

    public ArrayList<String> getListOfStudents(){
        return listOfStudents;
    }
    public void setStudentList(String listOfStudents){
        this.listOfStudents.add(listOfStudents);
    }

    public ArrayList<String> getListOfCourses(){
        return listOfCourses;
    }

    public void setCourseList(String listOfCourses){
        this.listOfCourses.add(listOfCourses);
    }




}
