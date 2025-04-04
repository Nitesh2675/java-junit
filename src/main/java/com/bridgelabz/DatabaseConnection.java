package com.bridgelabz;

public class DatabaseConnection {
    private boolean isConnected;

    public boolean connectDb() {
        isConnected = true;
        return isConnected;
    }

    public boolean disconnect() {
        isConnected = false;
        return !isConnected;
    }

    public boolean isConnected() {
        return isConnected;
    }
}
