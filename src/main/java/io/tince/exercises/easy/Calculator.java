package io.tince.exercises.easy;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * Calculator
 *
 * Have the function calculator(str) take the str parameter being passed and evaluate the mathematical expression within in.
 * For example, if str were "2+(3-1)*3" output should be 8.
 *
 * */
public class Calculator {
    public static void main(String[] args) throws ScriptException {
        String str1 = "6*(4/2)+3*1";
        System.out.println(calculator(str1));
    }
    private static String calculator(String str) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        // Create a JavaScript engine
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        // Evaluate the expression
        Object result = engine.eval(str);
        // Convert the result to a double
        return String.valueOf(result);
    }
}
