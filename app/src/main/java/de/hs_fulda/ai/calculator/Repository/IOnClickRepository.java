package de.hs_fulda.ai.calculator.Repository;

/**
 * Created by edv-steynb on 19.05.2017.
 */

public interface IOnClickRepository
{
    /***
     * Action for pressing the '='-Button.
     */
    void calculateBtnClicked();


    /***
     * Action for pressing the '0'-Button.
     */
    void zeroBtnClicked();


    /***
     * Action for pressing the '1'-Button.
     */
    void oneBtnClicked();


    /***
     * Action for pressing the '2'-Button.
     */
    void twoBtnClicked();


    /***
     * Action for pressing the '3'-Button.
     */
    void threeBtnClicked();


    /***
     * Action for pressing the '4'-Button.
     */
    void fourBtnClicked();


    /***
     * Action for pressing the '5'-Button.
     */
    void fiveBtnClicked();


    /***
     * Action for pressing the '6'-Button.
     */
    void sixBtnClicked();


    /***
     * Action for pressing the '7'-Button.
     */
    void sevenBtnClicked();


    /***
     * Action for pressing the '8'-Button.
     */
    void eightBtnClicked();


    /***
     * Action for pressing the '9'-Button.
     */
    void nineBtnClicked();


    /***
     * Action for pressing the '.'-Button.
     */
    void dotBtnClicked();


    /***
     * Action for pressing the 'C'-Button.
     */
    void clearBtnClicked();


    /***
     * Action for pressing the '<x'-Button.
     */
    void clearLastDigitBtnClicked();


    /***
     * Action for pressing the '<x'-Button.
     */
    void addBtnClicked();


    /***
     * Action for pressing the '<x'-Button.
     */
    void subtractBtnClicked();


    /***
     * Action for pressing the '<x'-Button.
     */
    void multiplyBtnClicked();


    /***
     * Action for pressing the '<x'-Button.
     */
    void divideBtnClicked();
}
