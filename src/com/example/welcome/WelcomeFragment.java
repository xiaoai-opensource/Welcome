package com.example.welcome;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class WelcomeFragment extends Fragment {
	
	View view = null;
	int imgId ;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		view = inflater.inflate(R.layout.welcome_fragment, null);
		
		ImageView  fragmentVw = (ImageView) view.findViewById(R.id.welcome_Img);
		fragmentVw.setBackgroundResource(imgId);
		return view;
	}
	
	/**
	 * 为该Fragment设置显示图片
	 * */
	public void setImg(int imgID){
		
		imgId = imgID;
	}
}
