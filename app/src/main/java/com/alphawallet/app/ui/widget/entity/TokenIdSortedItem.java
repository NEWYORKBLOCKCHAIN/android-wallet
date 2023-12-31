package com.alphawallet.app.ui.widget.entity;

import com.alphawallet.app.ui.widget.holder.TicketHolder;

import com.alphawallet.token.entity.TicketRange;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */

public class TokenIdSortedItem extends SortedItem<TicketRange>
{
    public static final int VIEW_TYPE = TicketHolder.VIEW_TYPE;

    public TokenIdSortedItem(TicketRange range, int weight) {
        super(VIEW_TYPE, range, weight);
    }

    @Override
    public int compare(SortedItem other)
    {
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
        return other.viewType == TicketHolder.VIEW_TYPE
                && ( ((TokenIdSortedItem) other).value.tokenIds.size() == value.tokenIds.size()
                && ((TokenIdSortedItem) other).value.tokenIds.get(0) == value.tokenIds.get(0));
    }
}
