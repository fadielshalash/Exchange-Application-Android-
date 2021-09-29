
 package com.example.changemarket;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Number(View view) {
        EditText price=findViewById(R.id.price);
       String p1= String.valueOf(price.getText());
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        price.setText(p1+buttonText);
    }
    public void Clear(View view) {
        EditText price=findViewById(R.id.price);
        price.getText().clear();
        TextView afterchange=findViewById(R.id.afterchange);
        afterchange.setText("");
    }
    public void Change(View view) {
        Button b = (Button)view;
        String buttonText = b.getText().toString();
        EditText price=findViewById(R.id.price);
        int p11=Integer.parseInt(String.valueOf(price.getText()));
        TextView afterchange=findViewById(R.id.afterchange);
        double after=0;
        String af;
        switch (buttonText)
        {
            case "US":
            {
                after=0;
                after= (double) (p11*3.35);
                af= String.valueOf(after);
                afterchange.setText(af);
                break;
            }
            case "EURO":
            {
                after=0;
                after= (double) (p11*4.65);
                af= String.valueOf(after);
                afterchange.setText(af);
                break;
            }
            case "JDC":
            {
                after=0;
                after= (double) (p11*5);
                af= String.valueOf(after);
                afterchange.setText(af);
                break;
            }
            case "JENEH":
            {
                after=0;
                after= (double) (p11*0.35);
                af= String.valueOf(after);
                afterchange.setText(af);
                break;
            }
            case "BITCOIN":
            {
                after=0;
                after= (double) (p11*126000);
                af= String.valueOf(after);
                afterchange.setText(af);
                break;
            }
        }}}




