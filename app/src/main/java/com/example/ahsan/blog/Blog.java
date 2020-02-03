package com.example.ahsan.blog;

import android.app.Application;

import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by ahsan on 1/3/18.
 */

public class Blog extends Application {

    private FirebaseAuth mAuth;
    private FirebaseAuth.AuthStateListener firebaseAuthListener;

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
