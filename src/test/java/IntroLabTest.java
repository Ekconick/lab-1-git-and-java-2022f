/*
 * This file contains JUnit test cases for IntroLab.java
 *
 */


import org.junit.*;

import static org.junit.Assert.*;

public class IntroLabTest {
    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test(timeout = 1000)
    public void testExampleStudent() {
        String expected = "Hello! My name is Stu Dent! " +
                "I like cats more than dogs! Welcome to CSC207!";
        String actual = IntroLab.exampleStudent();
        assertEquals(expected, actual);
    }

    /*
     * As a reference, we've included testExampleStudent above.
     */
    @Test(timeout = 1000)
    public void testFuyuhan6() {
        String expected = "Hello! My name is Yuhan Fu! I like cats more than dogs! nice to meet you!";
        String actual = IntroLab.fuyuhan6();
        assertEquals(expected, actual);
    }
}