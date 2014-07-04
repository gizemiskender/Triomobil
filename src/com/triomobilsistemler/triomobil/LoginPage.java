package com.triomobilsistemler.triomobil;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends Activity implements View.OnClickListener {

	private Button enter_btn;
	private EditText user_name, password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		getActionBar().hide();

		initViews();

	}

	private void initViews() {

		enter_btn = (Button) findViewById(R.id.login_btn);
		enter_btn.setOnClickListener(this);

		user_name = (EditText) findViewById(R.id.login_user_name);
		password = (EditText) findViewById(R.id.login_password);

		password.setTypeface(Typeface.DEFAULT);
		password.setTransformationMethod(new PasswordTransformationMethod());

	}

	@Override
	public void onClick(View v) {
		startActivity(new Intent(this, MainActivity.class));

	}
	
	@Override 
	protected void onPause(){
		super.onPause();
		finish();
	}

}
