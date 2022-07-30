/*
 * Copyright 2018, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(private val finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    private var _onPlayAgainEvent = MutableLiveData<Boolean>()
    val onPlayAgainEvent: LiveData<Boolean>
        get() = _onPlayAgainEvent

    init {
        _score.value = finalScore
        Log.i("ScoreViewModel", "Final score is $finalScore")
    }

    fun onPlayAgain() {
        _onPlayAgainEvent.value = true
    }

    fun onPlayAgainComplete() {
        _onPlayAgainEvent.value = false
    }

}