package com.ravi;

import java.util.Scanner;
import java.lang.Math;
public class PrintArmstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
       // double length=Math.pow(10,n);
        for (int i=100;i<1000;i++){
            if(checkArmstrong(i)){
                System.out.print(i+" ");
            }

        }
    }



    private static boolean checkArmstrong(int i) {
        int sum=0,length =String.valueOf(i).length();
        while(i>0){
            int temp=i%10;
            sum+=Math.pow(temp,length);
            i=i/10;
        }
        return sum == i;
    }

}
