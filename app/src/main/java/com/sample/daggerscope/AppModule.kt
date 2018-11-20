package com.sample.daggerscope

import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Module
    companion object {

        @JvmStatic
        @Provides
        @Singleton
        fun providesAppSignUp() = AppSignUp()

    }
}