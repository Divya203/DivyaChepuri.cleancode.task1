package com.divya.cleancode.task2;

import java.io.PrintStream;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	PrintStream out =  new PrintStream(new FileOutputStream(FileDescriptor.out));
        CalculateInterests simpleinterest = new SimpleInterest((double) 20000, 5, 6.8);
        CalculateInterests compoundinterest = new CompoundInterest((double) 20000, 5, 6.8);
        Float simpleInterest = simpleinterest.calculateInterest();
        Float compoundInterest = compoundinterest.calculateInterest();
        out.println("Simple Interest is: " + simpleInterest);
        out.println("Compound Interest is: " + compoundInterest);
        out.close();
    }
}
