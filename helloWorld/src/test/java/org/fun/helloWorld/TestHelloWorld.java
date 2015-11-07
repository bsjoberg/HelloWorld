package org.fun.helloWorld;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class TestHelloWorld 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public TestHelloWorld( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static TestSuite suite()
    {
        return new TestSuite( TestHelloWorld.class );
    }

    @Test
    public void testClass(){
    	HelloWorld helloWorld = new HelloWorld();
    	assertEquals(helloWorld.getClass(), HelloWorld.class);
    }
    
    /**
     * Rigourous Test :-)
     */
    @Test
    public void testHelloWorld()
    {
        assertEquals("HelloWorld", HelloWorld.getHelloWorld());
    }
}
