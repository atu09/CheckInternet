package info.androidhive.checkinternet;

import android.app.Application;

/**
 * Created by Ravi Tamada on 15/06/16.
 * www.androidhive.info
 */

public class MyApplication extends Application {

    private static MyApplication myInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        myInstance = this;
    }

    public static synchronized MyApplication getInstance() {
        return myInstance;
    }

    public void setConnectivityListener(ConnectivityReceiver.ConnectivityReceiverListener listener) {
        ConnectivityReceiver.connectivityReceiverListener = listener;
    }
}
