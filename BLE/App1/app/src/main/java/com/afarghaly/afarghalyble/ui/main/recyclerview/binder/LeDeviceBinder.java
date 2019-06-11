package com.afarghaly.afarghalyble.ui.main.recyclerview.binder;

import android.content.Context;
import android.view.View;

import com.afarghaly.library.device.BluetoothLeDevice;
import com.afarghaly.afarghalyble.ui.common.Navigation;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewBinder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;
import com.afarghaly.afarghalyble.ui.main.recyclerview.holder.LeDeviceHolder;
import com.afarghaly.afarghalyble.ui.main.recyclerview.model.LeDeviceItem;

public class LeDeviceBinder extends BaseViewBinder<LeDeviceItem> {

    private final Navigation navigation;

    public LeDeviceBinder(Context context, Navigation navigation) {
        super(context);
        this.navigation = navigation;
    }

    @Override
    public void bind(BaseViewHolder<LeDeviceItem> holder, LeDeviceItem item) {

        final LeDeviceHolder actualHolder = (LeDeviceHolder) holder;
        final BluetoothLeDevice device = item.getDevice();

        CommonBinding.bind(getContext(), actualHolder, device);
        actualHolder.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigation.openDetailsActivity(device);
            }
        });
    }

    @Override
    public boolean canBind(RecyclerViewItem item) {
        return item instanceof LeDeviceItem;
    }
}
