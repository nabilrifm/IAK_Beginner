package com.example.nabil.iak_beginner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    public final static String USERNAME = "username";
    public final static String PASSWORD = "password";
    private final static String TAG = MainActivity.class.getSimpleName();


    private TextView et_username;
    private TextView et_password;
    private ImageView iv_picture;
    private String link_picture= "https://winnyradc.files.wordpress.com/2015/02/tugu-khatulistiwa-titik-nol-garis-khatulistiwa-di-pontianak.jpg?w=640";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: ");
        et_username=findViewById(R.id.et_username);
        et_password=findViewById(R.id.et_password);
        iv_picture=findViewById(R.id.iv_picture);

        String username_intent = getIntent().getStringExtra(USERNAME);
        String password_intent = getIntent().getStringExtra(PASSWORD);

        Picasso.with(this)
                .load(link_picture)
                .into(iv_picture, new Callback() {
                    @Override
                    public void onSuccess() {
                        Toast.makeText(MainActivity.this, "YES ANDA BERHASIL :D",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onError() {
                        Toast.makeText(MainActivity.this, "YAH ANDA GAGAL :(",Toast.LENGTH_LONG).show();

                    }
                });
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }
}
    