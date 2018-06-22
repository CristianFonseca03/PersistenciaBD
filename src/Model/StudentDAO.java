/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.beans.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

/**
 *
 * @author Sala 6
 */
public class StudentDAO {
    public ConectionDB connect;
    public StudentSQL sql;

    public StudentDAO() {
        connect = new ConectionDB();
        sql = new StudentSQL();
    }
    
    public ResultSet getStudents() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        if(connect.isConnected()){
            java.sql.Statement st = connect.getConnect().createStatement();
            return st.executeQuery(sql.getStudents());
        }
        return null;
    }
    
    public ResultSet getStudent(String code) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        if(connect.isConnected()){
           java.sql.Statement st = connect.getConnect().createStatement();
           return st.executeQuery(sql.getStudent(code));
        }
        return null;
    }
    
    public boolean insertStudent(Student std) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException{
        int n=0;
        if(connect.isConnected()){
            java.sql.Statement st = connect.getConnect().createStatement();
            n = st.executeUpdate(sql.insertStudents(std.getCode(), std.getName(), std.getLastName(), std.isGender()?"M":"F",getdate(std.getDateBirthDay()) , String.valueOf(std.getSemester()), std.getPhone()));
        }
        return n>0;
    }
    
    private String getdate(Calendar date){
           int y = date.get(Calendar.YEAR);
           int m= date.get(Calendar.MONTH);
           int d = date.get(Calendar.DAY_OF_MONTH);
           return y+"/"+m+"/"+d;
    }

}
