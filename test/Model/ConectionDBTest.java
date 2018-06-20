/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA4
 */
public class ConectionDBTest {
    public ConectionDB connect;
    
    public ConectionDBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of isConnected method, of class ConectionDB.
     */
    @Test
    public void testIsConnected() throws Exception {
        connect=new ConectionDB();
        assertTrue(connect.isConnected());
    }

    /**
     * Test of getConnect method, of class ConectionDB.
     */
    @Test
    public void testGetConnect() {
    }
    
}
