package com.UI.uiproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class MainActivity extends Activity {
	Button cancel;
	Button register;
	EditText username;
	EditText Password;
	Button nav1;
	Button nav2;
	ImageButton help;
	ImageButton submit;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListnerOnButton();
        addListnerOnButton1();
    
     
        
        cancel=(Button)findViewById(R.id.button1);
        register=(Button)findViewById(R.id.button3);
        username=(EditText)findViewById(R.id.editText1);
        Password=(EditText)findViewById(R.id.editText2);
        help=(ImageButton)findViewById(R.id.imageButton1);
        username.setSingleLine();
        Password.setSingleLine();
        
        cancel.setOnClickListener(new OnClickListener()
        {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
        });
    }
       
        private void addListnerOnButton() {
    		// TODO Auto-generated method stub
    		final Context context = this;
    		submit=(ImageButton)findViewById(R.id.imageButton2);
    		submit.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(context,page2.class);
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
        				Intent intent= new Intent(MainActivity.this,help1.class);
        				startActivity(intent);
        			}
        		});
    	
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
