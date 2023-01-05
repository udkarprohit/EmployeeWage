package com.bridgelabz;



public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int ran = (int)( Math.random() * 10 )% 2;
        int dWage = 0;
        //System.out.println(ran);
        if(ran == 0)
        {
            System.out.println("Employee is Present");
            dWage = WAGE_PER_HOUR * FULL_DAY;
        }else {
            System.out.println("Employee is Absent");
        }
        System.out.println("Employee Wage per day : " + dWage);
    }
}
