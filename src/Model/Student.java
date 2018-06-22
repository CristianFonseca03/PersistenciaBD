/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Calendar;

/**
 *
 * @author SALA4
 */
public class Student {

    private String code;
    private String name;
    private String lastName;
    private boolean gender;
    private Calendar dateBirthDay;
    private int semester;
    private String phone;

    public Student(String code, String name, String lastName, boolean gender, Calendar dateBirthDay, int semester, String phone) {
        this.code = code;
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.dateBirthDay = dateBirthDay;
        this.semester = semester;
        this.phone = phone;
    }

    

    @Override
    public String toString() {
        return "Student{" + "code=" + code + ", name=" + name + ", lastName=" + lastName + ", gender=" + gender + ", dateBirthDay=" + dateBirthDay + ", semester=" + semester + ", phone=" + phone + '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Calendar getDateBirthDay() {
        return dateBirthDay;
    }

    public void setDateBirthDay(Calendar dateBirthDay) {
        this.dateBirthDay = dateBirthDay;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
    
}
