package org.example.good.D.Implementations.StackImplementations;

import org.example.good.D.Interfaces.StackInterfaces.IIsEmpty;

public class IsEmpty implements IIsEmpty {
    @Override
    public boolean isStackEmpty(int[] stack, int stackPointer) {
        System.out.println();
        System.out.println("Checks if stack is empty");
        System.out.println("Current value of stack pointer:"+stackPointer);
        if(stackPointer==-1){
            System.out.println("Stack is empty");
            return true;
        }
        else
            System.out.println("Stack is not empty");
        System.out.println();
        return false;
    }
}
