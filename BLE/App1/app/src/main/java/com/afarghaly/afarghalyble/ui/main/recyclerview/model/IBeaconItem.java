package com.afarghaly.afarghalyble.ui.main.recyclerview.model;

import com.afarghaly.library.device.beacon.ibeacon.IBeaconDevice;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

public class IBeaconItem implements RecyclerViewItem {

    private final IBeaconDevice device;

    public IBeaconItem(final IBeaconDevice device) {
        this.device = device;
    }

    public IBeaconDevice getDevice() {
        return device;
    }

}
