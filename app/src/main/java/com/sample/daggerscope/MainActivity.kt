package com.sample.daggerscope

import android.os.Bundle
import android.util.Log
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var appSignUp: AppSignUp

    @Inject
    lateinit var appSignUp1: AppSignUp

    @Inject
    lateinit var userSession: UserSession

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
