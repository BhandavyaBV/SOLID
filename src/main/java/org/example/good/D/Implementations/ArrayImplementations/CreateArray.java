package org.example.good.D.Implementations.ArrayImplementations;

import org.example.good.D.Interfaces.ArrayInterfaces.ICreateArray;

public class CreateArray implements ICreateArray {
    @Override
    public int[] createArray(int[] intArray) {
        System.out.println("Creating new array");
        intArray = new int[10];
        System.out.println("Integer array with length of 10 is created");
        System.out.println();
        return intArray;
    }
}
