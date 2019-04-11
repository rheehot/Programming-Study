package com.sungbin.mvp.view;

import android.app.*;
import android.os.*;
import android.widget.*;
import com.sungbin.mvp.*;
import com.sungbin.mvp.presenter.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends Activity implements MainConstants.View{
	
	MainConstants.Presenter presenter;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		presenter = new MainPresenter(this, getApplicationContext());
		
		((Button) findViewById(R.id.doIt)).setOnClickListener(new OnClickListener(){
				@Override
				public void onClick(View p1){
					presenter.addNumber(
						Integer.parseInt(((TextView) findViewById(R.id.inputNumber)).getText().toString()),
						Integer.parseInt(((TextView) findViewById(R.id.inputNumber2)).getText().toString())
					);
				}
		});
    }
	
	@Override
	public void showResult(int result){
		presenter.toastResult(result);
		((TextView) findViewById(R.id.result)).setText(result + "");
	}
}
