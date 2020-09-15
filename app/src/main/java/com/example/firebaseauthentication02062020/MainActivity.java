package com.example.firebaseauthentication02062020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mEdtEmail,mEdtPass;
    Button mBtnDangky,mBtnDangnhap,mBtnThongTin,mBtnCapNhatThongTin,mBtnCapNhatMatKhau,mBtnXacThucEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEdtPass = findViewById(R.id.edittextPassword);
        mEdtEmail = findViewById(R.id.edittextEmail);
        mBtnDangky = findViewById(R.id.buttonDangky);
        mBtnDangnhap = findViewById(R.id.buttonDangnhap);
        mBtnThongTin = findViewById(R.id.buttonThongtin);
        mBtnCapNhatThongTin = findViewById(R.id.buttonCapnhat);
        mBtnCapNhatMatKhau = findViewById(R.id.buttonUpdatePassword);
        mBtnXacThucEmail = findViewById(R.id.buttonVerification);
    }
}