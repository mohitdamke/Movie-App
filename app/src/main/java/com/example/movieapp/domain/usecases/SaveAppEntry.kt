package com.example.movieapp.domain.usecases

import com.example.movieapp.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager : LocalUserManager
) {

    suspend  operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}