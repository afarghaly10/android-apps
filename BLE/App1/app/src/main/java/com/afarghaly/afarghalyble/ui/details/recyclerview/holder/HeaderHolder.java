package com.afarghaly.afarghalyble.ui.details.recyclerview.holder;

import android.view.View;
import android.widget.TextView;

import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.HeaderItem;

public class HeaderHolder extends BaseViewHolder<HeaderItem> {

    private final TextView mText;

    public HeaderHolder(View itemView) {
        super(itemView);

        mText = (TextView) itemView.findViewById(R.id.text);
    }

    public TextView getTextView() {
        return mText;
    }
}
