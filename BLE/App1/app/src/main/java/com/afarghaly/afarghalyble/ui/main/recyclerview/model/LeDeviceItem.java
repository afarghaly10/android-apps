package com.afarghaly.afarghalyble.ui.main.recyclerview.model;

import com.afarghaly.library.device.BluetoothLeDevice;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

public class LeDeviceItem implements RecyclerViewItem {

    private final BluetoothLeDevice device;

    public LeDeviceItem(final BluetoothLeDevice device) {
        this.device = device;
    }

    public BluetoothLeDevice getDevice() {
        return device;
    }
}
