package de.hs_fulda.ai.calculator.Repository;

/**
 * Created by edv-steynb on 19.05.2017.
 */

public interface IOnClickRepository
{
    /***
     * Action for pressing the '='-Button.
     */
    void calculate();


    /***
     * Action for pressing the '0'-Button.
     */
    void zero();


    /***
     * Action for pressing the '1'-Button.
     */
    void one();


    /***
     * Action for pressing the '2'-Button.
     */
    void two();


    /***
     * Action for pressing the '3'-Button.
     */
    void three();


    /***
     * Action for pressing the '4'-Button.
     */
    void four();


    /***
     * Action for pressing the '5'-Button.
     */
    void five();


    /***
     * Action for pressing the '6'-Button.
     */
    void six();


    /***
     * Action for pressing the '7'-Button.
     */
    void seven();


    /***
     * Action for pressing the '8'-Button.
     */
    void eight();


    /***
     * Action for pressing the '9'-Button.
     */
    void nine();


    /***
     * Action for pressing the '.'-Button.
     */
    void dot();


    /***
     * Action for pressing the 'C'-Button.
     */
    void clear();


    /***
     * Action for pressing the '<x'-Button.
     */
    void clearLastDigit();


    /***
     * Action for pressing the '<x'-Button.
     */
    void add();


    /***
     * Action for pressing the '<x'-Button.
     */
    void subtract();


    /***
     * Action for pressing the '<x'-Button.
     */
    void multiply();


    /***
     * Action for pressing the '<x'-Button.
     */
    void divide();
}
