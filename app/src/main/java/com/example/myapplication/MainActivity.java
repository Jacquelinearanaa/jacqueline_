package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button add;
    private Button sub;
    private Button mul;
    private Button del;
    private TextView info;
    private TextView result;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char EQU= '0';
   private  double val1; = Double.NaN;
    private  double val2;
    private char ACTION;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     setupUIViews();
     zero.setOnClickListener(new View.OnClickListner() {
         @Override
         public void onClick (View v){
             info.setText(info.getText().toString()+"0");

         }
     });
     one.setOnClickListener(new View.OnClickListner() {
            @Override
            public void onClick (View v){
                info.setText(info.getText().toString()+"1");

            }
        });

        two.setOnClickListener(new View.OnClickListner() {
            @Override
            public void onClick (View v){
                info.setText(info.getText().toString()+"2");

            }
        });


    }
   three.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"3");

        }

four.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"4");

        }



five.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"5");

        }

six.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"6");


        }


seven.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"7");

        }

eight.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"8");

        }

nine.setOnClickListener(new View.OnClickListner() {
        @Override
        public void onClick (View v){
            info.setText(info.getText().toString()+"9");

        }
    add.setOnClickListnerset((v) {
        @Override
        public void onClick(View.v){
            computer();
            ACTION = ADDITION;
            result.setText(info.getText().toString() + "+");
            info.setText(null);
        }
    });
        sub.setOnClickListnerset((v){
            @Override
            public void onClick(View.v){
                computer();
                ACTION = SUBTRACTION;
                result.setText(info.getText().toString() - "-");
                info.setText(null);

            }
        });  mul.setOnClickListnerset((v) {
            @Override
            public void onClick(View.v){
                computer();
                ACTION = MULTIPLICATION;
                result.setText(info.getText().toString() * "*");
                info.setText(null);
            }
        });




        private void setupUIViews(){

         one = (Button)findViewById(R.id.btn1);
         zero = (Button) findViewById(R.id.btn0) ;
         two = (Button)findViewById(R.id.btn2);
         three =(Button)findViewById(R.id.btn3);
         four = (Button)findViewById(R.id.btn4);
        five = (Button) findViewById(R.id.btn5);
        six = (Button)findViewById(R.id.btn6);
        seven =(Button) findViewById(R.id.btn7);
        eight = (Button) findViewById (R.id.btn8);
        nine =(Button) findViewById (R.id.btn9);
        add = (Button) findViewById (R.id.btnadd);
        sub = (Button) findViewById (R.id.btnsub);
        mul= (Button) findViewById (R.id.btnmul);
       info= (TextView) findViewById(R.id.tvControl);
       result=(TextView) findViewById(R.id.tvResult);
        }
        private void compute(){
            if (!Double.isNaN(vall)){
                val2 =Double.parseDouble{info.getTrxt().toString()};

                switch(ACTION){
                    case ADDITION:
                        val = val1 + val2;
                        break;

                    case SUBTRACTION:
                        val = val1 - val2;
                        break;

                    case MULTIPLICATION:
                        val = val1 * val2;
                        break;
                    case EQU:
                        break;

                                    }
                                    else{
                                        val1=Double.parseDouble(info.getTExt().toString());
                }
            }
        }
}
