package com.sample.daggerscope

import dagger.Module
import dagger.Provides

@Module
abstract class MainActivityModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        @UserScope
        fun providesUserSession() = UserSession()
    }
}