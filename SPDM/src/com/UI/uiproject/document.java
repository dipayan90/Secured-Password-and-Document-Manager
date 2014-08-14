package com.UI.uiproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class document extends Activity {
	ImageButton passport;
	ImageButton	license;
	Button back;
	Button nav1;
	Button nav2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.document);
       
        
        passport=(ImageButton)findViewById(R.id.imageButton1);
        license=(ImageButton)findViewById(R.id.imageButton2);
        back=(Button)findViewById(R.id.button1);
        nav1=(Button)findViewById(R.id.button2);
        nav2=(Button)findViewById(R.id.button4);
        addListnerOnButton();
        addListnerOnButton1();
        addListnerOnButton2();
        addListnerOnButton3();
        addListnerOnButton4();
    }
       
        private void addListnerOnButton() {
    		// TODO Auto-generated method stub
    		passport=(ImageButton)findViewById(R.id.imageButton1);
    		passport.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(document.this,docsaveret.class);
    				startActivity(intent);
    				Toast.makeText(getApplicationContext(), 
                            "you clicked on passport", Toast.LENGTH_LONG).show();
    			}
    		});
        }
        
        private void addListnerOnButton2() {
    		// TODO Auto-generated method stub
    		license=(ImageButton)findViewById(R.id.imageButton2);
    		license.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(document.this,docsaveret1.class);
    				startActivity(intent);
    				Toast.makeText(getApplicationContext(), 
                            "you clicked on License", Toast.LENGTH_LONG).show();
    			}
    		});
        }
        
        private void addListnerOnButton3() {
    		// TODO Auto-generated method stub
    		nav1=(Button)findViewById(R.id.button2);
    		nav1.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(document.this,page2.class);
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
    				Intent intent= new Intent(document.this,docsaveret.class);
    				startActivity(intent);
    				
    			}
    		});
        }
        
        private void addListnerOnButton1() {
    		// TODO Auto-generated method stub
    		back=(Button)findViewById(R.id.button1);
    		back.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				//Intent intent= new Intent(document.this,MainActivity.class);
    				//startActivity(intent);
    				finish();
    			}
    		});
        }
    		

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
