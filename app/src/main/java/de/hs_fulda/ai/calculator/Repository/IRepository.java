package de.hs_fulda.ai.calculator.Repository;

/**
 * Created by edv-steynb on 19.05.2017.
 */

public interface IRepository
{

    /***
     * Multiply two numbers.
     * @param number1
     * @param number2
     * @return double - the calculated value.
     */
    double multiply(double number1, double number2);


    /***
     * Divide two numbers.
     * @param number1
     * @param number2
     * @return double - the calculated value.
     */
    double divide(double number1, double number2);


    /***
     * Add two numbers.
     * @param number1
     * @param number2
     * @return double - the calculated value.
     */
    double add(double number1, double number2);


    /***
     * Subtract two numbers.
     * @param number1
     * @param number2
     * @return double - the calculated value.
     */
    double subtract(double number1, double number2);

}
