package com.afarghaly.afarghalyble.ui.details.recyclerview.model;

import java.util.Set;

import com.afarghaly.library.device.BluetoothLeDevice;
import com.afarghaly.library.device.BluetoothService;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

public class DeviceInfoItem implements RecyclerViewItem {

    private final BluetoothLeDevice mDevice;

    public DeviceInfoItem(BluetoothLeDevice device) {
        mDevice = device;
    }

    public Set<BluetoothService> getBluetoothDeviceKnownSupportedServices() {
        return mDevice.getBluetoothDeviceKnownSupportedServices();
    }

    public String getBluetoothDeviceBondState() {
        return mDevice.getBluetoothDeviceBondState();
    }

    public String getBluetoothDeviceMajorClassName() {
        return mDevice.getBluetoothDeviceMajorClassName();
    }

    public String getBluetoothDeviceClassName() {
        return mDevice.getBluetoothDeviceClassName();
    }

    public String getAddress() {
        return mDevice.getAddress();
    }

    public String getName() {
        return mDevice.getName();
    }
}
