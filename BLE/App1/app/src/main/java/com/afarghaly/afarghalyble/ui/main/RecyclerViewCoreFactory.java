package com.afarghaly.afarghalyble.ui.main;

import android.content.Context;

import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.Navigation;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewBinderCore;
import com.afarghaly.afarghalyble.ui.main.recyclerview.binder.IBeaconBinder;
import com.afarghaly.afarghalyble.ui.main.recyclerview.binder.LeDeviceBinder;
import com.afarghaly.afarghalyble.ui.main.recyclerview.holder.IBeaconHolder;
import com.afarghaly.afarghalyble.ui.main.recyclerview.holder.LeDeviceHolder;

/*protected*/ final class RecyclerViewCoreFactory {

    public static RecyclerViewBinderCore create(final Context context, final Navigation navigation) {
        final RecyclerViewBinderCore core = new RecyclerViewBinderCore();

        core.add(new IBeaconBinder(context, navigation), IBeaconHolder.class, R.layout.list_item_device_ibeacon);
        core.add(new LeDeviceBinder(context, navigation), LeDeviceHolder.class, R.layout.list_item_device_le);

        return core;
    }

}
