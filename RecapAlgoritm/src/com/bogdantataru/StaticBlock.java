package com.bogdantataru;

public class StaticBlock {

    public static void main(String args[]){
        StudentSB s1 = new StudentSB();
        s1.showData();
        s1.a = 1;
        StudentSB s2 = new StudentSB();
        s2.showData();
        StudentSB.b++;
        s1.showData();
    }
}

class StudentSB {
    int a; //initialized to zero
    static int b; //initialized to zero only when class is loaded not for each object created.

    StudentSB(){
        //Constructor incrementing static variable b
        b++;
    }

    public void showData(){
        System.out.println("Value of a = "+a);
        System.out.println("Value of b = "+b);
    }

    public  void increment(){
    a++;
    }
}
