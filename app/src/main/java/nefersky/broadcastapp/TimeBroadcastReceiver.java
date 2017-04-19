package nefersky.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.widget.Toast;

import java.text.Format;
import java.util.Date;

public class TimeBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        String msg = "Текущее время: ";
        Format formatter = new SimpleDateFormat("hh:mm:ss a");
        msg += formatter.format(new Date());
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
