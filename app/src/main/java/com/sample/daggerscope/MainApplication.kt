package com.sample.daggerscope

import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication
import javax.inject.Inject

class MainApplication : DaggerApplication() {

    @Inject
    lateinit var appSignUp : AppSignUp

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent.builder().build()
    }

}