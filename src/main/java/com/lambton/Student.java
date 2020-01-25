package com.lambton;

import java.util.Date;
enum Gender
{
    MALE,
    FEMALE,
    OTHER,
}
public class Student
{
    int studentId;
    String firstName;
    String lastName;
    Date birthDate;
    Gender gender;
    float totalMarks;
    public void setData(int studentId, String firstName, String lastName, Date birthDate, Gender gender, float totalMarks)
    {
        this.studentId=studentId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.birthDate=birthDate;
        this.gender=gender;
        this.totalMarks=totalMarks;
    }
    public void printData()
    {
        System.out.println("studentId" + studentId);
        System.out.println("firstName" + firstName);
        System.out.println("lastName" + lastName);
        System.out.println("birthDate" + birthDate);
        System.out.println("gender" + gender);
        System.out.println("totalMarks" + totalMarks);
    }

}
