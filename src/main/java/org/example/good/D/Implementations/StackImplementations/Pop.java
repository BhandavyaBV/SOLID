package org.example.good.D.Implementations.StackImplementations;

import org.example.good.D.Interfaces.StackInterfaces.IPop;

public class Pop implements IPop {
    @Override
    public void pop(int stackPointer, int[] stack) {
        System.out.println("The main difference between stacks and arrays are stacks follows the principle of first-in-last-out");
        System.out.println("Retrival of the values happen in the following order");
        if(stackPointer==-1){
            System.out.println("Stack is empty");
        }
        else{
            while(stackPointer!=-1){
                System.out.println(stackPointer+":"+stack[stackPointer]);
                stackPointer--;
            }
        }
    }
}
