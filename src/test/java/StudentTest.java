import org.junit.Before;

import org.junit.Test;

import org.joda.time.DateTime;


import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;


public class StudentTest {
    private Student studentTest;
    private Module modTest;
    private Course courseTest;
   private String studentNameTest = "Jimmy Fallon";
   private int studentAgeTest = 17;
   private DateTime DOBTest = new DateTime(1999,1,29,00,00);
   private int studentIdTest = 1756;
   private String userNameTest = "Jimmy Fallon17";


   @Before
    public void init(){
// Initialising the Student instance
       studentTest = new Student(studentNameTest,studentAgeTest,DOBTest,studentIdTest);
       studentTest.setStudentCourses(courseTest);
       studentTest.setStudentMods(modTest);


   }

   @Test
    public void testStudentName(){ //Testing the getStudentName() method

       assertEquals(studentTest.getStudentName(),studentNameTest);

   }

   @Test
   public void testStudentAge(){ // Testing the getStudentAge() method

       assertEquals(studentTest.getStudentAge(),studentAgeTest);
   }

   @Test
    public void testStudentDOB() { // Testing the getDOB() method

       assertEquals(studentTest.getDOB(),DOBTest);
   }

   @Test
    public void testStudentId() { // Testing the getStudent() method

       assertEquals(studentTest.getStudentID(),studentIdTest);

   }

   @Test
    public void getCoursesTest(){ // Testing the getStudentCourses() method

       assertTrue(studentTest.getStudentCourses().contains(courseTest));
   }


   @Test
    public void getModulesTest(){ // Testing the getStudentMods() method

       assertTrue(studentTest.getStudentMods().contains(modTest));
   }

   @Test
    public void getStudentUserNameTest(){ // Testing the getStudentUsername() method

       assertEquals(studentTest.getStudentUsername(),userNameTest);
   }

}
