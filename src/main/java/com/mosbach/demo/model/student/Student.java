package com.mosbach.demo.model.student;

public class Student {

    // StudentenInformationen sind komplett ignoriert
    // TODO
    // alle Aktionen müssten Datenbank-Aktionen mit einschließen
    // StudentManager schreiben
    // TaskManager anpassen, so dass er den Student auch nutzt
    //

    private String firstName;
    private String lastName;
    private String loginedInToken;


    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLoginedInToken() {
        return loginedInToken;
    }

    public void setLoginedInToken(String loginedInToken) {
        this.loginedInToken = loginedInToken;
    }

    public void logStudentOff() {
        loginedInToken = "";
    }


}
