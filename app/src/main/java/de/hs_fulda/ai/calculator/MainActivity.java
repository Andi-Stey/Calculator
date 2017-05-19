package de.hs_fulda.ai.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import de.hs_fulda.ai.calculator.Repository.IOnClickRepository;

public class MainActivity extends AppCompatActivity implements IOnClickRepository
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void calculate() {

    }

    @Override
    public void zero() {

    }

    @Override
    public void one() {

    }

    @Override
    public void two() {

    }

    @Override
    public void three() {

    }

    @Override
    public void four() {

    }

    @Override
    public void five() {

    }

    @Override
    public void six() {

    }

    @Override
    public void seven() {

    }

    @Override
    public void eight() {

    }

    @Override
    public void nine() {

    }

    @Override
    public void dot() {

    }

    @Override
    public void clear() {

    }

    @Override
    public void allClear() {

    }

    @Override
    public void clearLastDigit() {

    }
}
