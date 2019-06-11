package com.afarghaly.afarghalyble.ui.details.recyclerview.model;

import com.afarghaly.library.device.BluetoothLeDevice;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

public class RssiItem implements RecyclerViewItem {

    private final BluetoothLeDevice mDevice;

    public RssiItem(BluetoothLeDevice device) {
        mDevice = device;
    }

    public int getRssi() {
        return mDevice.getRssi();
    }

    public double getRunningAverageRssi() {
        return mDevice.getRunningAverageRssi();
    }

    public int getFirstRssi() {
        return mDevice.getFirstRssi();
    }

    public long getFirstTimestamp() {
        return mDevice.getFirstTimestamp();
    }

    public long getTimestamp() {
        return mDevice.getTimestamp();
    }
}
