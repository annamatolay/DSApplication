package com.matolaypal.app.dsapp;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;


public class RealmApplication extends Application {
        private static RealmApplication INSTANCE;

        static RealmApplication getInstance() {
            if (INSTANCE == null) {
                INSTANCE = new RealmApplication();
            }
            return INSTANCE;
        }

        @Override
        public void onCreate() {
            super.onCreate();
            RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                    .name(Realm.DEFAULT_REALM_NAME)
                    .schemaVersion(0)
                    .deleteRealmIfMigrationNeeded()
                    .build();
            Realm.setDefaultConfiguration(realmConfiguration);
        }
}
