package org.example.bad.D;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ArrayOperations {
    int[] intArray;
    public void create(){
        System.out.println("Creating new array");
        intArray = new int[10];
        System.out.println("Integer array with length of 10 is created");
        System.out.println();
    }

    public void addValues(){
//        Adding random values to array
        System.out.println("Adding elemnts to array");
        System.out.println("Values and index number of array are : ");
        Random random = new Random();
       for(int i=0;i<10;i++){
           intArray[i] = random.nextInt(10)+1;
           System.out.println(i+":"+intArray[i]);
       }
    }

    public void findElement(int num){
        int index=0;
        System.out.println();
        System.out.println("Finding the index of "+num);
        for(int val : intArray){
            if(val==num){
                System.out.println("Element found and index number is "+index);
                break;
            }
            index++;
        }
        if(index==intArray.length){
            System.out.println("Element was not found");
        }
    }

    public void deleteElement(int value){
        System.out.println();
        boolean isPresent = false;
        System.out.println("Deleting the element "+value);
        for(int i=0;i<intArray.length;i++){
            if(intArray[i]==value){
              intArray[i]=0;
              isPresent=true;
            }
        }
        if(isPresent){
            System.out.println("Element found and deleted");
            displayItems();
        }
        else
            System.out.println("Element not found");
    }

    public void displayItems(){
        System.out.println("Array elements are");
        System.out.print("[");
        for(int i:intArray){
            System.out.print(i+" , ");
        }
        System.out.print("]");
    }
}
