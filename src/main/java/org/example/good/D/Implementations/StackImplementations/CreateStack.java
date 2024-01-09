package org.example.good.D.Implementations.StackImplementations;

import org.example.good.D.Interfaces.StackInterfaces.ICreateStack;

public class CreateStack implements ICreateStack {
    @Override
    public int[] createStack(int[] stack) {
        System.out.println("Creating a stack of 10 items");
        stack = new int[10];
        System.out.println("Successfully created a stack");
        return stack;
    }
}
