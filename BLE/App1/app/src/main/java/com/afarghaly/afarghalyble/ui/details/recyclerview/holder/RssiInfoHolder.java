package com.afarghaly.afarghalyble.ui.details.recyclerview.holder;

import android.view.View;
import android.widget.TextView;

import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.RssiItem;

public class RssiInfoHolder extends BaseViewHolder<RssiItem> {

    private final TextView mTvFirstTimestamp;
    private final TextView mTvFirstRssi;
    private final TextView mTvLastTimestamp;
    private final TextView mTvLastRssi;
    private final TextView mTvRunningAverageRssi;

    public RssiInfoHolder(View itemView) {
        super(itemView);

        mTvFirstTimestamp = (TextView) itemView.findViewById(R.id.firstTimestamp);
        mTvFirstRssi = (TextView) itemView.findViewById(R.id.firstRssi);
        mTvLastTimestamp = (TextView) itemView.findViewById(R.id.lastTimestamp);
        mTvLastRssi = (TextView) itemView.findViewById(R.id.lastRssi);
        mTvRunningAverageRssi = (TextView) itemView.findViewById(R.id.runningAverageRssi);
    }

    public TextView getFirstTimestamp() {
        return mTvFirstTimestamp;
    }

    public TextView getFirstRssi() {
        return mTvFirstRssi;
    }

    public TextView getLastTimestamp() {
        return mTvLastTimestamp;
    }

    public TextView getLastRssi() {
        return mTvLastRssi;
    }

    public TextView getRunningAverageRssi() {
        return mTvRunningAverageRssi;
    }
}
