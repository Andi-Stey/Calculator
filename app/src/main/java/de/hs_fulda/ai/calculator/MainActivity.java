package de.hs_fulda.ai.calculator;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
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
    EditText editInput;
    TextView tvOverview;
    private double number1;
    private double number2;
    private Calculator calculator;
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
        calculator = new Calculator();
        tvOverview = (TextView) findViewById(R.id.tvOverview);
        editInput = (EditText) findViewById(R.id.editInput) ;
        editInput.setShowSoftInputOnFocus(false);
        tvOverview.setShowSoftInputOnFocus(false);
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


    @Override
    public void calculate()
    {
        Button btnCalculate = (Button) findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    setTextAfterOperation(OperationString.EQUALS);
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);}
                }
        });
    }

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
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);}
                }
        });
    }

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
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);}
                }
        });
    }

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
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);}
                }
        });
    }

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
                }
                catch (Exception ex)
                {
                    Toast toast = Toast.makeText(getApplicationContext(),"Oops there went something wrong!", Toast.LENGTH_SHORT);}
            }
        });
    }


    @Override
    public void four() {
        Button btnFour = (Button) findViewById(R.id.btnFour);
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    setTextOfEditText(Numbers.FOUR);
                } catch (Exception ex) {
                    Toast toast = Toast.makeText(getApplicationContext(), "Oops there went something wrong!", Toast.LENGTH_SHORT);
                }
            }
        });
    }


    @Override
    public void five()
    {
        Button btnFive = (Button) findViewById(R.id.btnFive);
        btnFive.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.FIVE);
            }
        });
    }

    @Override
    public void six()
    {
        Button btnSix = (Button) findViewById(R.id.btnSix);
        btnSix.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.SIX);
            }
        });
    }

    @Override
    public void seven()
    {
        Button btnSeven = (Button) findViewById(R.id.btnSeven);
        btnSeven.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.SEVEN);
            }
        });
    }

    @Override
    public void eight()
    {
        Button btnEight = (Button) findViewById(R.id.btnEight);
        btnEight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.EIGHT);
            }
        });
    }

    @Override
    public void nine()
    {
        Button btnNine = (Button) findViewById(R.id.btnNine);
        btnNine.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.NINE);
            }
        });
    }

    @Override
    public void dot()
    {
        Button btnDot = (Button) findViewById(R.id.btnDot);
        btnDot.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.DOT);
            }
        });
    }

    @Override
    public void clear()
    {
        final Button btnClearClearAll = (Button) findViewById(R.id.btnClearClearAll);
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

    @Override
    public void add()
    {
        Button btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isAdd = true;
                isDivide = false;
                isMultiply = false;
                isSubtract = false;
                setTextAfterOperation(OperationString.ADD);
            }
        });
    }

    @Override
    public void subtract()
    {
        Button btnSubtract = (Button) findViewById(R.id.btnSubtract);
        btnSubtract.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isAdd = false;
                isDivide = false;
                isMultiply = false;
                isSubtract = true;
                setTextAfterOperation(OperationString.SUBTRACT);
            }
        });
    }

    @Override
    public void multiply()
    {
        Button btnMultiply = (Button) findViewById(R.id.btnMultiply);
        btnMultiply.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isAdd = false;
                isDivide = false;
                isMultiply = true;
                isSubtract = false;
                setTextAfterOperation(OperationString.MULTIPLY);
            }
        });
    }

    @Override
    public void divide()
    {
        Button btnDivide = (Button) findViewById(R.id.btnDivide);
        btnDivide.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                isAdd = false;
                isDivide = true;
                isMultiply = false;
                isSubtract = false;
                setTextAfterOperation(OperationString.DIVIDE);
            }
        });
    }


    /***
     * Get the text from the input EditText.
     * @return
     */
    public String getText()
    {
        if(editInput.getText().toString() != "")
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
        if (digit instanceof Character)
        {
            if ((char)digit == Numbers.DOT)
            {
                //only one dot is possible
                if (!getText().contains(String.valueOf(Numbers.DOT)))
                {
                    editInput.setText(getText() + String.valueOf(digit));
                }
                //if the dot is the first digit, put a zero before it: . --> 0.
                if (getText().length()==1 && getText().contains(String.valueOf(Numbers.DOT)))
                {
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



    private void setTextAfterOperation(char operation)
    {
        Calculator calculator = new Calculator();

        if(operation == OperationString.ADD || operation == OperationString.SUBTRACT
                || operation == OperationString.MULTIPLY || operation == OperationString.DIVIDE)
        {
            //if it is the first number to calculate with store it in number1-variable
            if ((getText().contains(String.valueOf(OperationString.ADD)))
                    || (getText().contains(String.valueOf(OperationString.SUBTRACT)))
                    || (getText().contains(String.valueOf(OperationString.MULTIPLY)))
                    || (getText().contains(String.valueOf(OperationString.DIVIDE ))))
            {

                tvOverview.append(getText() + "\n");
                String helper = getText().substring(getText().indexOf(" ")).trim();
                if(helper.isEmpty() )
                {
                    number2 = 0;
                }
                if (!helper.isEmpty())
                {
                    number2 = Double.parseDouble(helper);

                }

                if (getText().contains(String.valueOf(OperationString.ADD)))
                {
                    number1 = calculator.add(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                }

                else if (getText().contains(String.valueOf(OperationString.SUBTRACT)))
                {
                    number1 = calculator.subtract(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                }

                else if (getText().contains(String.valueOf(OperationString.MULTIPLY)))
                {
                    number1 = calculator.multiply(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                }

                else if (getText().contains(String.valueOf(OperationString.DIVIDE)))
                {
                    number1 = calculator.divide(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n");
                }

                editInput.setText(String.valueOf(operation) + " ");

                number2 = 0;
            }
            else
            {
                tvOverview.setText(getText() + "\n");

                number1 = Double.parseDouble(getText());
                //and set input field-text to 'operation ' (example: '+ ')
                editInput.setText(String.valueOf(operation) + " ");
            }
        }

        else if(operation == OperationString.EQUALS)
        {
            if ((getText().contains(String.valueOf(OperationString.ADD)))
                    || (getText().contains(String.valueOf(OperationString.SUBTRACT)))
                    || (getText().contains(String.valueOf(OperationString.MULTIPLY)))
                    || (getText().contains(String.valueOf(OperationString.DIVIDE ))))
            {

                if(isAdd == true)
                {
                    tvOverview.append(getText() + "\n");

                    String helper = getText().substring(getText().indexOf(" ")).trim();
                    number2 = Double.parseDouble(helper);

                    number1 = calculator.add(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                    editInput.setText(String.valueOf(number1));

                    number2 = 0;
                    isAdd = false;
                }
                else if(isSubtract == true)
                {
                    tvOverview.append(getText() + "\n");

                    String helper = getText().substring(getText().indexOf(" ")).trim();
                    number2 = Double.parseDouble(helper);

                    number1 = calculator.subtract(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                    editInput.setText(String.valueOf(number1));

                    number2 = 0;
                    isSubtract = false;
                }
                else if(isMultiply == true)
                {
                    tvOverview.append(getText() + "\n");

                    String helper = getText().substring(getText().indexOf(" ")).trim();
                    number2 = Double.parseDouble(helper);

                    number1 = calculator.multiply(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                    editInput.setText(String.valueOf(number1));

                    number2 = 0;
                    isMultiply = false;
                }
                else if(isDivide == true)
                {
                    tvOverview.append(getText() + "\n");

                    String helper = getText().substring(getText().indexOf(" ")).trim();
                    number2 = Double.parseDouble(helper);

                    number1 = calculator.divide(number1, number2);
                    tvOverview.append(OperationString.SUMLINE + "\n" + number1 + "\n" + OperationString.DIVIDER + "\n");

                    editInput.setText(String.valueOf(number1));

                    number2 = 0;
                    isDivide = false;
                }
            }

        }
    }
}
