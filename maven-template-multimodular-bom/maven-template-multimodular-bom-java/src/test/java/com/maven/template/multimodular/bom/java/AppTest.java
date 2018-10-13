package com.maven.template.multimodular.bom.java;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Test MySql dependency included through BOM
     */
    public void testDependencyImport() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            fail("MySql JDBC Driver not found, so dependency import isn't working");
        }
    }
}
