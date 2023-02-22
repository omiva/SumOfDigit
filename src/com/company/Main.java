package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        sumDigits();
    }

    private static void sumDigits() {
        int[] arr=new int[10];
        Scanner ss=new Scanner(System.in);
        int n=ss.nextInt();

        for(int i=0;i<n;i++)
        {
            arr[i]=ss.nextInt();

        }

    }

}
