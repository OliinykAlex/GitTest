package com.example.alexandr.gittest;

import android.os.Handler;
import android.os.Message;

public class Test1 {

    public final String MY_CONSTANT = "ABC";
    public static final String MY_CONSTANT2 = "ABC";

    void sendMessage(){


        Message message = Message.obtain(new Handler(new Handler.Callback() {
                    @Override
                    public boolean handleMessage(Message msg) {
                        return false;
                    }
                }), 101);


        //new Handler().postDelayed(r, delayMillis);



    }



}
