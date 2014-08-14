package com.UI.uiproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;
import android.graphics.Color;
import android.text.InputType;
import android.view.Menu;
import android.widget.EditText;

public class password_store extends Activity {
	Button back;
	Button nav1;
	Button nav2;
	Button save;
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.password_store);
	        back=(Button)findViewById(R.id.button2);
	        nav1=(Button)findViewById(R.id.button3);
	        nav2=(Button)findViewById(R.id.button4);
	        save=(Button)findViewById(R.id.button1);
	        addListnerOnButton();
	        addListnerOnButton1();
	        addListnerOnButton2();
	        addListnerOnButton3();
	 }
	 private void addListnerOnButton() {
			// TODO Auto-generated method stub
			final Context context = this;
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
			final Context context = this;
			nav1=(Button)findViewById(R.id.button3);
			nav1.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(password_store.this,page2.class);
    				startActivity(intent);
				}
			});
			
		}
	 private void addListnerOnButton3() {
			// TODO Auto-generated method stub
			final Context context = this;
			nav2=(Button)findViewById(R.id.button4);
			nav2.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(password_store.this,passwords.class);
 				startActivity(intent);
				}
			});
			
		}
	 private void addListnerOnButton1() {
			// TODO Auto-generated method stub
			final Context context = this;
			save=(Button)findViewById(R.id.button1);
			save.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Toast.makeText(getApplicationContext(), 
                            "Entered data is saved", Toast.LENGTH_LONG).show();
				}
			});
			
		}

}
