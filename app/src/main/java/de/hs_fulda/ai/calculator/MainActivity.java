package de.hs_fulda.ai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import de.hs_fulda.ai.calculator.Classes.Numbers;
import de.hs_fulda.ai.calculator.Repository.IOnClickRepository;

public class MainActivity extends AppCompatActivity implements IOnClickRepository
{
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editText = (EditText) findViewById(R.id.editInput) ;
        editText.setShowSoftInputOnFocus(false);
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
    }

    @Override
    public void calculate()
    {
        //TODO
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
                setTextOfEditText(Numbers.ZERO);
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
                setTextOfEditText(Numbers.ONE);
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
                setTextOfEditText(Numbers.TWO);

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
                setTextOfEditText(Numbers.THREE);
            }
        });
    }

    @Override
    public void four()
    {
        Button btnFour = (Button) findViewById(R.id.btnFour);
        btnFour.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                setTextOfEditText(Numbers.FOUR);
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
        //TODO
    }

    @Override
    public void allClear()
    {
        //TODO
    }

    @Override
    public void clearLastDigit()
    {
        //TODO
    }

    public String getText()
    {
        TextView editInput = (TextView) findViewById(R.id.editInput);
        String appendedNumber ;
        appendedNumber = editInput.getText().toString();
        return appendedNumber;
    }

    public void setTextOfEditText(Object number)
    {
        TextView editInput = (TextView) findViewById(R.id.editInput);

        //only one dot is possible
        if (number instanceof Character)
        {
            if (!getText().contains(String.valueOf(Numbers.DOT)))
            {
                editInput.setText(getText() + String.valueOf(number));
            }
        }
        //numbers are always possible
        else
        {
            //a 2 digits number can not start with 0
            if(getText().length() == 1 && getText().equals(String.valueOf(Numbers.ZERO)))
            {
                editInput.setText(String.valueOf(number));
            }
            //every other input can have more than 1 digit.
            else
            {
                editInput.setText(getText() + String.valueOf(number));
            }
        }
    }

}
