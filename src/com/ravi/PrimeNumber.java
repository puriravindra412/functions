package com.ravi;
import java.util.Objects;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int ans=Prime(n);
        if(Objects.equals(ans, 1)){
            System.out.println("Prime");
        }
        else{
            System.out.println(("Non-Prime"));;
        }



    }
    public static int Prime(int n){
        if(n%2==0){
            return 1;
        }
        return 0;
    }
}
