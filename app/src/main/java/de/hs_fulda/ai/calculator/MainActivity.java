package de.hs_fulda.ai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import de.hs_fulda.ai.calculator.Classes.Calculator;
import de.hs_fulda.ai.calculator.Classes.Numbers;
import de.hs_fulda.ai.calculator.Classes.OperationString;
import de.hs_fulda.ai.calculator.Repository.IOnClickRepository;

public class MainActivity extends AppCompatActivity implements IOnClickRepository
{
    private EditText editInput;
    private TextView tvOverview;
    private Button btnClearClearAll;

    private double number1;
    private double number2;
    private boolean isAdd;
    private boolean isSubtract;
    private boolean isMultiply;
    private boolean isDivide;
    private boolean isCleared;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast toast = Toast.makeText(this, "Welcome", Toast.LENGTH_SHORT);
        toast.show();

        btnClearClearAll = (Button) findViewById(R.id.btnClearClearAll);

        //disable keyboard for all textual views
        tvOverview = (TextView) findViewById(R.id.tvOverview);
        editInput = (EditText) findViewById(R.id.editInput) ;
        editInput.setShowSoftInputOnFocus(false);
        tvOverview.setShowSoftInputOnFocus(false);

        //enable scrolling for the TextView
        tvOverview.setMovementMethod(new ScrollingMovementMethod());

        //register OnClick-Methods
            calculate();
            clear();
            clearLastDigit();
            zero();
            one();
            two();
            three();
            four();
            five();
            six();
            seven();
            eight();
            nine();
            dot();

            add();
            subtract();
            multiply();
            divide();
    }


    /***
     * OnClick-Event for calculate-Button.
     */
    @Override
    public void calculate()
    {
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    presentCalculationOnScreen(OperationString.EQUALS);
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);
                }
                }
        });
    }


    /***
     * OnClick-Event for zero-Button.
     */
    @Override
    public void zero()
    {
        Button btnZero = (Button) findViewById(R.id.btnZero);
        btnZero.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    setTextOfEditText(Numbers.ZERO);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                }
        });
    }


    /***
     * OnClick-Event for one-Button.
     */
    @Override
    public void one()
    {
        Button btnOne = (Button) findViewById(R.id.btnOne);
        btnOne.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    setTextOfEditText(Numbers.ONE);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                }
        });
    }


    /***
     * OnClick-Event for two-Button.
     */
    @Override
    public void two()
    {
        Button btnTwo = (Button) findViewById(R.id.btnTwo);
        btnTwo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    setTextOfEditText(Numbers.TWO);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                }
                }
        });
    }


    /***
     * OnClick-Event for three-Button.
     */
    @Override
    public void three()
    {
        Button btnThree = (Button) findViewById(R.id.btnThree);
        btnThree.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    setTextOfEditText(Numbers.THREE);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


    /***
     * OnClick-Event for four-Button.
     */
    @Override
    public void four() {
        Button btnFour = (Button) findViewById(R.id.btnFour);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    setTextOfEditText(Numbers.FOUR);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
                catch (Exception ex) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }


    /***
     * OnClick-Event for five-Button.
     */
    @Override
    public void five()
    {
        Button btnFive = (Button) findViewById(R.id.btnFive);
        try
        {
            btnFive.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setTextOfEditText(Numbers.FIVE);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for six-Button.
     */
    @Override
    public void six()
    {
        Button btnSix = (Button) findViewById(R.id.btnSix);
        try
        {
            btnSix.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setTextOfEditText(Numbers.SIX);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for seven-Button.
     */
    @Override
    public void seven()
    {
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        try
        {
            btnSeven.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setTextOfEditText(Numbers.SEVEN);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for eight-Button.
     */
    @Override
    public void eight()
    {
        Button btnEight = (Button) findViewById(R.id.btnEight);
        try
        {
            btnEight.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setTextOfEditText(Numbers.EIGHT);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for nine-Button.
     */
    @Override
    public void nine()
    {
        Button btnNine = (Button) findViewById(R.id.btnNine);
        try
        {
            btnNine.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setTextOfEditText(Numbers.NINE);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for dot-Button.
     */
    @Override
    public void dot()
    {
        Button btnDot = (Button) findViewById(R.id.btnDot);
        try
        {
            btnDot.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    setTextOfEditText(Numbers.DOT);
                    isCleared = false;
                    btnClearClearAll.setText("C");
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for clear-Button.
     */
    @Override
    public void clear()
    {
        btnClearClearAll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(isCleared == false)
                {
                    isCleared = true;
                    editInput.setText("0");
                    btnClearClearAll.setText("AC");
                }
                else
                {
                    isCleared = false;
                    number1 = 0;
                    number2 = 0;
                    editInput.setText("0");
                    tvOverview.setText("");
                    btnClearClearAll.setText("C");
                }
            }
        });
    }


    /***
     * OnClick-Event for delete-Button.
     */
    @Override
    public void clearLastDigit()
    {
        Button btnDelete = (Button) findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if (!getText().isEmpty())
                {
                    String newText = getText().substring(0, getText().length()-1);
                    editInput.setText(newText);
                }
            }
        });
    }


    /***
     * OnClick-Event for addition-Button.
     */
    @Override
    public void add()
    {
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        try
        {
            btnAdd.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    isAdd = true;
                    presentCalculationOnScreen(OperationString.ADDITION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for subtraction-Button.
     */
    @Override
    public void subtract()
    {
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        try {
            btnSubtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isSubtract = true;
                    presentCalculationOnScreen(OperationString.SUBTRACTION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for multiplication-Button.
     */
    @Override
    public void multiply()
    {
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        try
        {
            btnMultiply.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    isMultiply = true;
                    presentCalculationOnScreen(OperationString.MULTIPLICATION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * OnClick-Event for division-Button.
     */
    @Override
    public void divide()
    {
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        try
        {
            btnDivide.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    isDivide = true;
                    presentCalculationOnScreen(OperationString.DIVISION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /***
     * Get the text from the input-EditText.
     * @return
     */
    public String getText()
    {
        if(!editInput.getText().toString().isEmpty())
        {
            String text ;
            text = editInput.getText().toString();
            return text;
        }
        else
        {
            return "0";
        }
    }


    /***
     * Sets the input EditText to the value of the pressed button.
     * @param digit - Constant of class Numbers
     */
    public void setTextOfEditText(Object digit)
    {
        //if the pressed button is an instance of Character (like a '.' is)...
        if (digit instanceof Character)
        {
            //and if the pressed button was the '.'-button...
            if ((char)digit == Numbers.DOT)
            {
                //and if there is no dot in the input field yet...
                if (!getText().contains(String.valueOf(Numbers.DOT)))
                {
                    //show a dot into the input field.
                    editInput.setText(getText() + String.valueOf(digit));
                }
                //and if the dot is the first digit...
                if (getText().length()==1 && getText().contains(String.valueOf(Numbers.DOT)))
                {
                    //put a zero before it: "." --> "0.".
                    editInput.setText(Numbers.ZERO + String.valueOf(digit));
                }
            }
        }
        //numbers are always possible
        else if(digit instanceof Integer)
        {
            //a 2 digits number can not start with 0
            if(getText().length() == 1 && getText().equals(String.valueOf(Numbers.ZERO)))
            {
                editInput.setText(String.valueOf(digit));
            }
            //every other input can have more than 1 digit.
            else
            {
                editInput.setText(getText() + String.valueOf(digit));
            }
        }
    }


    /***
     * Shows the calculation history in the TextView and set the input field depending on
     * which operation was clicked.
     *
     * (Could be split in separate methods, but grew along the application.
     * Maybe someday it can be refactored...if necessary.)
     *
     * @param operation - a mathematical operation-char-value of OperationString class.
     */
    private void presentCalculationOnScreen(char operation)
    {
        try
        {
            Calculator calculator = new Calculator();

            //if pressed operation-method is add or subtract or multiply or divide...
            if(operation == OperationString.ADDITION || operation == OperationString.SUBTRACTION
                    || operation == OperationString.MULTIPLICATION || operation == OperationString.DIVISION)
            {
                //and if input field is not empty
                if(!getText().isEmpty()) {
                    //and if it is the second number to calculate with...
                    if ((getText().contains(String.valueOf(OperationString.ADDITION))) || (getText().contains(String.valueOf(OperationString.SUBTRACTION)))
                            || (getText().contains(String.valueOf(OperationString.MULTIPLICATION))) || (getText().contains(String.valueOf(OperationString.DIVISION))))
                    {
                        //show the value of the pressed Button in the input field
                        tvOverview.append(getText() + "\n");

                        //get only the numeric value
                        String helper = getText().substring(getText().indexOf(" ")).trim();

                        //if helper is empty set number2 to zero
                        if (helper.isEmpty())
                        {
                            number2 = 0;
                        }
                        //if helper is not empty, set number2 to the numeric value of the input field
                        if (!helper.isEmpty())
                        {
                            number2 = Double.parseDouble(helper);
                        }
                        //if the input field contains an addition-sign...
                        if (getText().contains(String.valueOf(OperationString.ADDITION)))
                        {
                            //calculate result of addition out of number1 and number2...
                            number1 = calculator.add(number1, number2);
                            //and show the result in the TextView
                            tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                            isAdd =false;
                        }
                        //else if the input field contains a subtraction-sign...
                        else if (getText().contains(String.valueOf(OperationString.SUBTRACTION)))
                        {
                            //calculate result of subtraction out of number1 and number2...
                            number1 = calculator.subtract(number1, number2);
                            //and show the result in the TextView
                            tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                            isSubtract = false;
                        }
                        //else if the input field contains a multiplication-sign...
                        else if (getText().contains(String.valueOf(OperationString.MULTIPLICATION)))
                        {
                            //calculate result of multiplication out of number1 and number2...
                            number1 = calculator.multiply(number1, number2);
                            //and show the result in the TextView
                            tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                            isMultiply = false;
                        }
                        //else if the input field contains a division-sign...
                        else if (getText().contains(String.valueOf(OperationString.DIVISION)))
                        {
                            //calculate result of division out of number1 and number2...
                            number1 = calculator.divide(number1, number2);
                            //and show the result in the TextView
                            tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                            isDivide = false;
                        }

                        //set the input-field text to the operation sign and separate it with space from the next numeric input.
                        editInput.setText(String.valueOf(operation) + " ");

                        //set value of number2 to zero
                        number2 = 0;
                    }
                    //if the input-field text does not contain any operation sign
                    else
                    {
                        //set the TextView to the value of the input-field
                        tvOverview.setText(getText() + "\n");

                        //set number1 to the number of the input-field
                        number1 = Double.parseDouble(getText());

                        //and set input field-text to 'operation ' (example: '+ ')
                        editInput.setText(String.valueOf(operation) + " ");
                    }
                }
            }
            //if the pressed button is the equals-button (btnCalculate)
            else if(operation == OperationString.EQUALS)
            {
                //and if the input-field text contains a mathematical operation sign (+-x÷)
                if ((getText().contains(String.valueOf(OperationString.ADDITION)))
                        || (getText().contains(String.valueOf(OperationString.SUBTRACTION)))
                        || (getText().contains(String.valueOf(OperationString.MULTIPLICATION)))
                        || (getText().contains(String.valueOf(OperationString.DIVISION))))
                {
                    //and if the operation that was pressed is addition...
                    if(isAdd == true)
                    {
                        //show the add sign and the number in the TextView
                        tvOverview.append(getText() + "\n");

                        //get only the number of the input-field value...
                        String helper = getText().substring(getText().indexOf(" ")).trim();
                        //set value of number2 to the number-value that was extracted the step before...
                        number2 = Double.parseDouble(helper);

                        //calculate the result
                        number1 = calculator.add(number1, number2);
                        //show it in the TextView and separate the calculation by a line from the next calculation...
                        tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                        //set the text of the input-field to the result of the calculation, in case user is going to calculate again with this value...
                        editInput.setText(String.valueOf(number1));

                        //reset number2
                        number2 = 0;

                        //reset isAdd
                        isAdd = false;
                    }
                    //xor the operation that was pressed is subtraction...
                    else if(isSubtract == true)
                    {
                        //look at comments in the if-block above
                        tvOverview.append(getText() + "\n");

                        String helper = getText().substring(getText().indexOf(" ")).trim();
                        number2 = Double.parseDouble(helper);

                        number1 = calculator.subtract(number1, number2);
                        tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                        editInput.setText(String.valueOf(number1));

                        number2 = 0;

                        //reset isSubtract
                        isSubtract = false;
                    }
                    //xor the operation that was pressed is multiplication...
                    else if(isMultiply == true)
                    {
                        //look at comment in the elseif-block above
                        tvOverview.append(getText() + "\n");

                        String helper = getText().substring(getText().indexOf(" ")).trim();
                        number2 = Double.parseDouble(helper);

                        number1 = calculator.multiply(number1, number2);
                        tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                        editInput.setText(String.valueOf(number1));

                        number2 = 0;

                        //reset isMultiply
                        isMultiply = false;
                    }
                    //xor the operation that was pressed is division...
                    else if(isDivide == true)
                    {
                        //look at comment in the elseif-block above
                        tvOverview.append(getText() + "\n");

                        String helper = getText().substring(getText().indexOf(" ")).trim();
                        number2 = Double.parseDouble(helper);

                        number1 = calculator.divide(number1, number2);
                        tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                        editInput.setText(String.valueOf(number1));

                        number2 = 0;

                        //reset isDivide
                        isDivide = false;
                    }
                }
            }
        }
        catch (Exception ex)
        {
            isDivide = false;
            isSubtract = false;
            isAdd = false;
            isMultiply = false;

            number1 = 0;
            number2 = 0;

            editInput.setText("0");
            tvOverview.append("Wait..., what? Please calculate again!" + "\n" + OperationString.DIVIDER + "\n");
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong! - Please calculate again!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
