package uca.app;

import android.app.Application;

import com.tumblr.remember.Remember;

/**
 * Created by isi3 on 02/03/2017.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Remember.init(getApplicationContext(), getApplicationContext().getPackageName());
    }
}//fin de la clase
