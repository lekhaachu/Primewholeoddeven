package com.example.admin.primewholeoddeven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrimeWholeOddEven extends AppCompatActivity {
    TextView dispText, dispNum;
    boolean whole, prime, odd, even;
    int i;
    Button btnWhole, btnOdd, btnEven, btnprime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prime_whole_odd_even);
        dispText = (TextView) findViewById(R.id.textView);
        dispNum = (TextView) findViewById(R.id.displayText);
        btnWhole = (Button) findViewById(R.id.btnWhole);


    }

    public void wholeBtn(View view) {
        whole = true;
        prime = false;
        odd = false;
        even = false;
        dispText.setText("Whole Number");
        i = 0;
        dispNum.setText("" + i);

    }

    public void oddBtn(View view) {
        whole = false;
        prime = false;
        odd = true;
        even = false;
        dispText.setText("Odd Number");
        i = 1;
        dispNum.setText("" + i);
    }

    public void evenBtn(View view) {
        whole = false;
        prime = false;
        odd = false;
        even = true;
        dispText.setText("Even Number");
        i = 2;
        dispNum.setText("" + i);
    }

    public void primeBtn(View view) {
        whole = false;
        prime = true;
        odd = false;
        even = false;
        dispText.setText("Prime Number");
        i = 2;
        dispNum.setText("" + i);
    }

    public void increaseBtn(View view) {
        if (whole == true) {
            i++;
            dispNum.setText("" + i);
        }
        if (even == true) {
            i = i + 2;
            dispNum.setText("" + i);
        }
        if (odd == true) {
            i = i + 2;
            dispNum.setText("" + i);
        }
        if (prime == true) {
            int k = 1;
            while (k == 1) {
                i = i + 1;
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        k = 1;
                        break;
                    } else {
                        k = 0;
                    }
                }
            }
            dispNum.setText("" + i);
        }
    }

    public void decreaseBtn(View view) {
        if (whole == true) {
            if (i == 0) {
                i = 0;
            } else
                i--;
            dispNum.setText("" + i);

        }
        if (even == true) {
            if (i == 2)
                i = 2;
            else
                i = i - 2;
            dispNum.setText("" + i);
        }
        if (odd == true) {
            if (i == 1)
                i = 1;
            else
                i = i - 2;
            dispNum.setText("" + i);
        }
        if (prime == true) {

            String m = dispNum.getText().toString();
            int n = Integer.parseInt(m);
            if (n <=3) {
                dispNum.setText("2");
            }
            else {
                int k = 1;
                while (k == 1) {
                    n = n - 1;
                    for (int j = n - 1; j >= 2; j--) {
                        if (n % j == 0) {
                            k = 1;
                            break;
                        } else {
                            k = 0;
                        }
                        if (n == 2) {
                            k = 0;
                            dispNum.setText("" + n);
                            break;
                        }
                    }
                }
                dispNum.setText("" + n);
            }
        }
    }
}


