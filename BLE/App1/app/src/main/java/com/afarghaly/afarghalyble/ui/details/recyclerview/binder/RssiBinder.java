package com.afarghaly.afarghalyble.ui.details.recyclerview.binder;

import android.content.Context;

import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewBinder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;
import com.afarghaly.afarghalyble.ui.details.recyclerview.holder.RssiInfoHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.RssiItem;
import com.afarghaly.afarghalyble.util.TimeFormatter;

public class RssiBinder extends BaseViewBinder<RssiItem> {

    public RssiBinder(Context context) {
        super(context);
    }

    private static String formatTime(final long time) {
        return TimeFormatter.getIsoDateTime(time);
    }

    @Override
    public void bind(BaseViewHolder<RssiItem> holder, RssiItem item) {
        final RssiInfoHolder actualHolder = (RssiInfoHolder) holder;

        actualHolder.getFirstTimestamp().setText(formatTime(item.getFirstTimestamp()));
        actualHolder.getFirstRssi().setText(formatRssi(item.getFirstRssi()));
        actualHolder.getLastTimestamp().setText(formatTime(item.getTimestamp()));
        actualHolder.getLastRssi().setText(formatRssi(item.getRssi()));
        actualHolder.getRunningAverageRssi().setText(formatRssi(item.getRunningAverageRssi()));
    }

    @Override
    public boolean canBind(RecyclerViewItem item) {
        return item instanceof RssiItem;
    }

    private String formatRssi(final double rssi) {
        return getContext().getString(R.string.formatter_db, String.valueOf(rssi));
    }

    private String formatRssi(final int rssi) {
        return getContext().getString(R.string.formatter_db, String.valueOf(rssi));
    }
}
