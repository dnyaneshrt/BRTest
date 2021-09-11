package com.tech.brtest

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        Steps to work with Broadcast Receiver :
- create a class as a child of BroadcastReceiver class.
- it is an abstract class having an abstract method called onReceive() so provide the
implementation for onReceive() method.
- from Activity class for which event you want to get the broadcast announcements
configure the events by using IntentFilter[group of intents is called as IntentFilter].
         */

        var intentFilter=IntentFilter()
        intentFilter.addAction(Intent.ACTION_CALL)
        intentFilter.addAction(Intent.ACTION_HEADSET_PLUG)
        intentFilter.addAction(Intent.ACTION_POWER_CONNECTED)
        intentFilter.addAction(Intent.ACTION_POWER_DISCONNECTED)
        intentFilter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        intentFilter.addAction(Intent.ACTION_SCREEN_ON)
        intentFilter.addAction(Intent.ACTION_SCREEN_OFF)

        registerReceiver(MyBroadCastReciver(),intentFilter)
        /*
        registerReceiver(new BroadcastReceiverClass(),filter);
- if any one of the configured events are happened it will invoke onReceive() method in the
broadcast receiver class.
         */

    }
}