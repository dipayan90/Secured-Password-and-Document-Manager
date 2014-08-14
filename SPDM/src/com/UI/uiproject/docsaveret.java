package com.UI.uiproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnClickListener;

public class docsaveret extends Activity {
	ImageButton save;
	ImageButton	get;
	ImageButton back;
	ImageButton	help;
	Button nav1;
	Button nav2;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.docsaveret);
        addListnerOnButton();
        addListnerOnButton1();
        addListnerOnButton2();
        addListnerOnButton3();
        addListnerOnButton4();
        addListnerOnButton5();
        
        save=(ImageButton)findViewById(R.id.imageButton1);
        get=(ImageButton)findViewById(R.id.imageButton2);
        back=(ImageButton)findViewById(R.id.imageButton3);
        help=(ImageButton)findViewById(R.id.imageButton4);
        nav1=(Button)findViewById(R.id.button4);
        nav2=(Button)findViewById(R.id.button3);
    }
       
        private void addListnerOnButton() {
    		// TODO Auto-generated method stub
    		get=(ImageButton)findViewById(R.id.imageButton2);
    		get.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(docsaveret.this,docretloginpass.class);
    				startActivity(intent);
    			}
    		});
        }
        private void addListnerOnButton4() {
    		// TODO Auto-generated method stub
    		nav1=(Button)findViewById(R.id.button4);
    		nav1.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(docsaveret.this,page2.class);
    				startActivity(intent);
    			}
    		});
        }
        
        private void addListnerOnButton5() {
    		// TODO Auto-generated method stub
    		nav2=(Button)findViewById(R.id.button3);
    		nav2.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(docsaveret.this,docretloginpass.class);
    				startActivity(intent);
    			}
    		});
        }
        
        private void addListnerOnButton1() {
    		// TODO Auto-generated method stub
    		back=(ImageButton)findViewById(R.id.imageButton3);
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
    		help=(ImageButton)findViewById(R.id.imageButton4);
    		help.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(docsaveret.this,help2.class);
    				startActivity(intent);
    			}
    		});
        }
        private void addListnerOnButton3() {
    		// TODO Auto-generated method stub
    		save=(ImageButton)findViewById(R.id.imageButton1);
    		save.setOnClickListener(new OnClickListener() {

    			@Override
    			public void onClick(View arg0) {
    				// TODO Auto-generated method stub
    				Intent intent= new Intent(docsaveret.this,password_store.class);
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