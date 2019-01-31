package com.example.admin.firstday;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class AddService extends Service {

    IAdd.Stub addBinder = new IAdd.Stub() {
        @Override
        public int add(int a, int b) throws RemoteException {
            return a+b;
        }
    };



    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        //throw new UnsupportedOperationException("Not yet implemented");
       return addBinder;
    }
}
