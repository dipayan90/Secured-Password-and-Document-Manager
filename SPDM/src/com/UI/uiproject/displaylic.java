package com.UI.uiproject;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class displaylic extends Activity {
	Button close;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.displaylic);
        addListnerOnButton();
        close=(Button)findViewById(R.id.button1);
    }
       
    private void addListnerOnButton() {
		// TODO Auto-generated method stub
		close=(Button)findViewById(R.id.button1);
		close.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				//Intent intent= new Intent(help1.this,MainActivity.class);
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
