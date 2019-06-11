package com.afarghaly.afarghalyble.ui.details.recyclerview.model;

import com.afarghaly.library.device.adrecord.AdRecord;
import com.afarghaly.library.util.AdRecordUtils;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

public class AdRecordItem implements RecyclerViewItem {

    private final String mTitle;
    private final byte[] mData;
    private final String mDataAsString;

    public AdRecordItem(final String title,
                        final AdRecord record) {
        mTitle = title;
        mData = record.getData();
        mDataAsString = AdRecordUtils.getRecordDataAsString(record);
    }

    public String getTitle() {
        return mTitle;
    }

    public byte[] getData() {
        return mData;
    }

    public String getDataAsString() {
        return mDataAsString;
    }
}
