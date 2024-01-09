package org.example.good.D.Implementations.ArrayImplementations;

import org.example.good.D.Interfaces.ArrayInterfaces.IAddValues;

import java.util.Random;

public class AddValues implements IAddValues {
    @Override
    public int[] addValues(int[] intArray) {
        //        Adding random values to array
        System.out.println("Adding elemnts to array");
        System.out.println("Values and index number of array are : ");
        Random random = new Random();
        for(int i=0;i<10;i++){
            intArray[i] = random.nextInt(10)+1;
            System.out.println(i+":"+intArray[i]);
        }
        return intArray;
    }
}
