package org.example.good.D.Implementations.ArrayImplementations;

import org.example.good.D.Interfaces.ArrayInterfaces.IFindElem;

public class FindElem implements IFindElem {
    @Override
    public void findElement(int value, int[] intArray) {
        int index=0;
        System.out.println();
        System.out.println("Finding the index of "+value);
        for(int val : intArray){
            if(val==value){
                System.out.println("Element found and index number is "+index);
                break;
            }
            index++;
        }
        if(index==intArray.length){
            System.out.println("Element was not found");
        }
    }
}
