package com.UI.uiproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.view.View.OnClickListener;

public class page2 extends Activity {

	Button submit;
	Button cancel;
	CheckBox password;
	CheckBox document;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        addListnerOnButton();
        addListnerOnButton1();
        
        submit=(Button)findViewById(R.id.button1);
        cancel=(Button)findViewById(R.id.button2);
        password=(CheckBox)findViewById(R.id.checkBox1);
        document=(CheckBox)findViewById(R.id.checkBox2);
    }

    private void addListnerOnButton() {
		// TODO Auto-generated method stub
		final Context context = this;
		submit=(Button)findViewById(R.id.button1);
		submit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent= new Intent(context,passwords.class);
				Intent intent1= new Intent(context,document.class);
				if(password.isChecked())
				startActivity(intent);
				else if(document.isChecked())
					startActivity(intent1);
			}
		});
		
	}
    
    
    private void addListnerOnButton1() {
		// TODO Auto-generated method stub
		cancel=(Button)findViewById(R.id.button2);
		cancel.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Intent intent= new Intent(page2.this,MainActivity.class);
				//startActivity(intent);
				finish();
			}
		});
		
	}
    }
