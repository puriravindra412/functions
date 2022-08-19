package com.ravi;
import java.util.Objects;
import  java.util.Scanner;
import java.lang.Math;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
       if(Objects.equals(checkArmstrong(n),n)){
           System.out.println("number is Armstrong = "+n);
       }else{
           System.out.println("number is not armstrong");
       }
    }

    private static int checkArmstrong(int n) {
        int sum=0,length =String.valueOf(n).length();
        while(n>0){
            int temp=n%10;
            sum+=Math.pow(temp,length);
            n=n/10;
        }
        return sum;
    }

}
