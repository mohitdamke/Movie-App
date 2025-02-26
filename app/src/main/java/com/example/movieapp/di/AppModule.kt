package com.example.movieapp.di

import android.app.Application
import com.example.movieapp.data.manager.LocalUserManagerImpl
import com.example.movieapp.domain.manager.LocalUserManager
import com.example.movieapp.domain.usecases.AppEntryUseCases
import com.example.movieapp.domain.usecases.ReadAppEntry
import com.example.movieapp.domain.usecases.SaveAppEntry
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManager(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(application)


    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )
}