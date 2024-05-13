/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lunchtray.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lunchtray.constants.ItemType.MENULUNCH
import com.example.lunchtray.data.DataSource

class OrderViewModel : ViewModel() {

    // Map of menu items
    val menuItems = DataSource.menuItems

    // Menulunch for the order
    private val _menulunch = MutableLiveData<MenuItem?>()
    val menulunch: LiveData<MenuItem?> = _menulunch


    // Menudinner for the order
    private val _menudinner = MutableLiveData<MenuItem?>()
    val menudinner:LiveData<MenuItem?> =_menudinner

    //function to pass the value of lunch
    fun setLunch(menulunch: String) {

        // TODO: set the current menulunch value to the menu item corresponding to the passed in string
        _menulunch.value = menuItems[menulunch]


    }
    //function to pass the value of dinner
    fun setDinner(menudinner: String) {

        // TODO: set the current menudinner value to the menu item corresponding to the passed in string
        _menudinner.value = menuItems[menudinner]



    }
    /**
     * Reset all values.
     */
    fun resetOrder() {
        // TODO: Reset all values.
        _menulunch.value = null
        _menudinner.value = null

    }

}
