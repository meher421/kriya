package com.myapplication.ui;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.myapplication.Utils.Logger;
import com.myapplication.Utils.Util;
import com.myapplication.dto.Product;
import com.myapplication.dto.downlink.DayData;
import com.myapplication.dto.downlink.DownlinkImpl;
import com.myapplication.dto.downlink.IDownLink;

import java.util.Iterator;

public class DownlinkIntentService extends IntentService {
    // IntentService can perform, e.g. ACTION_FETCH_NEW_ITEMS
    private static final String ACTION_FOO = "com.myapplication.ui.action.FOO";
    private static final String ACTION_BAZ = "com.myapplication.ui.action.BAZ";

    // TODO: Rename parameters
    private static final String EXTRA_PARAM1 = "com.myapplication.ui.extra.PARAM1";
    private static final String EXTRA_PARAM2 = "com.myapplication.ui.extra.PARAM2";

    private static final String TAG = "IntentService-123456";

    public DownlinkIntentService() {
        super("DownlinkIntentService");
    }

    /**
     * Starts this service to perform action Foo with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionFoo(Context context, String param1, String param2) {
        Intent intent = new Intent(context, DownlinkIntentService.class);
        intent.setAction(ACTION_FOO);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    /**
     * Starts this service to perform action Baz with the given parameters. If
     * the service is already performing a task this action will be queued.
     *
     * @see IntentService
     */
    // TODO: Customize helper method
    public static void startActionBaz(Context context, String param1, String param2) {
        Intent intent = new Intent(context, DownlinkIntentService.class);
        intent.setAction(ACTION_BAZ);
        intent.putExtra(EXTRA_PARAM1, param1);
        intent.putExtra(EXTRA_PARAM2, param2);
        context.startService(intent);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        if (intent != null) {
            final String action = intent.getAction();
            if (ACTION_FOO.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionFoo(param1, param2);
            } else if (ACTION_BAZ.equals(action)) {
                final String param1 = intent.getStringExtra(EXTRA_PARAM1);
                final String param2 = intent.getStringExtra(EXTRA_PARAM2);
                handleActionBaz(param1, param2);
            }
        }
    }

    /**
     * Handle action Foo in the provided background thread with the provided
     * parameters.
     */
    private void handleActionFoo(String param1, String param2) {

        Logger.i(TAG ,"handleActionFoo ");
        final DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        database.child("DailyMarket").child(Util.getTodayDate()).addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                Iterator<DataSnapshot> it = dataSnapshot.getChildren().iterator();

                while (it.hasNext()) {
                    Logger.i(TAG, " iterator : " + it.next());
                }

                DayData data = dataSnapshot.getValue(DayData.class);
                double dPrice = data.getDollar();

                IDownLink downLink = DownlinkImpl.getInstance();
                downLink.setTodaysData(data);

                Logger.i(TAG, " dollar price " + dPrice +": "+data.getLastUpdated()+" \n  products :: "+(data.getProducts()) +" \n  messages:"+data.getMessages());

                notifyJobDone();

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

                Logger.i(TAG, "queryFailed");

                notifyJobDone();
            }
        });


    }

    /**
     * Handle action Baz in the provided background thread with the provided
     * parameters.
     */
    private void handleActionBaz(String param1, String param2) {
        // TODO: Handle action Baz
        throw new UnsupportedOperationException("Not yet implemented");
    }


    void notifyJobDone(){
        Intent intent = new Intent();
        intent.setAction("TEST");
        sendBroadcast(intent);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.i(TAG,"onDestroy");

    }
}
