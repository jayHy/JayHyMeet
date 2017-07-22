package kr.co.jayhy.meet;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by jhkim on 2017-07-05.
 */

public class JayHyApplication extends Application {

    private Realm realm = null;

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this); // application realm init

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(realmConfiguration);

        realm = Realm.getDefaultInstance();
    }



}
