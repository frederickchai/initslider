package com.frederick.inittutorialslider;

import com.viewpagerindicator.PageIndicator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

public class SplashActivity extends FragmentActivity {
	protected SlidesAdapter mAdapter;
	protected ViewPager mPager;
	protected PageIndicator mIndicator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_splash);
	
		//verify the user is logged
		if(isLogged()){
			// go to main activity
			goToMain();
		}else{
			getSomeData();
			goToIntro();
		}
	
	}
	
	private boolean isLogged(){
		//here write your authentication code
		return false;
	}

	private void getSomeData(){
		// get data from web services
		// update DB
		// bla bla bla gato
	}
	
	private void goToIntro(){
		Intent in =  new Intent(SplashActivity.this,IntroActivity.class);
		startActivity(in);
	}
	
	private void goToMain(){
		Intent in =  new Intent(SplashActivity.this,com.app.MainActivity.class);
		startActivity(in);
	}
	
	public void onRestart(){
	   super.onResume();
	   finish();
       return;
	}
}
