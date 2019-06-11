package com.afarghaly.afarghalyble.ui.details.recyclerview.holder;

import android.view.View;
import android.widget.TextView;

import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.TextItem;

public class TextHolder extends BaseViewHolder<TextItem> {

    private final TextView mText;

    public TextHolder(View itemView) {
        super(itemView);

        mText = (TextView) itemView.findViewById(R.id.text);
    }

    public TextView getTextView() {
        return mText;
    }
}
