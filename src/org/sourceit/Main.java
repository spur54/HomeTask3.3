package org.sourceit;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner x=new Scanner(System.in);
        int i=(int)(Math.random()*100+1);
        int b;
        while (true){
            System.out.println("enter your number");
            b=x.nextInt();
            if (b>i){
                System.out.println("too big");
            }
            if (i>b){
                System.out.println("too short");
            }
            if (i==b){
                System.out.println("CONGRATS U WON");
                break;
            }
        }
    x.close();
    }
}

