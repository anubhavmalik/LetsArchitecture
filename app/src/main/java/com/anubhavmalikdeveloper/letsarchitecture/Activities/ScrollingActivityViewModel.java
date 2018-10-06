package com.anubhavmalikdeveloper.letsarchitecture.Activities;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import com.anubhavmalikdeveloper.letsarchitecture.Models.User;
import com.anubhavmalikdeveloper.letsarchitecture.REST.ApiClient;
import com.anubhavmalikdeveloper.letsarchitecture.REST.ApiInterface;
import com.anubhavmalikdeveloper.letsarchitecture.Utils.AppUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScrollingActivityViewModel extends ViewModel {
    private MutableLiveData<List<User>> users;

    public LiveData<List<User>> getUsers() {
        if(users==null) {
            users = new MutableLiveData<List<User>>();
            loadUsers();
        }
        return users;
    }

    private void loadUsers() {
        ApiClient apiClient = new ApiClient().getApiClientInstance();
        ApiInterface apiInterface = apiClient.createService(ApiInterface.class);
        apiInterface.getUserList().enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                if(response.isSuccessful()){
                    if(response.body()!=null){
                        users.setValue(response.body());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                // handle failure
            }
        });
    }
}
