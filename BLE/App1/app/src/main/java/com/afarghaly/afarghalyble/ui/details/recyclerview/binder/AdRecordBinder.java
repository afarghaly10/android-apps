package com.afarghaly.afarghalyble.ui.details.recyclerview.binder;

import android.content.Context;

import com.afarghaly.library.util.ByteUtils;
import com.afarghaly.afarghalyble.R;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewBinder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseViewHolder;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;
import com.afarghaly.afarghalyble.ui.details.recyclerview.holder.AdRecordHolder;
import com.afarghaly.afarghalyble.ui.details.recyclerview.model.AdRecordItem;

public class AdRecordBinder extends BaseViewBinder<AdRecordItem> {

    public AdRecordBinder(Context context) {
        super(context);
    }

    @Override
    public void bind(BaseViewHolder<AdRecordItem> holder, AdRecordItem item) {
        final AdRecordHolder actualHolder = (AdRecordHolder) holder;

        actualHolder.getTitleTextView().setText(item.getTitle());

        actualHolder.getStringTextView().setText(
                getContext().getString(R.string.formatter_single_quoted_string,
                        item.getDataAsString()));

        actualHolder.getArrayTextView().setText(
                getContext().getString(R.string.formatter_single_quoted_string,
                        ByteUtils.byteArrayToHexString(item.getData())));
    }

    @Override
    public boolean canBind(RecyclerViewItem item) {
        return item instanceof AdRecordItem;
    }
}
