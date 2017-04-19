package nefersky.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MessageReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Сообщение: " + intent.getStringExtra("nefersky.broadcastapp.Message"), Toast.LENGTH_SHORT).show();
    }
}
