
import org.joda.time.DateTime;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;


/**
 *
 * @author rohin
 */



public class Student {
    String studentName;
    int studentAge;
    DateTime dateOfBirth;
    int studentId;
    String userName;
   ArrayList<Course> studentCourses = new ArrayList<Course>();
   ArrayList<Module> studentMods = new ArrayList<Module>();

    public Student(String studentName,int studentAge, DateTime dateOfBirth, int studentId){
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
    }

    public String getStudentName(){
        return studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    public int getStudentAge(){
        return studentAge;
    }

    public void setStudentAge(int studentAge){
        this.studentAge = studentAge;
    }



    public DateTime getDOB(){
        return dateOfBirth;
    }

    public void setDOB(DateTime dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public int getStudentID(){
        return studentId;
    }

    public void setStudentId(int studentId){
        this.studentId = studentId;
    }

    public ArrayList<Course> getStudentCourses() { // ArrayList type Course in order to return instances of Course
        return studentCourses;
    }

        public void setStudentCourses(Course studentCourses){
        this.studentCourses.add(studentCourses);
    }



    public ArrayList<Module> getStudentMods(){ // ArrayList type Module in order to return instances of Module
        return studentMods;
    }

    public void setStudentMods(Module studentMods){
        this.studentMods.add(studentMods);
    }

    public String getStudentUsername(){ // The username of the student is created by concatinating the Student's name and Age
        this.userName = getStudentName().concat(String.valueOf(getStudentAge()));
        return userName;
    }



}
