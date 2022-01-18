package com.example.mutablelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ViewModelList : ViewModel() {


    private var _firstName: MutableLiveData<List<String>> = MutableLiveData()
    val firstName: LiveData<List<String>> get() = _firstName
    private val arrFirstName = mutableListOf<String>()

    private var _lastName: MutableLiveData<List<String>> = MutableLiveData()
    val lastName: LiveData<List<String>> get() = _lastName
    private val arrLastName = mutableListOf<String>()


    fun addName(firstName: String, lastName: String) {
        arrFirstName.add(firstName)
        arrLastName.add(lastName)

        for (i in 0 until arrFirstName.size) {
            _firstName.value = arrFirstName
        }
        for (j in 0 until arrLastName.size) {
            _lastName.value = arrLastName
        }
    }

}








