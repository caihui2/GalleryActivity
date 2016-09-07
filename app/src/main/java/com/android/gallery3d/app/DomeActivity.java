package com.android.gallery3d.app;


import com.android.gallery3d.ui.LinnPohtoView;

import android.os.Bundle;

public class DomeActivity  extends ActivityState{
	private LinnPohtoView mLinnPohtoView;
	@Override
	protected void onCreate(Bundle data, Bundle storedState) {
		super.onCreate(data, storedState);
		mLinnPohtoView = new LinnPohtoView(mActivity);
		setContentPane(mLinnPohtoView);
	}
  
}
