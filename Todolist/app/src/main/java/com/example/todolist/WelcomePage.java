package com.example.todolist;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class WelcomePage extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        // open the page with full screen
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        goMain();
    }

    private void goMain() {
//        schedule the task by using TimerTask class
        TimerTask delayTask = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomePage.this, MainActivity.class);
                startActivity(intent);
                WelcomePage.this.finish();
            }
        };
        Timer timer = new Timer();
        timer.schedule(delayTask, 3000);   // set up a schedule to the methods, executing the goMain() method after 2 second.
    }
}