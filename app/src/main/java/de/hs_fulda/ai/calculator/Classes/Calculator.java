package de.hs_fulda.ai.calculator.Classes;

import android.support.v7.app.AppCompatActivity;

import de.hs_fulda.ai.calculator.Repository.IRepository;

/**
 * Created by edv-steynb on 20.05.2017.
 */

public class Calculator extends AppCompatActivity implements IRepository
{

    /***
     * Multiply two numbers.
     * @param number1 the first number to be calculated with
     * @param number2 the second number to be calculated with
     * @return double - the calculated value.
     */
    @Override
    public double multiply(double number1, double number2)
    {
        return number1 * number2;
    }


    /***
     * Divide number1 with number2.
     * @param number1 the first number to be calculated with
     * @param number2 the second number to be calculated with
     * @return double - the calculated value.
     */
    @Override
    public double divide(double number1, double number2)
    {
        return number1 / number2;
    }


    /***
     * Add two numbers.
     * @param number1 the first number to be calculated with
     * @param number2 the second number to be calculated with
     * @return double - the calculated value.
     */
    @Override
    public double add(double number1, double number2)
    {
        return number1 + number2;
    }


    /***
     * Subtract two numbers.
     * @param number1 the first number to be calculated with
     * @param number2 the second number to be calculated with
     * @return double - the calculated value.
     */
    @Override
    public double subtract(double number1, double number2)
    {
        return number1 - number2;
    }
}
