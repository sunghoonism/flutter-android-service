package com.example.backgroundservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class testservice extends Service {
    public testservice() {
    }

    //My custom code
    @Override
    public int onStartCommand(Intent intent, int flags, int startId){
        // 폰에 메시지 띄움
        Toast.makeText(getApplicationContext(), "This is from a service", Toast.LENGTH_LONG).show();
        /*
        START_STICKY : Service 강제 종료되어도 다시 service 재시작 시켜 줌
        START_NOT_STICKY : 강제 종료된 Service가 재시작하지 않음
         */
        return START_NOT_STICKY;
        /*
        1. Create a method channel at Main.dart
        2. Invoke methods through channel at Main.dart
        3. Override flutter engine at MainActivity
        4. Create service at service.java file
         */
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}