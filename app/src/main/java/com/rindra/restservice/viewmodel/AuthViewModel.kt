package com.rindra.restservice.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rindra.restservice.schema.LoginBody
import com.rindra.restservice.service.ApiClient
import kotlinx.coroutines.launch

class AuthViewModel: ViewModel() {

    val apiClient = ApiClient.api;
    private val _loading = MutableLiveData<Boolean>();
    val loading: LiveData<Boolean> = _loading;

    fun login(email:String, password:String){
        _loading.postValue(true)
        viewModelScope.launch {
            val response = apiClient.getPairTokens(
                LoginBody(
                    email=email,
                    password = password
                )
            )
            print(response);
            _loading.postValue(false)
        }
    }
}