/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sala 6
 */
public class StudentSQL {
    public String getStudents(){
        return "select * from student";
    }
    public String getStudent(String id){
        return "select * from student where code ='"+id+"'";
    }
    public String insertStudents(String code,String name,String last,String gender,String date,String sm,String phone){
        return "INSERT INTO student VALUES('"+code+"','"+name+"','"+last+"','"+gender+"','"+date+"','"+sm+"','"+phone+"')";
    }
}
