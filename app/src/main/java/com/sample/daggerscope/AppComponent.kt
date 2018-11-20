package com.sample.daggerscope

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component( modules = [AndroidSupportInjectionModule::class, ActivityBindingModule::class, AppModule::class] )
interface AppComponent : AndroidInjector<MainApplication>