import org.junit.Before;

import org.junit.Test;

import org.joda.time.DateTime;


import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertNotNull;

import static org.junit.Assert.assertTrue;


public class ModuleTest {
    private Module modTest;
    private String modNameTest = "Programming Paradigms";

    private Student studentTest;
    private Course courseTest;

    private String modIdTest = "CT404";


    @Before
    public void init(){

        modTest = new Module(modNameTest,modIdTest);
        modTest.setCourseList(courseTest);
        modTest.setStudentList(studentTest);

    }

    @Test
    public void modNameTest(){

        assertEquals(modTest.getModName(),modNameTest);

    }

    @Test
    public void getCourseListTest() {

        assertTrue(modTest.getListOfCourses().contains(courseTest));

    }



    @Test
    public void modIdTest()
    {

        assertEquals(modTest.getModId(),modIdTest);

    }


    @Test
    public void getStudentListTest() {

        assertTrue(modTest.getListOfStudents().contains(studentTest));
    }



}
