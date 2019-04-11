package com.sungbin.mvp.model;

import android.content.*;
import android.widget.*;
import com.sungbin.mvp.*;

public class MainModel{
	Context ctx;
	
	public MainModel(Context ctx){
		this.ctx = ctx;
	}
	
    MainConstants.Presenter presenter;
	
    public void toastResult(int result){
       Toast.makeText(ctx, result + "", Toast.LENGTH_SHORT).show();
    }
}
