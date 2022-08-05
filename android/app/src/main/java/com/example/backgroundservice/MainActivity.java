package com.example.backgroundservice;

import androidx.annotation.NonNull;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugin.common.MethodChannel;

public class MainActivity extends FlutterActivity {

    @Override
    public void configureFlutterEngine(@NonNull FlutterEngine flutterEngine) {
        super.configureFlutterEngine(flutterEngine);

        // main.dart에서 설정한 채널이름이 'backgroundservice'였으므로 여기서 반드시 동일 이름 사용
        new MethodChannel(flutterEngine.getDartExecutor().getBinaryMessenger(), "backgroundservice").setMethodCallHandler(
            (call, result) -> {
                if(call.method.equals("startService")) {
                    result.success("Method Found");
                } else {
                    result.notImplemented();
                }
            }
        );
    }
}
