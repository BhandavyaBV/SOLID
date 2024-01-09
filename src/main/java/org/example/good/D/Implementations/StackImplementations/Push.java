package org.example.good.D.Implementations.StackImplementations;

import org.example.good.D.Interfaces.StackInterfaces.IPush;

import java.util.Random;

public class Push implements IPush {
    @Override
    public int[] push(int stackPointer, int[] stack) {
        Random random = new Random();

//        Adding elements into the stack
        if(stackPointer==stack.length-1){
            System.out.println("Stack is full");
            return stack;
        }
        else{
            while(stackPointer!=stack.length-1){
                stackPointer++;
                stack[stackPointer] = random.nextInt(10)+1;
            }

            return stack;
        }
    }
}
