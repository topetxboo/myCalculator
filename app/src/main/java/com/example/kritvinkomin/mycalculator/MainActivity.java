package com.example.kritvinkomin.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et1;
    TextView res;

    Double value1;
    Double value2;
    Double resultVal;
    int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.editText);
        res = (TextView) findViewById(R.id.res);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                et1.append("1");
                break;

            case R.id.two:
                et1.append("2");
                break;

            case R.id.three:
                et1.append("3");
                break;

            case R.id.four:
                et1.append("4");
                break;

            case R.id.five:
                et1.append("5");
                break;

            case R.id.six:
                et1.append("6");
                break;

            case R.id.seven:
                et1.append("7");
                break;

            case R.id.eight:
                et1.setText("8");
                break;

            case R.id.nine:
                et1.setText("9");
                break;
        }
    }

    public void plus(View v) {
        if (count==0) {
            value1 = Double.parseDouble(et1.getText().toString());
            count++;
            Toast.makeText(MainActivity.this, value1.toString().substring(0,value1.toString().length() -2) + " Entered", Toast.LENGTH_SHORT).show();
            et1.setText("");
            resultVal = value1;
            res.setText(resultVal.toString());

        }else {
            value2 = Double.parseDouble(et1.getText().toString());
            resultVal = resultVal + value2;
            Toast.makeText(MainActivity.this, resultVal + " is the result", Toast.LENGTH_SHORT).show();
            et1.setText("");
            res.setText(resultVal.toString());
        }
    }
    public void subtract(View v) {
        if (count==0) {
            value1 = Double.parseDouble(et1.getText().toString());
            count++;
            Toast.makeText(MainActivity.this, value1.toString().substring(0,value1.toString().length() -2) + " Entered", Toast.LENGTH_SHORT).show();
            et1.setText("");
            resultVal = value1;
            res.setText(resultVal.toString());

        }else {
            value2 = Double.parseDouble(et1.getText().toString());
            resultVal = resultVal - value2;
            Toast.makeText(MainActivity.this, resultVal + " is the result", Toast.LENGTH_SHORT).show();
            et1.setText("");
            res.setText(resultVal.toString());
        }
    }
    public void multiply(View v) {
        if (count==0) {
            value1 = Double.parseDouble(et1.getText().toString());
            count++;
            Toast.makeText(MainActivity.this, value1.toString().substring(0,value1.toString().length()-2) + " Entered", Toast.LENGTH_SHORT).show();
            et1.setText("");
            resultVal = value1;
            res.setText(resultVal.toString());
        } else {
            value2 = Double.parseDouble(et1.getText().toString());
            resultVal = resultVal * value2;
            Toast.makeText(MainActivity.this, resultVal + " is the result", Toast.LENGTH_SHORT).show();
            et1.setText("");
            res.setText(resultVal.toString());
        }
    }

    public void division(View v) {
        if (count==0) {
            value1 = Double.parseDouble(et1.getText().toString());
            count++;
            Toast.makeText(MainActivity.this, value1.toString().substring(0,value1.toString().length() -2) + " Entered", Toast.LENGTH_SHORT).show();
            et1.setText("");
            resultVal = value1;
            res.setText(resultVal.toString());

        }else {
            value2 = Double.parseDouble(et1.getText().toString());
            resultVal = resultVal / value2;
            Toast.makeText(MainActivity.this, resultVal + " is the result", Toast.LENGTH_SHORT).show();
            et1.setText("");
            res.setText(resultVal.toString());
        }
    }
}