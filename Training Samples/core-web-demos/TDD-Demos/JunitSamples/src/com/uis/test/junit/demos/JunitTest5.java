package com.uis.test.junit.demos;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
 
/**
 * JUnit Suite Test
 * @author Venkata Saranu
 *
 */
 
@RunWith(Suite.class)
@Suite.SuiteClasses({
        JunitTest1.class,
        JunitTest2.class,
        JunitTest3.class
})
public class JunitTest5 {
}