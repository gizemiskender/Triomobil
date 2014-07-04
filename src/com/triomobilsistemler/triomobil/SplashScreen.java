package com.triomobilsistemler.triomobil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends Activity {

	private final static String ERROR_RUNNING_THREAD = "Thread somehow interrupted";
	Intent appStarter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash_screen);
		
		getActionBar().hide();

		ThreadRunner threadRunner = new ThreadRunner();
		Thread thread = new Thread(threadRunner);
		thread.start();

	}

	class ThreadRunner implements Runnable {

		@Override
		public void run() {

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Toast.makeText(getApplicationContext(), ERROR_RUNNING_THREAD,
						Toast.LENGTH_LONG).show();
				
				e.printStackTrace();
			}finally{
				appStarter = new Intent(SplashScreen.this,LoginPage.class);
				startActivity(appStarter);
				
			}

		}

	}
	
	@Override
	protected void onPause(){
		super.onPause();
		finish();
	}

}
