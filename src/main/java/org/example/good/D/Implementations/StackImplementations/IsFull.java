package org.example.good.D.Implementations.StackImplementations;

import org.example.good.D.Interfaces.StackInterfaces.IIsFull;

public class IsFull implements IIsFull {
    @Override
    public boolean isFull(int stackPointer, int[] stack) {
        System.out.println();
        System.out.println("Checks if stack is full");
        System.out.println("Current value of stack pointer "+ stackPointer);
        if(stackPointer==stack.length-1){
            System.out.println("Stack is full");
            return true;
        }
        else{
            System.out.println("Stack is not full");
        }
       return false;
    }
}
