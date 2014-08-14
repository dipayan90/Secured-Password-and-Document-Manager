package com.UI.uiproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class docretloginpass extends Activity {
	Button back;
	ImageButton help;
	ImageButton retrieve;
	Button nav1;
	Button nav2;
	
	 @Override
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.docretlogin);
	        back=(Button)findViewById(R.id.button2);
	        help=(ImageButton)findViewById(R.id.imageButton1);
	        retrieve=(ImageButton)findViewById(R.id.imageButton2);
	        nav1=(Button)findViewById(R.id.button1);
	        nav2=(Button)findViewById(R.id.button4);
	        
	       addListnerOnButton();
	       addListnerOnButton1();
	       addListnerOnButton2();
	       addListnerOnButton3();
	       addListnerOnButton4();
	 }
	 private void addListnerOnButton() {
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
	 private void addListnerOnButton3() {
			// TODO Auto-generated method stub
			nav1=(Button)findViewById(R.id.button1);
			nav1.setOnClickListener(new OnClickListener() {

		@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
			Intent intent= new Intent(docretloginpass.this,page2.class);
			startActivity(intent);
				}
			});
			
		}
	 
	 private void addListnerOnButton4() {
			// TODO Auto-generated method stub
			nav2=(Button)findViewById(R.id.button4);
			nav2.setOnClickListener(new OnClickListener() {

		@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
			Intent intent= new Intent(docretloginpass.this,docsaveret.class);
			startActivity(intent);
				}
			});
			
		}
	 
	 private void addListnerOnButton1() {
			// TODO Auto-generated method stub
			help=(ImageButton)findViewById(R.id.imageButton1);
			help.setOnClickListener(new OnClickListener() {

			@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(docretloginpass.this,help2.class);
    				startActivity(intent);
				}
			});
			
		}
	 
	 private void addListnerOnButton2() {
			// TODO Auto-generated method stub
		//	final Context context = this;
			retrieve=(ImageButton)findViewById(R.id.imageButton2);
			retrieve.setOnClickListener(new OnClickListener() {

				@Override
				public void onClick(View arg0) {
					// TODO Auto-generated method stub
					Intent intent= new Intent(docretloginpass.this,displaypass.class);
    				startActivity(intent);
    				Toast.makeText(getApplicationContext(), 
                            "Record is being retrieved", Toast.LENGTH_LONG).show();
				}
			});
			
	}

}
