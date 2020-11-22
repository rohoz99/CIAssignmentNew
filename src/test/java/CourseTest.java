import org.junit.Before;

import org.junit.Test;

import org.joda.time.DateTime;


import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;




public class CourseTest
{
// Assigning variables for testing
private Course courseTest;
private String courseTestName = "Computer Science";

private DateTime testStartDate = new DateTime(2021,8,15,10,30);

private DateTime testEndDate = new DateTime(2025,6,23,4,30);


// 2 instances of module and Student to be used while testing
private Module modTest;
private Student studentTest;

@Before
    public void init() // Initialising the instance
{
courseTest = new Course(courseTestName,testStartDate,testEndDate);

courseTest.setModules(modTest);
courseTest.setStudents(studentTest);


}

@Test
    public void testName() //  Testing the getCourseName function
{

    assertEquals(courseTest.getCourseName(),courseTestName); // checking to see if the method getCourseName returns the same String as courseTest


}

@Test
    public void testModule() // TESTING THE GETMODULES method
{
assertTrue(courseTest.getModules().contains(modTest));


}

@Test
public void testStudentList() { // Testing the getStudents method

    assertTrue(courseTest.getStudents().contains(studentTest));
}

@Test
    public void testStartDate() { // Testing the getStartDate method
    assertEquals(courseTest.getStartDate(),testStartDate);

}
@Test public void testEndDate() { // Testing the getEndDate Method
    assertEquals(courseTest.getEndDate(),testEndDate);

}



}
