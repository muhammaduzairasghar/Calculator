package com.example.layoutsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnsub,btnadd,btnmul,btndiv,btndot,btnequal;
    TextView ans;
    double var1,var2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn0 = (Button) findViewById(R.id.btn0);
        btnsub = (Button) findViewById(R.id.btnsub);
        btnadd = (Button) findViewById(R.id.btnadd);
        btnmul = (Button) findViewById(R.id.btnmul);
        btndiv = (Button) findViewById(R.id.btndivid);
        btndot = (Button) findViewById(R.id.btndot);
        btnequal = (Button) findViewById(R.id.btnequal);
        ans = (TextView) findViewById(R.id.text1);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"1");

            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"2");

            }
        });


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"3");

            }
        });


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"4");

            }
        });


        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"5");

            }
        });


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"6");

            }
        });


        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"7");

            }
        });


        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"8");

            }
        });


        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"9");

            }
        });


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+"0");

            }
        });


        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText()+"");
                sub= true;
                ans.setText(null);

            }
        });


        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText()+"");
                add= true;
                ans.setText(null);

            }
        });


        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                var1 = Double.parseDouble(ans.getText()+"");
                mul= true;
                ans.setText(null);
            }
        });


        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var1 = Double.parseDouble(ans.getText()+"");
                div= true;
                ans.setText(null);

            }
        });


        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans.setText(ans.getText()+".");

            }
        });


        btnequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                var2 = Double.parseDouble(ans.getText()+"");
                if(add==true)
                {
                    ans.setText(var1+var2+"");
                    add=false;
                }



            if(sub==true)
            {
                ans.setText(var1-var2+"");
                sub=false;
            }



        if(mul==true)
        {
            ans.setText(var1*var2+"");
            mul=false;
        }



    if(div==true)
    {
        ans.setText(var1/var2+"");
        div=false;
    }
}
        });
    }
}
