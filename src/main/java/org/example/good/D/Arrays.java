package org.example.good.D;

import org.example.good.D.Interfaces.ArrayInterfaces.*;

public class Arrays {
    int[] intArray;
    IFindElem findElem;
    IAddValues addValues;
    ICreateArray createArray;
    IDeleteElement deleteElement;
    IDisplayItems displayItems;

    public Arrays(IFindElem findElem, IAddValues addValues, ICreateArray createArray, IDeleteElement deleteElement, IDisplayItems displayItems) {
        this.findElem = findElem;
        this.addValues = addValues;
        this.createArray = createArray;
        this.deleteElement = deleteElement;
        this.displayItems = displayItems;
    }

    public void implementArrayOperations(){
        intArray = createArray.createArray(intArray);
        intArray = addValues.addValues(intArray);
        findElem.findElement(3,intArray);
        intArray = deleteElement.deleteElement(6,intArray);
        displayItems.displayElements(intArray);
    }
}
