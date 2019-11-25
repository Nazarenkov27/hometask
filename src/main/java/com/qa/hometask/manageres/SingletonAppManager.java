package com.qa.hometask.manageres;

public class SingletonAppManager {
    private static SingletonAppManager singleInstance = null;
    public AppManager manager;

    private SingletonAppManager() {
        manager = new AppManager();
    }

    public static SingletonAppManager getInstance() {
        if (singleInstance == null) {
            singleInstance = new SingletonAppManager();
        }
        return singleInstance;
    }
}
