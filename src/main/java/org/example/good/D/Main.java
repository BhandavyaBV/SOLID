package org.example.good.D;

import org.example.good.D.Implementations.ArrayImplementations.*;
import org.example.good.D.Implementations.StackImplementations.*;
import org.example.good.D.Interfaces.ArrayInterfaces.*;
import org.example.good.D.Interfaces.StackInterfaces.*;

public class Main {
    public static void main(String[] args){
//        Array interfaces
        IAddValues addValues = new AddValues();
        ICreateArray createArray = new CreateArray();
        IDeleteElement deleteElement = new DeleteElement();
        IDisplayItems displayItems = new DisplayItems();
        IFindElem findElem = new FindElem();
        Arrays arrayOperations = new Arrays(findElem,addValues,createArray,deleteElement,displayItems);
        arrayOperations.implementArrayOperations();

//        Stack Interfaces
        System.out.println();
        System.out.println("------------Implementing Stack Operations-------------");
        ICreateStack createStack = new CreateStack();
        IDisplayStack displayStack = new DisplayStack();
        IIsEmpty isEmpty = new IsEmpty();
        IIsFull isFull = new IsFull();
        IPop pop = new Pop();
        IPush push = new Push();
        Stacks stackOperations = new Stacks(createStack,displayStack,isEmpty,isFull,pop,push);
        stackOperations.stackOperationsImplementations();
        System.out.println("------------Stack operations implementations end-------------");
    }
}
