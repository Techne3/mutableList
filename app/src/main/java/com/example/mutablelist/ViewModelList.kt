package com.example.mutablelist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class ViewModelList : ViewModel() {


    private  val _nameList = mutableListOf<String>()
    val names = MutableLiveData<List<String>>()

init {
    names.value = _nameList
}

    fun addName(first: String, last: String) {
        _nameList.add(last)
        _nameList.add(first)
        names.value = _nameList
    }

}