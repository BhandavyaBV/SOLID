package org.example.bad.D;

import java.util.ArrayList;
import java.util.Random;

public class StackOperations {
    int[] stack;
    int stackPointer=-1;

    public void create(){
        System.out.println("Creating a stack of 10 items");
        stack = new int[10];
        System.out.println("Successfully created a stack");
    }

    public void push(){
        Random random = new Random();

//        Adding elements into the stack
        if(stackPointer==stack.length-1){
            System.out.println("Stack is full");
        }
        else{
            while(stackPointer!=stack.length-1){
                stackPointer++;
                stack[stackPointer] = random.nextInt(10)+1;
            }
        }

    }

    public void pop(){
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

    public void displayStack(){
        System.out.println("Elements in the stack are : ");
        for(int i=stackPointer;i>=0;i--){
            System.out.println(i+":"+stack[i]);
        }
    }

    public void isFull(){
        System.out.println();
        System.out.println("Checks if stack is full");
        System.out.println("Current value of stack pointer "+ stackPointer);
        if(stackPointer==stack.length-1){
            System.out.println("Stack is full");
        }
        System.out.println();
    }

    public void isEmpty(){
        System.out.println();
        System.out.println("Checks if stack is empty");
        System.out.println("Current value of stack pointer:"+stackPointer);
        if(stackPointer==-1){
            System.out.println("Stack is empty");
        }
        else
            System.out.println("Stack is not empty");
        System.out.println();
    }
}
