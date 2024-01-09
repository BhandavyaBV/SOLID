package org.example.good.D.Implementations.StackImplementations;

import org.example.good.D.Interfaces.StackInterfaces.IDisplayStack;

public class DisplayStack implements IDisplayStack {
    @Override
    public void displayStack(int[] stack,int stackPointer) {
        System.out.println("Elements in the stack are : ");
        for(int i=stackPointer;i>=0;i--){
            System.out.println(i+":"+stack[i]);
        }
    }
}
