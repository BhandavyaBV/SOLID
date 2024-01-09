package org.example.good.D.Implementations.ArrayImplementations;

import org.example.good.D.Interfaces.ArrayInterfaces.IDeleteElement;

public class DeleteElement implements IDeleteElement {
    @Override
    public int[] deleteElement(int value, int[] intArray) {
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
        }
        else
            System.out.println("Element not found");
        return intArray;
    }
}
