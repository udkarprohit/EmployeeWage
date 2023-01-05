package com.bridgelabz;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY = 8;
    static final int PART_TIME_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        int ran = (int)( Math.random() * 10 )% 3;
        int dWage = 0;
        //System.out.println(ran);
        switch (ran) {
            case 1:
                System.out.println("Employee is Present");
                dWage = WAGE_PER_HOUR * FULL_DAY;
                break;
            case 2:
                System.out.println("Employee is Part time");
                dWage = WAGE_PER_HOUR * PART_TIME_HOUR;
                break;
            default:
                System.out.println("Employee is Absent");
        }


//        if(ran == 0)
//        {
//            System.out.println("Employee is Present");
//            dWage = WAGE_PER_HOUR * FULL_DAY;
//        }else if(ran == 1){
//            System.out.println("Employee is Absent");
//        } else {
//            System.out.println("Employee is Part time");
//            dWage = WAGE_PER_HOUR * PART_TIME_HOUR;
//        }
        System.out.println("Employee Wage per day : " + dWage);
    }
}
