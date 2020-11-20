
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

import org.joda.time.DateTime;

public class Student {
    String studentName;
    int studentAge;
    DateTime dateOfBirth;
    int studentId;
    String userName;
    ArrayList<String> studentCourses = new ArrayList<String>();
    ArrayList<String> studentMods = new ArrayList<String>();

    public Student(String name,int age, DateTime dob, int id){
        studentName = name;
        studentAge = age;
        dateOfBirth = dob;
        studentId = id;
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

    public ArrayList<String> getStudentCourses() {
        return studentCourses;
    }

    public void setStudentCourses(String studentCourses){
        this.studentCourses.add(studentCourses);
    }



    public ArrayList<String> getStudentMods(){
        return studentMods;
    }

    public void setStudentMods(String studentMods){
        this.studentMods.add(studentMods);
    }

    public String getStudentUsername(){
        this.userName = getStudentName().concat(String.valueOf(getStudentAge()));
        return userName;
    }

}
