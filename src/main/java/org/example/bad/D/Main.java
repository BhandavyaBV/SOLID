package org.example.bad.D;

public class Main {
    public static void main(String[] args){
        System.out.println("This program shows the working of 2 basic data structures - Arrays and Stacks");

        System.out.println("-----------Array Implementations----------");

//        Higher level class main depending directly on lower level class Arrays Operations
        ArrayOperations arrays = new ArrayOperations();
        arrays.create();
        arrays.addValues();
        arrays.findElement(3);
        arrays.deleteElement(6);
        System.out.println();
        System.out.println("-------------Array Implementation end-------------------");

        System.out.println();

//        Higher order element depending on lower order element
        System.out.println("---------------Implementing stack operations---------------");
        StackOperations stack = new StackOperations();
        stack.create();
        stack.isEmpty();
        stack.push();
        stack.displayStack();
        stack.isFull();
        stack.pop();
        System.out.println("--------------Stack implementation end----------------");
    }
}
