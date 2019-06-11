package com.afarghaly.afarghalyble.ui.details;

import java.util.List;

import com.afarghaly.afarghalyble.ui.common.recyclerview.BaseRecyclerViewAdapter;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewBinderCore;
import com.afarghaly.afarghalyble.ui.common.recyclerview.RecyclerViewItem;

/*package*/ class DetailsRecyclerAdapter extends BaseRecyclerViewAdapter {
    public DetailsRecyclerAdapter(RecyclerViewBinderCore core, List<RecyclerViewItem> items) {
        super(core, items);
    }

//    private static List<RecyclerViewItem> validate(RecyclerViewBinderCore core, List<RecyclerViewItem> items) {
//        final List<RecyclerViewItem> retVal = new ArrayList<>();
//
//        for (final RecyclerViewItem item : items) {
//            if (core.getViewType(item) != RecyclerViewBinderCore.INVALID_VIEWTYPE) {
//                retVal.add(item);
//            }
//        }
//
//        return retVal;
//    }
}
