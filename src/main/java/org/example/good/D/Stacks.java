package org.example.good.D;

import org.example.good.D.Interfaces.StackInterfaces.*;

public class Stacks {
    int[] stack;

    int stackPointer = -1;
    ICreateStack createStack;
    IDisplayStack displayStack;
    IIsEmpty isEMpty;
    IIsFull isFull;
    IPop pop;
    IPush push;

    public Stacks(ICreateStack createStack, IDisplayStack displayStack, IIsEmpty isEMpty, IIsFull isFull, IPop pop, IPush push) {
        this.createStack = createStack;
        this.displayStack = displayStack;
        this.isEMpty = isEMpty;
        this.isFull = isFull;
        this.pop = pop;
        this.push = push;
    }

    public void stackOperationsImplementations(){
        stack = createStack.createStack(stack);
        boolean isStackFull = isFull.isFull(stackPointer,stack);
        if(!(isStackFull)){
            stack = push.push(stackPointer,stack);
            stackPointer = 9;
        }
        else{
            System.out.println("Stack is full");
        }
        displayStack.displayStack(stack,stackPointer);

        boolean isStackEmpty = isEMpty.isStackEmpty(stack,stackPointer);
        if(isStackEmpty){
            System.out.println("Stack is empty. Cannot pop the elements");
        }
        else
            pop.pop(stackPointer,stack);

    }
}

