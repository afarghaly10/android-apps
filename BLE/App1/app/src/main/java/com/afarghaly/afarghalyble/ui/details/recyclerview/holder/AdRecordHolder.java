package com.afarghaly.afarghalyble.ui.details.recyclerview.holder;

import android.view.View;
import android.widget.TextView;

import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.AdRecordItem;

public class AdRecordHolder extends BaseViewHolder<AdRecordItem> {

    private final TextView mStringTextView;
    private final TextView mArrayTextView;
    private final TextView mTitleTextView;

    public AdRecordHolder(View itemView) {
        super(itemView);

        mStringTextView = (TextView) itemView.findViewById(R.id.data_as_string);
        mArrayTextView = (TextView) itemView.findViewById(R.id.data_as_array);
        mTitleTextView = (TextView) itemView.findViewById(R.id.title);
    }

    public TextView getStringTextView() {
        return mStringTextView;
    }

    public TextView getArrayTextView() {
        return mArrayTextView;
    }

    public TextView getTitleTextView() {
        return mTitleTextView;
    }
}
