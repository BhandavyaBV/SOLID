package org.example.good.D.Implementations.ArrayImplementations;

import org.example.good.D.Interfaces.ArrayInterfaces.IDisplayItems;

public class DisplayItems implements IDisplayItems {
    @Override
    public void displayElements(int[] intArray) {
        System.out.println("Array elements are");
        System.out.print("[");
        for(int i:intArray){
            System.out.print(i+" , ");
        }
        System.out.print("]");
    }
}
