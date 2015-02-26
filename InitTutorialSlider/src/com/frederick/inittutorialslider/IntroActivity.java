package com.frederick.inittutorialslider;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Window;
import android.view.WindowManager;

import com.viewpagerindicator.CirclePageIndicator;
import com.viewpagerindicator.PageIndicator;

public class IntroActivity extends FragmentActivity {
	protected SlidesAdapter mAdapter;
	protected ViewPager mPager;
	protected PageIndicator mIndicator;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// NO TITLE ON THIS ACTIVITY  ********************************
			requestWindowFeature(Window.FEATURE_NO_TITLE); 
			this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
		// ***********************************************************
		setContentView(R.layout.activity_intro);
		
    	generateSlider();
	    
	}
	
	private void generateSlider() {
		// ++++++ SLIDER ++++++++++ 
		mAdapter = new SlidesAdapter(getSupportFragmentManager());
		mPager = (ViewPager)findViewById(R.id.pager);
		mPager.setAdapter(mAdapter);
		mIndicator = (CirclePageIndicator)findViewById(R.id.indicator);
		mIndicator.setViewPager(mPager);
		// ++++++++++++++++
		//We set this on the indicator, NOT the pager
		mIndicator.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
		        @Override
		        public void onPageSelected(int position) {
		        }
		
		        @Override
		        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
		        }
		
		        @Override
		        public void onPageScrollStateChanged(int state) {
		        }
		        
		});
		
	}
	
	
}
