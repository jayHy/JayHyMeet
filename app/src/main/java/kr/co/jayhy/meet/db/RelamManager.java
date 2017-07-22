package kr.co.jayhy.meet.db;

import android.util.Log;

import io.realm.Realm;
import io.realm.RealmResults;
import kr.co.jayhy.meet.common.CommonValues;
import kr.co.jayhy.meet.item.MeetInfoItem;
import kr.co.jayhy.meet.item.MemberInfoItem;

/**
 * Created by jhkim on 2017-07-05.
 */

public class RelamManager {

    private void addUserData(Realm realm) {
        realm.executeTransactionAsync(new Realm.Transaction() {
            @Override
            public void execute(Realm bgRealm) {
                MemberInfoItem meetInfo = bgRealm.createObject(MemberInfoItem.class);
                meetInfo.setEmail("");
            }
        }, new Realm.Transaction.OnSuccess() {
            @Override
            public void onSuccess() {
                // Transaction was a success.
            }
        }, new Realm.Transaction.OnError() {
            @Override
            public void onError(Throwable error) {
                // Transaction failed and was automatically canceled.
            }
        });
    }

    private int basicQuerySize(Realm realm) {
        RealmResults<MemberInfoItem> results = null;
        int result = 0;
        try {
            results = realm.where(MemberInfoItem.class).findAll();
            result = results.size();
        } catch (Exception e) {
            Log.d(CommonValues.TAG, "basicQuerySize Exception : " + e.toString());
        } finally {
            if (results != null) results = null;
        }

        return result;
    }

}
