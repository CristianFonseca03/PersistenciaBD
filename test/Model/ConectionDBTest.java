/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
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
    public StudentSQL student;
    public Student std;
    public StudentDAO dao ;
    
    public ConectionDBTest() {
        connect= new ConectionDB();
        student= new StudentSQL();
        std= new Student("201520816", "Cangas", "Gonzales", false, new GregorianCalendar(1996, 3, 27), 6, "5573003");
        dao= new StudentDAO();
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
        assertTrue(connect.isConnected());
    }

    /**
     * Test of getConnect method, of class ConectionDB.
     */
    @Test
    public void testGetStudents() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        StudentDAO dao = new StudentDAO();
        assertNotNull(dao.getStudents());
        ResultSet rs = dao.getStudents();
        while(rs.next()){
            System.out.println(rs.getString(1));
            System.out.println(rs.getString("name"));
        }
    }
    
    @Test
    public void testGetStudent() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        assertNotNull(dao.getStudent("123456"));
    }
    
    @Test
    public void testinsertStudent() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        assertTrue(dao.insertStudent(std));
    }
    
    
    
}
