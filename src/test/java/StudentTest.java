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

       studentTest = new Student(studentNameTest,studentAgeTest,DOBTest,studentIdTest);
       studentTest.setStudentCourses(courseTest);
       studentTest.setStudentMods(modTest);


   }

   @Test
    public void testStudentName(){

       assertEquals(studentTest.getStudentName(),studentNameTest);

   }

   @Test
   public void testStudentAge(){

       assertEquals(studentTest.getStudentAge(),studentAgeTest);
   }

   @Test
    public void testStudentDOB() {

       assertEquals(studentTest.getDOB(),DOBTest);
   }

   @Test
    public void testStudentId() {

       assertEquals(studentTest.getStudentID(),studentIdTest);

   }

   @Test
    public void getCoursesTest(){

       assertTrue(studentTest.getStudentCourses().contains(courseTest));
   }


   @Test
    public void getModulesTest(){

       assertTrue(studentTest.getStudentMods().contains(modTest));
   }

   @Test
    public void getStudentUserNameTest(){

       assertEquals(studentTest.getStudentUsername(),userNameTest);
   }

}
