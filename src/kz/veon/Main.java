package kz.veon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main=new Main();
        Scanner sc = new Scanner(System.in);
        int a = 1;
        System.out.print("Enter integer data: ");
        if (sc.hasNextInt()){
            a=sc.nextInt();
            System.out.format("summ of numbers in integer=%d", main.summOfInteger(a));
        }else{
            System.out.println("Not integer data");
        }
    }

    public int summOfInteger(int a){
        return summOfInteger(a,0);
    }

    public int summOfInteger(int a,int summ){
        if (a>9){
            summ=summ+a%10;
            a=a / 10;
        }else{
            return summ+a;
        }
       return summOfInteger(a,summ);
    }

}
