package com.afarghaly.afarghalyble.ui.details.recyclerview.binder;

import android.content.Context;

import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewBinder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;
import com.afarghaly.afarghalyble.ui.details.recyclerview.holder.TextHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.TextItem;

public class TextBinder extends BaseViewBinder<TextItem> {

    public TextBinder(Context context) {
        super(context);
    }

    @Override
    public void bind(BaseViewHolder<TextItem> holder, TextItem item) {
        final TextHolder actualHolder = (TextHolder) holder;
        actualHolder.getTextView().setText(item.getText());
    }

    @Override
    public boolean canBind(RecyclerViewItem item) {
        return item instanceof TextItem;
    }
}
