package com.frederick.inittutorialslider;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.viewpagerindicator.IconPagerAdapter;

public class SlidesAdapter extends FragmentPagerAdapter implements IconPagerAdapter {

	protected static final String[] CONTENT = new String[] { "1", "2", "3", };


    private int mCount = CONTENT.length;

    public SlidesAdapter(FragmentManager fm) {
		super(fm);
		// TODO Auto-generated constructor stub
	}
    
    @Override
    public Fragment getItem(int position) {
    	Fragment fragment;
    	 switch(position) {
    	 case 0: 
    		 fragment = new Slide01();
    	     break;
    	 case 1: 
    		 fragment = new Slide02();
    	     break;
    	 case 2: 
    		 fragment = new Slide03();
    	     break;
    	 default: 
    		 fragment = new Slide01();
    	 }
    	 return fragment;
    }

    @Override
    public int getCount() {
        return mCount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
      return SlidesAdapter.CONTENT[position % CONTENT.length];
    }



    public void setCount(int count) {
        if (count > 0 && count <= 10) {
            mCount = count;
            notifyDataSetChanged();
        }
    }

	@Override
	public int getIconResId(int index) {
		// TODO Auto-generated method stub
		return 0;
	}
}
