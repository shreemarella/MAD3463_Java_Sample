package com.lambton;

import java.util.Date;

public class StudentMainClass
{
public static void main(String[] args)
{
    Student s1 = new Student();
    s1.setData(1,"Shree","Marella",new Date(2020,0,24),Gender.MALE,60 );
    s1.printData();
}

}
