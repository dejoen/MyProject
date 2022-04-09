package com.app.binding;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import com.app.binding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
	String name=MainActivity.class.getSimpleName();

	
   ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
		View view=mainBinding.getRoot();
        setContentView(view);
    mainBinding.mytext.setText("welcome to viewbing");
 startActivity(new Intent(MainActivity.this,SecondActivity.class));ll
	Log.d(name,"viewbingConnected");
     
    }
}