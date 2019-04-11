package com.sungbin.mvp.presenter;

import com.sungbin.mvp.*;
import com.sungbin.mvp.model.*;
import android.content.*;

public class MainPresenter implements MainConstants.Presenter
 {
    MainConstants.View view;
    MainModel model;
	
    public MainPresenter(MainConstants.View view, Context ctx){
        this.view = view;
        model = new MainModel(ctx);
    }
	
    @Override
    public void addNumber(int input1, int input2) {
        view.showResult(input1 + input2);
    }

	@Override
	public void toastResult(int result){
		model.toastResult(result);
	}
	
}
