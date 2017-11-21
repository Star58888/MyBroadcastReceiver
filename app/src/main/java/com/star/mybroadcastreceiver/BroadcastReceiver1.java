package com.star.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Star on 2017/11/21.
 */

public class BroadcastReceiver1 extends BroadcastReceiver {
    @Override  // 收廣播
    public void onReceive(Context context, Intent intent) {
        String event = intent.getAction();

        if (event.equals("demo.com.intent.action.CUSTOM_BROADCAST"))
        {
            Toast.makeText(context ," BR1 : 收到自訂廣播" ,Toast.LENGTH_SHORT ).show();
        }
        else
        {
            Toast.makeText(context ,"BR1 : " + event ,Toast.LENGTH_SHORT ).show();
        }

    }
}
