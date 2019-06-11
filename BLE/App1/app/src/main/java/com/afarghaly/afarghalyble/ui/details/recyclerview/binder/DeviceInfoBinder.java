package com.afarghaly.afarghalyble.ui.details.recyclerview.binder;

import android.content.Context;

import com.afarghaly.library.device.BluetoothService;
import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewBinder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;
import com.afarghaly.afarghalyble.ui.details.recyclerview.holder.DeviceInfoHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.DeviceInfoItem;

public class DeviceInfoBinder extends BaseViewBinder<DeviceInfoItem> {

    public DeviceInfoBinder(Context context) {
        super(context);
    }

    @Override
    public void bind(BaseViewHolder<DeviceInfoItem> holder, DeviceInfoItem item) {
        final DeviceInfoHolder actualHolder = (DeviceInfoHolder) holder;

        actualHolder.getName().setText(item.getName());
        actualHolder.getAddress().setText(item.getAddress());
        actualHolder.getDeviceClass().setText(item.getBluetoothDeviceClassName());
        actualHolder.getMajorClass().setText(item.getBluetoothDeviceMajorClassName());
        actualHolder.getBondingState().setText(item.getBluetoothDeviceBondState());
        actualHolder.getServices().setText(createSupportedDevicesString(item));
    }


    private String createSupportedDevicesString(DeviceInfoItem item) {
        final String retVal;

        if (item.getBluetoothDeviceKnownSupportedServices().isEmpty()) {
            retVal = getContext().getString(R.string.no_known_services);
        } else {
            final StringBuilder sb = new StringBuilder();

            for (final BluetoothService service : item.getBluetoothDeviceKnownSupportedServices()) {
                if (sb.length() > 0) {
                    sb.append(", ");
                }

                sb.append(service);
            }
            retVal = sb.toString();
        }

        return retVal;
    }

    @Override
    public boolean canBind(RecyclerViewItem item) {
        return item instanceof DeviceInfoItem;
    }
}
