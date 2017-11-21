package com.star.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Star on 2017/11/21.
 */

public class BroadcastReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String event = intent.getAction();
        Toast.makeText(context , "BR2 : " + event ,Toast.LENGTH_SHORT ).show();
    }
}
