package com.alphawallet.app.ui.widget.entity;

import com.alphawallet.app.ui.widget.holder.AssetInstanceScriptHolder;

import com.alphawallet.token.entity.TicketRange;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class AssetInstanceSortedItem extends SortedItem<TicketRange>
{
    public static final int VIEW_TYPE = AssetInstanceScriptHolder.VIEW_TYPE;

    public AssetInstanceSortedItem(TicketRange data, int weight) {
        super(VIEW_TYPE, data, weight);
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
        return other.viewType == AssetInstanceScriptHolder.VIEW_TYPE && this.viewType == AssetInstanceScriptHolder.VIEW_TYPE
                && ( value.equals(other.value));
    }

    @Override
    public boolean isRadioExposed()
    {
        return value.exposeRadio;
    }

    @Override
    public boolean isItemChecked()
    {
        return value.isChecked;
    }

    @Override
    public void setIsChecked(boolean b) { value.isChecked = b; };

    @Override
    public void setExposeRadio(boolean expose) { value.exposeRadio = expose; };

    @Override
    public List<BigInteger> getTokenIds()
    {
        return value.tokenIds;
    }
}