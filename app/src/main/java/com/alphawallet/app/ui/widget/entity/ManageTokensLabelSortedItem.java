package com.alphawallet.app.ui.widget.entity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class ManageTokensLabelSortedItem extends SortedItem<ManageTokensLabelData> {

    public ManageTokensLabelSortedItem(int type, ManageTokensLabelData data, int weight) {
        super(type, data, weight);
    }

    @Override
    public int compare(SortedItem other) {
        return weight - other.weight;
    }

    @Override
    public boolean areContentsTheSame(SortedItem newItem)
    {
        return false;
    }

    @Override
    public boolean areItemsTheSame(SortedItem other)
    {
        return other.viewType == viewType;
    }
}