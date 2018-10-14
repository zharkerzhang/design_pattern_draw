package com.zharker.designpattern;

import com.zharker.designpattern.interpreter.Calculator;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class InterpreterTest {

    public static void main(String[] arg) throws IOException {
        new InterpreterTest().interpreterTest();
    }


    public void interpreterTest() throws IOException {
        String expStr = getExpStr();
        HashMap<String,Integer> var = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println(expStr+"="+calculator.run(var));
    }

    private HashMap<String,Integer> getValue(String expStr) throws IOException {
        HashMap<String,Integer> result = new HashMap<>();
        for (char ch : expStr.toCharArray()){
            if(ch != '+' && ch != '-'){
                if(!result.containsKey(String.valueOf(ch))){
                    System.out.println("input the value of "+String.valueOf(ch)+": ");
                    String in = new BufferedReader(new InputStreamReader(System.in)).readLine();
                    result.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return result;
    }

    private String getExpStr() throws IOException {
        System.out.println("input the expression:");
        return new BufferedReader(new InputStreamReader(System.in)).readLine();
    }


}
