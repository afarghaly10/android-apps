package com.afarghaly.afarghalyble.ui.details.recyclerview.binder;

import android.content.Context;

import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewBinder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;
import com.afarghaly.afarghalyble.ui.details.recyclerview.holder.HeaderHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.HeaderItem;

public class HeaderBinder extends BaseViewBinder<HeaderItem> {

    public HeaderBinder(Context context) {
        super(context);
    }

    @Override
    public void bind(BaseViewHolder<HeaderItem> holder, HeaderItem item) {
        final HeaderHolder actualHolder = (HeaderHolder) holder;
        actualHolder.getTextView().setText(item.getText());
    }

    @Override
    public boolean canBind(RecyclerViewItem item) {
        return item instanceof HeaderItem;
    }
}
