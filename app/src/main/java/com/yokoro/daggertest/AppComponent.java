package com.yokoro.daggertest;


import dagger.Component;

@Component(modules = {StorageModule.class, NetworkModule.class})
public interface AppComponent {
    NetworkUtils getNetworkUtils();
    DatabaseHelper getDatabaseHelper();
}