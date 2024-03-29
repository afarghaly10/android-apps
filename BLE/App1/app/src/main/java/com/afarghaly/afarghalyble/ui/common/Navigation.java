package com.afarghaly.afarghalyble.ui.common;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;

import com.afarghaly.library.device.BluetoothLeDevice;
import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.control.DeviceControlActivity;
import com.afarghaly.afarghalyble.ui.details.DeviceDetailsActivity;

public class Navigation {

    private final Activity mActivity;

    public Navigation(final Activity activity) {
        mActivity = activity;
    }

    public void openDetailsActivity(final BluetoothLeDevice device) {
        final Intent intent = DeviceDetailsActivity.createIntent(mActivity, device);

        startActivity(intent);
    }

    public void startControlActivity(final BluetoothLeDevice device) {
        final Intent intent = DeviceControlActivity.createIntent(mActivity, device);

        startActivity(intent);
    }

    public void shareFileViaEmail(final Uri fileUri, final String[] recipient, final String subject, final String message) {
        final Intent intent = new Intent(Intent.ACTION_SEND);

        intent.setType("plain/text");
        intent.putExtra(Intent.EXTRA_STREAM, fileUri);
        intent.putExtra(Intent.EXTRA_EMAIL, recipient);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);

        startActivity(Intent.createChooser(intent,
                mActivity.getString(R.string.exporter_email_device_list_picker_text)));
    }


    private void startActivity(final Intent intent) {
        ActivityCompat.startActivity(mActivity, intent, null);
    }
}
