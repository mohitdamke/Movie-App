package com.example.movieapp.domain.usecases

import com.example.movieapp.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager : LocalUserManager
) {

      operator fun invoke() : Flow<Boolean> {
      return  localUserManager.readAppEntry()
    }
}