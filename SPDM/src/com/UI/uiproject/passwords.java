package com.UI.uiproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;

public class passwords extends Activity {
	Button submit;
	Button back;
	CheckBox storepwd;
	CheckBox retrievepwd;
	Button nav1;
	Button nav2;
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.passwords);
	        submit=(Button)findViewById(R.id.button1);
	        back=(Button)findViewById(R.id.button2);
	        nav1=(Button)findViewById(R.id.button3);
	        nav2=(Button)findViewById(R.id.button4);
	        storepwd=(CheckBox)findViewById(R.id.checkBox1);
	        retrievepwd=(CheckBox)findViewById(R.id.checkBox2);
	        addListnerOnButton1();
	        
	        addListnerOnButton();
	        addListnerOnButton2();
	        addListnerOnButton3();
	        
	        //addListnerOnButton2();
	        //addListnerOnButton1();
	 
	 }

	    private void addListnerOnButton() {
			// TODO Auto-generated method stub
			submit=(Button)findViewById(R.id.button1);
			submit.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(passwords.this,password_store.class);
					Intent intent1= new Intent(passwords.this,passwordret.class);
					if (storepwd.isChecked())
					startActivity(intent);
					else if(retrievepwd.isChecked())
						startActivity(intent1);
				}
			});
			
		}
	    
	    
	    private void addListnerOnButton1() {
			// TODO Auto-generated method stub
			back=(Button)findViewById(R.id.button2);
			back.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					finish();
				}
			});
			
		}
	    
	    private void addListnerOnButton2() {
			// TODO Auto-generated method stub
			nav1=(Button)findViewById(R.id.button3);
			nav1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(passwords.this,page2.class);
					startActivity(intent);
				}
			});
			
		}
	    private void addListnerOnButton3() {
			// TODO Auto-generated method stub
			nav2=(Button)findViewById(R.id.button4);
			nav2.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(passwords.this,passwordret.class);
					startActivity(intent);
				}
			});
			
		}
	        
	 }


