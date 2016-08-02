package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] myIntegers = getIntegers(5);
        int [] sorted = sortArray(myIntegers);
        printArray(sorted);
    }

    public static int[] getIntegers(int number){

        int[] values= new int[number];
        System.out.println("Enter " + number + " integer values. \r");
        for(int i=0;i<values.length;i++){
            values[i]=scanner.nextInt();
        }
        return values;
    }
    public static void printArray(int[] values)
    {
        for(int i=0;i<values.length;i++)
        System.out.println("Element " +  i + " contains " + values[i]);
    }
    public static int[] sortArray(int[] values){

/*        int[] sortedArr =  new int[values.length];
        for(int i=0;i<values.length;i++){
            sortedArr[i]=values[i];
        }*/
        int[] sortedArr = values.clone();
        boolean flag = true;
        int temp;
        while (flag == true)
        {
            flag=false;
            for (int i=0;i<sortedArr.length-1;i++)
            {
                if(sortedArr[i]<sortedArr[i+1]){
                    temp=sortedArr[i];
                    sortedArr[i]= sortedArr[i+1];
                    sortedArr[i+1] = temp;
                    flag =true;

                }
            }
        }


        return  sortedArr;
    }

}
