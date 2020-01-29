package com.lambton;

public class ArithmeticMain
{

        public static void main(String[] args)
        {
            Arithmetic a=new Arithmetic();
            a.add(2,3);
            a.add(5.0f,4.5f);
            a.add("Shree","Marella");
            a.add("Shree",13);
            a.add(13,"Marella");
            a.add(14,15, 16);
            a.add(17,18, 19.5f);
            a.add(7.5f,4);
            a.add(19.5f,17, 18);
            a.add("Shree",13, 25.3f);
            a.add(15,16.5);
            a.add(15,16.5f);
        }
    }
