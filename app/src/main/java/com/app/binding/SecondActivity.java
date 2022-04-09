package com.app.binding;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.app.binding.databinding.ActivitySecondBinding;

public class SecondActivity extends AppCompatActivity {
ActivitySecondBinding secondBinding;
	@Override
	protected void onCreate(Bundle arg0) {
		super.onCreate(arg0);
		secondBinding=ActivitySecondBinding.inflate(getLayoutInflater());
		View v=secondBinding.getRoot();
		setContentView(v);
		secondBinding.mySpinner.isFocused();
		
	}
	
}