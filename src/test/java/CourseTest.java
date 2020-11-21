import org.junit.Before;

import org.junit.Test;

import org.joda.time.DateTime;


import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;




public class CourseTest
{

private Course courseTest;
private String courseTestName = "Games Programming";

private DateTime testStartDate = new DateTime(2021,8,15,10,30);

private DateTime testEndDate = new DateTime(2025,6,23,4,30);



private Module modTest;
private Student studentTest;

@Before
    public void init()
{
courseTest = new Course(courseTestName,testStartDate,testEndDate);

courseTest.setModules(modTest);
courseTest.setStudents(studentTest);


}

@Test
    public void testName()
{

    assertEquals(courseTest.getCourseName(),courseTestName); // checking to see if the method getCourseName returns the same String as courseTest


}

@Test
    public void testModule()
{
assertTrue(courseTest.getModules().contains(modTest));


}

@Test
    public void testStartDate() {
    assertEquals(courseTest.getStartDate(),testStartDate);

}
@Test public void testEndDate() {
    assertEquals(courseTest.getEndDate(),testEndDate);

}



}
