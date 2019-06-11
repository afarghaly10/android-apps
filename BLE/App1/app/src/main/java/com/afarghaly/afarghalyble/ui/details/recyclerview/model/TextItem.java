package com.afarghaly.afarghalyble.ui.details.recyclerview.model;

import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

public class TextItem implements RecyclerViewItem {
    private final CharSequence mText;

    public TextItem(CharSequence text) {
        mText = text;
    }

    public CharSequence getText() {
        return mText;
    }
}
