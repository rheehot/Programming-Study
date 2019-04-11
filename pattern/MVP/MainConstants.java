package com.sungbin.mvp;

public interface MainConstants {
    interface View{
        void showResult(int result);
    }
	
    interface Presenter{
        void addNumber(int input1, int input2);
		void toastResult(int result);
    }
}
