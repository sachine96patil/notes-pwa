
ASSIGNMENT: A5

INPUT:

package com.example.dypiemr_.trignometry_cal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnsin,btncos,btntan,btnadd,btnsub,btnmul,btndiv,btnSqrt,btnatan,btnSav,btnRec,btnClr;
    private EditText etnum,etres,etnum2;
    private static double memoryValue,inputvalue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    private void init(){
        btnsin=(Button)findViewById(R.id.btnSin);
        btncos=(Button)findViewById(R.id.btnCos);
        btntan=(Button)findViewById(R.id.btnTan);
        btnadd=(Button)findViewById(R.id.btnAdd);
        btnsub=(Button)findViewById(R.id.btnSub);
        btnmul=(Button)findViewById(R.id.btnMult);
        btndiv=(Button)findViewById(R.id.btnDiv);
        btnSqrt=(Button)findViewById(R.id.btnsqrt);
        btnClr=(Button)findViewById(R.id.btnclr);
        btnRec=(Button)findViewById(R.id.btnmr);
        btnSav=(Button)findViewById(R.id.btnms);
        etnum=(EditText)findViewById(R.id.etNum);
        etnum2=(EditText)findViewById(R.id.etNum2);
        etres=(EditText)findViewById(R.id.tvResult);
        btnsin.setOnClickListener(this);
        btncos.setOnClickListener(this);
        btntan.setOnClickListener(this);
        btnadd.setOnClickListener(this);
        btnsub.setOnClickListener(this);
        btnmul.setOnClickListener(this);
        btndiv.setOnClickListener(this);
        btnSqrt.setOnClickListener(this);
        btnClr.setOnClickListener(this);
        btnRec.setOnClickListener(this);
        btnSav.setOnClickListener(this);
    }
    public void onClick(View view){
        String num1=etnum.getText().toString();

        switch(view.getId()){
            case R.id.btnSin:
                double sin= Math.sin(Double.parseDouble(num1));
                etres.setText(String.valueOf(sin));
                break;
            case R.id.btnCos:
                double Cos=Math.cos(Double.parseDouble(num1));
                etres.setText(String.valueOf(Cos));
                break;
            case R.id.btnTan:
                double Tan=Math.tan(Double.parseDouble(num1));
                etres.setText(String.valueOf(Tan));
                break;
            case R.id.btnSub:
                double sub=Double.parseDouble(etnum2.getText().toString())-Double.parseDouble(num1);
                etres.setText(String.valueOf(sub));
                break;
            case R.id.btnAdd:
                double add=Double.parseDouble(etnum2.getText().toString())+Double.parseDouble(num1);
                etres.setText(String.valueOf(add));
                break;
            case R.id.btnMult:
                double mul=Double.parseDouble(etnum2.getText().toString())*Double.parseDouble(num1);
                etres.setText(String.valueOf(mul));
                break;
            case R.id.btnDiv:
                double div=Double.parseDouble(etnum2.getText().toString())/Double.parseDouble(num1);
                etres.setText(String.valueOf(div));
                break;
            case R.id.btnsqrt:
                double sqrt=Math.sqrt(Double.parseDouble(num1));
                etres.setText(String.valueOf(sqrt));
                break;
            case R.id.btnclr:
                memoryValue = Double.NaN;
                etres.setText("data cleared");
                break;
            case R.id.btnmr:
                if (Double.isNaN(memoryValue)) {
                    etres.setText("no data");
                }
                else
                    etres.setText(String.valueOf((int)memoryValue));
                break;
            case R.id.btnms:
                inputvalue= Double.parseDouble(etres.getText().toString());
                if (Double.isNaN(inputvalue)){
                    etres.setText("no data");}
                else {
                    memoryValue = inputvalue;
                    etres.setText(String.valueOf(memoryValue));}
                break;


        }
    }

}




///// XML file
<TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceLarge"
        android:text="Calculator"
        android:id="@+id/textView"
        android:layout_alignParentTop="true"
        android:layout_centerHorizontal="true" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceMedium"
        android:text="Enter Input 1"
        android:id="@+id/textView2"
        android:layout_below="@+id/textView"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:ems="10"
        android:id="@+id/etNum"
        android:layout_below="@+id/textView2"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceMedium"
        android:text="Result"
        android:id="@+id/textView3"
        android:layout_above="@+id/tvResult"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:inputType="number"
        android:ems="10"
        android:id="@+id/tvResult"
        android:layout_centerVertical="true"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sine"
        android:id="@+id/btnSin"
        android:layout_marginTop="53dp"
        android:layout_below="@+id/tvResult"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceMedium"
        android:text="Medium Text"
        android:id="@+id/textView5" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Cosine"
        android:id="@+id/btnCos"
        android:layout_alignTop="@+id/btnSin"
        android:layout_toRightOf="@+id/btnSin"
        android:layout_toEndOf="@+id/btnSin" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Tan"
        android:id="@+id/btnTan"
        android:layout_alignTop="@+id/btnCos"
        android:layout_toRightOf="@+id/btnSub"
        android:layout_toEndOf="@+id/btnSub" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="+"
        android:id="@+id/btnAdd"
        android:layout_alignTop="@+id/btnSub"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="-"
        android:id="@+id/btnSub"
        android:layout_alignTop="@+id/btnMult"
        android:layout_toRightOf="@+id/btnAdd"
        android:layout_toEndOf="@+id/btnAdd" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="*"
        android:id="@+id/btnMult"
        android:layout_below="@+id/btnCos"
        android:layout_toRightOf="@+id/btnSub"
        android:layout_toEndOf="@+id/btnSub"
        android:layout_marginTop="53dp" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="/"
        android:id="@+id/btnDiv"
        android:layout_alignTop="@+id/btnMult"
        android:layout_toRightOf="@+id/btnMult"
        android:layout_toEndOf="@+id/btnMult" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Sq Rt"
        android:id="@+id/btnsqrt"
        android:layout_above="@+id/btnMult"
        android:layout_alignLeft="@+id/btnDiv"
        android:layout_alignStart="@+id/btnDiv" />

    <TextView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:textAppearance="?android:attr/textAppearanceMedium"
        android:text="Enter Input 2"
        android:id="@+id/textView4"
        android:layout_below="@+id/etNum"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <EditText
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:inputType="numberDecimal"
        android:ems="10"
        android:id="@+id/etNum2"
        android:layout_below="@+id/textView4"
        android:layout_alignParentLeft="true"
        android:layout_alignParentStart="true" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="MC"
        android:id="@+id/btnclr"
        android:layout_above="@+id/btnCos"
        android:layout_toLeftOf="@+id/textView"
        android:layout_toStartOf="@+id/textView" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="MR"
        android:id="@+id/btnmr"
        android:layout_above="@+id/btnCos"
        android:layout_alignLeft="@+id/textView"
        android:layout_alignStart="@+id/textView" />

    <Button
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="MS"
        android:id="@+id/btnms"
        android:layout_alignBottom="@+id/btnmr"
        android:layout_toRightOf="@+id/btnmr"
        android:layout_toEndOf="@+id/btnmr" />