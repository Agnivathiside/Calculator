package com.example.android.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    int number=0;
    int i=1;
    //double d=0;
    String d="";

    boolean flag_point=false,flag_per=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView num=(TextView) findViewById(R.id.secons_number_input);
        num.setText(String.valueOf(number));
        //display_current(number);
    }

    public void cal_percentage(View view) {
        //flag_per=true;
        TextView first_num=(TextView) findViewById(R.id.first_number);
        TextView second_num=(TextView) findViewById(R.id.secons_number_input);
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        TextView move_second_num=(TextView) findViewById(R.id.secons_number);
        if (sign.getText().toString().equals("+")) {
            double d1 = Double.parseDouble(first_num.getText().toString());
            double d2 = Double.parseDouble(second_num.getText().toString());
            double par_value= (d1/100)*d2;
            move_second_num.setText(String.valueOf(par_value));
            double res= d1+par_value;
            second_num.setText(String.valueOf(res));
        } else if (sign.getText().toString().equals("-")) {
            double d1 = Double.parseDouble(first_num.getText().toString());
            double d2 = Double.parseDouble(second_num.getText().toString());
            double par_value= (d1/100)*d2;
            move_second_num.setText(String.valueOf(par_value));
            double res= d1-par_value;
            second_num.setText(String.valueOf(res));
        } else if (sign.getText().toString().equals("X")) {
            double d1 = Double.parseDouble(first_num.getText().toString());
            double d2 = Double.parseDouble(second_num.getText().toString());
            double par_value= (d1/100)*d2;
            move_second_num.setText(String.valueOf(d2)+"%");
            double res= d1*par_value;
            second_num.setText(String.valueOf(par_value));
        } else if (sign.getText().toString().equals("/")) {
            double d1 = Double.parseDouble(first_num.getText().toString());
            double d2 = Double.parseDouble(second_num.getText().toString());
            double par_value= (d1/100)*d2;
            move_second_num.setText(String.valueOf(par_value));
            double res= d1/par_value;
            second_num.setText(String.valueOf(res));
        }
    }

    public void clear_entry(View view) {
        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
        number=0;
        d="";
        curr_num.setText(String.valueOf(number));
    }

    public void clear(View view){
        TextView first_num=(TextView) findViewById(R.id.first_number);
        first_num.setText("0");
        TextView second_num=(TextView) findViewById(R.id.secons_number);
        second_num.setText("0");
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        sign.setText("");
        TextView input_num=(TextView) findViewById(R.id.secons_number_input);
        input_num.setText("0");
        d="";
        number=0;
    }

    public void square_root(View view) {
        double d2=Double.parseDouble(d);
        Log.i("Calculate root",String.valueOf(d));
        d2=Math.sqrt(d2);
        Log.i("SQRT IS",String.valueOf(d2));
        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
        curr_num.setText(String.valueOf(d2));
        d=String.valueOf(d2);
    }

    public void add_seven(View view) {
//        Button seven= (Button) findViewById(R.id.seven_button);
//        seven.setBackgroundColor(getResources().getColor(R.color.GREEN));
//        seven.setBackgroundColor(getResources().getColor(R.color.purple_200));
        display_current(7,flag_point,d);
        Log.i("Button pressed","7");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_eight(View view) {
//        Button seven= (Button) findViewById(R.id.eight_button);
//        seven.setBackgroundColor(900);
        display_current(8,flag_point,d);
        Log.i("Button pressed","8");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_nine(View view) {
//        Button seven= (Button) findViewById(R.id.nine_button);
//        seven.setBackgroundColor(900);
        display_current(9,flag_point,d);
        Log.i("Button pressed","9");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_four(View view) {
//        Button seven= (Button) findViewById(R.id.four_button);
//        seven.setBackgroundColor(900);
        display_current(4,flag_point,d);
        Log.i("Button pressed","4");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_five(View view) {
//        Button seven= (Button) findViewById(R.id.five_button);
//        seven.setBackgroundColor(900);
        display_current(5,flag_point,d);
        Log.i("Button pressed","5");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_six(View view) {
//        Button seven= (Button) findViewById(R.id.six_button);
//        seven.setBackgroundColor(900);
        display_current(6,flag_point,d);
        Log.i("Button pressed","6");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_one(View view) {
//        Button seven= (Button) findViewById(R.id.one_button);
//        seven.setBackgroundColor(900);
        display_current(1,flag_point,d);
        Log.i("Button pressed","1");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_two(View view) {
//        Button seven= (Button) findViewById(R.id.two_button);
//        seven.setBackgroundColor(900);
        display_current(2,flag_point,d);
        Log.i("Button pressed","2");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_three(View view) {
//        Button seven= (Button) findViewById(R.id.three_button);
//        seven.setBackgroundColor(900);
        display_current(3,flag_point,d);
        Log.i("Button pressed","3");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void add_zero(View view) {
        Button seven= (Button) findViewById(R.id.zero_button);
        //seven.setTextColor(900);
        display_current(0,flag_point,d);
        Log.i("Button pressed","0");
        Log.w("flag value", String.valueOf(flag_point));
        Log.w("D value",String.valueOf(d));
    }

    public void subtraction(View view){
        TextView first_num=(TextView) findViewById(R.id.secons_number_input);
        TextView move_first_num=(TextView) findViewById(R.id.first_number);
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        TextView second_num=(TextView) findViewById(R.id.secons_number);
        second_num.setText("0");
        move_first_num.setText(first_num.getText().toString());
        sign.setText("-");
        d="";
        number=0;
        first_num.setText("0");
    }

    public void addition(View view) {
        TextView first_num=(TextView) findViewById(R.id.secons_number_input);
        TextView move_first_num=(TextView) findViewById(R.id.first_number);
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        TextView second_num=(TextView) findViewById(R.id.secons_number);
        second_num.setText("0");
        move_first_num.setText(first_num.getText().toString());
        sign.setText("+");
        d="";
        number=0;
        first_num.setText("0");
    }

    public void division(View view) {
        TextView first_num=(TextView) findViewById(R.id.secons_number_input);
        TextView move_first_num=(TextView) findViewById(R.id.first_number);
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        TextView second_num=(TextView) findViewById(R.id.secons_number);
        second_num.setText("0");
        move_first_num.setText(first_num.getText().toString());
        sign.setText("/");
        d="";
        number=0;
        first_num.setText("0");
    }

    public void multiplication(View view){
        TextView first_num=(TextView) findViewById(R.id.secons_number_input);
        TextView move_first_num=(TextView) findViewById(R.id.first_number);
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        TextView second_num=(TextView) findViewById(R.id.secons_number);
        second_num.setText("0");
        move_first_num.setText(first_num.getText().toString());
        sign.setText("X");
        d="";
        number=0;
        first_num.setText("0");
    }

    public void backspace(View view) {
//        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
////        int n=(int) number/10;
////        number=(double) n;
////        curr_num.setText(String.valueOf(number));
//        String num_str=String.valueOf(number);
//        num_str=num_str.substring(0,num_str.length()-1);
//        number=Double.parseDouble(num_str);
//        curr_num.setText(num_str);
        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
        d=d.substring(0,d.length()-1);
        curr_num.setText(d);
        if(!d.contains(".")) {
            //flag_point=false;
            number=Integer.parseInt(d);
        }
        Log.i("Number is", String.valueOf(number));
    }

    public void inverse(View view) {
        double d2=Double.parseDouble(d);
        d2=1/d2;
        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
        curr_num.setText(String.valueOf(d2));
        d=String.valueOf(d2);
    }

    public void square(View view){
        double d2=Double.parseDouble(d);
        d2=d2*d2;
        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
        curr_num.setText(String.valueOf(d2));
        d=String.valueOf(d2);
    }

    public void plus_minus(View view){
            Context context = getApplicationContext();
            CharSequence text = "SAB KAAJ PROGRAMMER E KORBE NAKI !? NIJE KORO";
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
    }

    public void add_point(View view) {
//        String s=String.valueOf(number);
//        s+=".";
//        number=Double.parseDouble(s);
        flag_point=true;
        display_current(number,flag_point,d);
        Log.w("flag value", String.valueOf(flag_point));
//        display_current(number);
    }

    public void result(View view) {
        TextView first_num=(TextView) findViewById(R.id.first_number);
        TextView second_num=(TextView) findViewById(R.id.secons_number_input);
        TextView move_second_nun=(TextView) findViewById(R.id.secons_number);
        TextView sign=(TextView) findViewById(R.id.Sign_View);
        move_second_nun.setText(second_num.getText().toString());
        if (sign.getText().toString().equals("+")){
            double d1=Double.parseDouble(first_num.getText().toString());
            double d2=Double.parseDouble(second_num.getText().toString());
            double res=d1+d2;
            second_num.setText(String.valueOf(res));
//            if (flag_per){
//                double res=d1+ (d1/100)*d2;
//                second_num.setText(String.valueOf(res));
//                flag_per=false;
//            }else {
//                double res=d1+d2;
//                second_num.setText(String.valueOf(res));
//            }
        } else if (sign.getText().toString().equals("-")) {
            double d1=Double.parseDouble(first_num.getText().toString());
            double d2=Double.parseDouble(second_num.getText().toString());
            double res=d1-d2;
            second_num.setText(String.valueOf(res));
//            if (flag_per){
//                double res=d1 - (d1/100)*d2;
//                second_num.setText(String.valueOf(res));
//                flag_per=false;
//            }else {
//                double res=d1+d2;
//                second_num.setText(String.valueOf(res));
//            }
        } else if (sign.getText().toString().equals("X")) {
            double d1=Double.parseDouble(first_num.getText().toString());
            double d2=Double.parseDouble(second_num.getText().toString());
            double res=d1*d2;
            second_num.setText(String.valueOf(res));
//            if (flag_per){
//                double res=d1 * (d1/100)*d2;
//                second_num.setText(String.valueOf(res));
//                flag_per=false;
//            }else {
//                double res=d1+d2;
//                second_num.setText(String.valueOf(res));
//            }
        } else if (sign.getText().toString().equals("/")) {
            double d1=Double.parseDouble(first_num.getText().toString());
            double d2=Double.parseDouble(second_num.getText().toString());
            double res=d1/d2;
            second_num.setText(String.valueOf(res));
//            if (flag_per){
//                double res=d1 / (d1/100)*d2;
//                second_num.setText(String.valueOf(res));
//                flag_per=false;
//            }else {
//                double res=d1+d2;
//                second_num.setText(String.valueOf(res));
//            }
        }

    }

    public void display_current(int num,boolean flag,String d1){
//        number=number*10+num;
//        TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//        curr_num.setText(String.valueOf(number));
//        String num_str=String.valueOf(num);
        //Character c ='.';
//        if ((num_str.charAt(num_str.length()-1)=='.') && num_str.charAt(num_str.length()-1)=='0'){
//            number=number*10+num;
//            TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//            curr_num.setText(String.valueOf(number));
//        }else if (num_str.contains(".")){
//
//        }else{
//            number=number*10+num;
//            TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//            curr_num.setText(String.valueOf(number));
//        }
//        if(!flag_point){
//            number=number*10+num;
//            TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//            curr_num.setText(String.valueOf(number));
//            //String num_str=String.valueOf(num);
//        }else if(flag_point){
//            //double i=1;
//            double divider=Math.pow(10,i);
//
//            number=number+(num/divider);
//            TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//            curr_num.setText(String.valueOf(number));
//            i++;//10000
//        }

        if (number==0){
            number=num;
            d=String.valueOf(num);
            Log.i("number is",String.valueOf(number));
            TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
            curr_num.setText(String.valueOf(number));
        }else if(!flag){
            Log.i("controller is", "here");
            if (!Objects.equals(d1, "") && d1.contains(".")){
               //String d1_str= String.valueOf(d);
               Log.i("dpuble String is",d1);
               int REDIX=10;
               char  num_chr=Character.forDigit(num,REDIX);
               //char num_chr= (char) num;
               Log.i("char num is",String.valueOf(num_chr));
//               if ((d1.charAt(d1.length()-1)=='0') && (d1.charAt(d1.length()-2)=='.')){
//                   TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//                   //d1_str=d1_str.replace(d1_str.charAt(d1_str.length()-1),num_chr);
//                   d1=d1.substring(0,d1.length()-1)+num_chr+ "";
//                   curr_num.setText(d1);
//                   d=d1;
//                   //d=Double.parseDouble(d1_str);
//               }else{
//                   d1=d1+num_chr;
//                   Log.i("Here double value is",d1);
//                   TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
//                   curr_num.setText(d1);
//                   //if (num_chr!='0') d=Double.parseDouble(d1_str);
//                   d=d1;
//                   Log.w("here number is",String.valueOf(d));
//               }
                d1=d1+num_chr;
                Log.i("Here double value is",d1);
                TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
                curr_num.setText(d1);
                //if (num_chr!='0') d=Double.parseDouble(d1_str);
                d=d1;
                Log.w("here number is",String.valueOf(d));
            }else{
                String number_str=String.valueOf(number);
                String num_str=String.valueOf(num);
                number_str=number_str+num_str;
                Log.i("number is",number_str);
                number=Integer.parseInt(number_str);
                d=number_str;
                TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
                curr_num.setText(String.valueOf(number));
            }


        }else {
            String number_str=String.valueOf(number);
            number_str=number_str+'.';
            Log.i("point is added",number_str);
            //d=Double.parseDouble(number_str);
            d=number_str;
            flag_point=false;
            //number=Integer.parseInt(number_str);
            Log.w("flag value",String.valueOf(flag_point));
            TextView curr_num=(TextView) findViewById(R.id.secons_number_input);
            curr_num.setText(number_str);
        }
    }

}