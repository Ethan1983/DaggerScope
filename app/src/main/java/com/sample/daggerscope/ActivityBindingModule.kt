package com.sample.daggerscope

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityBindingModule {

    @UserScope
    @ContributesAndroidInjector( modules = [MainActivityModule::class] )
    fun mainActivity() : MainActivity
}