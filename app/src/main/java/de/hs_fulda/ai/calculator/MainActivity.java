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
    private Calculator calculator = new Calculator();

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
        calculateBtnClicked();
        clearBtnClicked();
        clearLastDigitBtnClicked();
        zeroBtnClicked();
        oneBtnClicked();
        twoBtnClicked();
        threeBtnClicked();
        fourBtnClicked();
        fiveBtnClicked();
        sixBtnClicked();
        sevenBtnClicked();
        eightBtnClicked();
        nineBtnClicked();
        dotBtnClicked();
        addBtnClicked();
        subtractBtnClicked();
        multiplyBtnClicked();
        divideBtnClicked();
    }


    /**
     * OnClick-Event for calculate-Button.
     */
    @Override
    public void calculateBtnClicked()
    {
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    calculate(OperationString.EQUALS);
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);
                }
            }
        });
    }


    /**
     * OnClick-Event for zero-Button.
     */
    @Override
    public void zeroBtnClicked()
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


    /**
     * OnClick-Event for one-Button.
     */
    @Override
    public void oneBtnClicked()
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


    /**
     * OnClick-Event for two-Button.
     */
    @Override
    public void twoBtnClicked()
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


    /**
     * OnClick-Event for three-Button.
     */
    @Override
    public void threeBtnClicked()
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


    /**
     * OnClick-Event for four-Button.
     */
    @Override
    public void fourBtnClicked() {
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


    /**
     * OnClick-Event for five-Button.
     */
    @Override
    public void fiveBtnClicked()
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


    /**
     * OnClick-Event for six-Button.
     */
    @Override
    public void sixBtnClicked()
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


    /**
     * OnClick-Event for seven-Button.
     */
    @Override
    public void sevenBtnClicked()
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


    /**
     * OnClick-Event for eight-Button.
     */
    @Override
    public void eightBtnClicked()
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


    /**
     * OnClick-Event for nine-Button.
     */
    @Override
    public void nineBtnClicked()
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


    /**
     * OnClick-Event for dot-Button.
     */
    @Override
    public void dotBtnClicked()
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


    /**
     * OnClick-Event for clear-Button.
     */
    @Override
    public void clearBtnClicked()
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


    /**
     * OnClick-Event for delete-Button.
     */
    @Override
    public void clearLastDigitBtnClicked()
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


    /**
     * OnClick-Event for addition-Button.
     */
    @Override
    public void addBtnClicked()
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
                    calculate(OperationString.ADDITION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /**
     * OnClick-Event for subtraction-Button.
     */
    @Override
    public void subtractBtnClicked()
    {
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        try {
            btnSubtract.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    isSubtract = true;
                    calculate(OperationString.SUBTRACTION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /**
     * OnClick-Event for multiplication-Button.
     */
    @Override
    public void multiplyBtnClicked()
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
                    calculate(OperationString.MULTIPLICATION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /**
     * OnClick-Event for division-Button.
     */
    @Override
    public void divideBtnClicked()
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
                    calculate(OperationString.DIVISION);
                }
            });
        }
        catch (Exception ex) {
            Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }


    /**
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


    /**
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


    /**
     * Prove whether it is the first number input or second number input
     * of the calculation.
     * @param input - the input of the EditText field.
     * @return true if it is the first, false if not.
     */
    private boolean isFirstInput(String input)
    {
        if (!input.contains(" "))
        {
            return true;
        }
        else
        {
            return false;
        }
    }


    /**
     * Calculates the values and shows them with a layout
     * in the TextView
     *
     * @param operation - The used operation (+, -, x, %, =)
     */
    private void calculate(char operation)
    {
        //if it is the first number for the calculation
        if (isFirstInput(getText()))
        {
            //initialize the variable with the input value
            number1 = Double.parseDouble(getText());
            //show the value in the View and set a new input text
            tvOverview.append(String.valueOf(number1) + "\n");
            editInput.setText(operation + " ");
        }
        // if it is the second input value of the calculation (contains the operation sign if not OperationString.EQUALS)
        else
        {
            if (getText().length() >= Numbers.THREE)
            {
                //if it is a calculation...
                if (operation != OperationString.EQUALS)
                {
                    //calculate and show the result in the View (Addition)
                    if (getText().contains(String.valueOf(OperationString.ADDITION)))
                    {
                        add();

                        tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n");
                        editInput.setText(operation + " ");
                    }
                    //calculate and show the result in the View (Subtraction)
                    else if (getText().contains(String.valueOf(OperationString.SUBTRACTION)))
                    {
                        subtract();

                        tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n");
                        editInput.setText(operation + " ");
                    }
                    //calculate and show the result in the View (Multiplication)
                    else if (getText().contains(String.valueOf(OperationString.MULTIPLICATION)))
                    {
                        multiply();

                        tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n");
                        editInput.setText(operation + " ");
                    }
                    //calculate and show the result in the View (Division)
                    else if (getText().contains(String.valueOf(OperationString.DIVISION)))
                    {
                        divide();

                        tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n");
                        editInput.setText(operation + " ");
                    }
                }
                //if it is a end result
                else
                {
                    //l. getEndResult
                    getEndResult();
                }
            }
        }
    }

    /***
     * HELPER-METHOD
     *
     * Sum up two numbers.
     */
    private void add()
    {
        number2 = Double.parseDouble(getText().substring(getText().indexOf(" ")).trim());
        number1 = calculator.add(number1, number2);
        isAdd = false;
    }


    /**
     * HELPER-METHOD
     *
     * Subtract two numbers.
     */
    private void subtract()
    {
        number2 = Double.parseDouble(getText().substring(getText().indexOf(" ")).trim());
        number1 = calculator.subtract(number1, number2);
        isSubtract = false;
    }


    /**
     * Multiply two numbers.
     */
    private void multiply()
    {
        number2 = Double.parseDouble(getText().substring(getText().indexOf(" ")).trim());
        number1 = calculator.multiply(number1, number2);
        isMultiply = false;
    }


    /**
     * HELPER-METHOD
     *
     * Divide two numbers
     */
    private void divide()
    {
        number2 = Double.parseDouble(getText().substring(getText().indexOf(" ")).trim());
        number1 = calculator.divide(number1, number2);
        isDivide = false;
    }


    /**
     * HELPER-METHOD
     *
     * Calculates the final result of all operations and
     * Shows everything in the TextView.
     * It is possible to calculate with this result in one step.
     */
    private void getEndResult()
    {
        //if the end result is needed out of an addition
        if (isAdd == true)
        {
            //calculate
            add();
            //show in views
            tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");
            editInput.setText(String.valueOf(number1));
        }
        //if the end result is needed out of an subtraction
        else if (isSubtract == true)
        {
            //calculate
            subtract();

            //show in views
            tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");
            editInput.setText(String.valueOf(number1));
        }
        //if the end result is needed out of an multiplication
        else if (isMultiply == true)
        {
            //calculate
            multiply();

            //show in views
            tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");
            editInput.setText(String.valueOf(number1));
        }
        //if the end result is needed out of an division
        else if (isDivide == true)
        {
            //calculate
            divide();

            //show in views
            tvOverview.append(getText() + "\n" + OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");
            editInput.setText(String.valueOf(number1));
        }
    }
}
