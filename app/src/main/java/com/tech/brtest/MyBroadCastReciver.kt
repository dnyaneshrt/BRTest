package com.tech.brtest

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

import android.widget.Toast

/*
- create a class as a child of BroadcastReceiver class.
- it is an abstract class having an abstract method called onReceive() so provide the
implementation for onReceive() method.
 */
class MyBroadCastReciver:BroadcastReceiver() {

    override fun onReceive(p0: Context?,intent: Intent?) {

        if(intent?.action.equals(Intent.ACTION_BATTERY_LOW))
        {


        }
        Toast.makeText(p0,"changed......${intent?.action}",Toast.LENGTH_LONG).show()
    }
}