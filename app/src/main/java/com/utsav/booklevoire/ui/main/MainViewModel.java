package com.utsav.booklevoire.ui.main;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.firebase.Firebase;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.utsav.booklevoire.AuthRepository;

import java.io.Closeable;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel
    private AuthRepository repository;
    private MutableLiveData<FirebaseUser> userData;
    private MutableLiveData<Boolean> loggedStatus;

    public MutableLiveData<FirebaseUser> getUserData() {
        return userData;
    }

    public MutableLiveData<Boolean> getLoggedStatus() {
        return loggedStatus;
    }



public void register (String email,String pass){
        repository.register(email,pass);
}
public void signIn(String email,String pass){
        repository.login(email,pass);
}
public void signOut(){
        repository.signOut();
}




}