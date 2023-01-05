package com.bridgelabz;



public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int ran = (int)( Math.random() * 10 )% 2;
        //System.out.println(ran);
        if(ran == 0)
        {
            System.out.println("Employee is Present");
        }else {
            System.out.println("Employee is Absent");
        }
    }
}
