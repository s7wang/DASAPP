package com.wangs7.dasapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.wangs7.dasapp.camera.Camera2Tools;
import com.wangs7.projectv1.camera2.AutoFitSurfaceView;

public class SendActivity extends AppCompatActivity {


    private Camera2Tools mCamera2Tools;
    private Button startBt;
    private AutoFitSurfaceView autoFitSurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send);
    }
}