package com.alphawallet.app.ui.widget.entity;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface ItemClickListener
{
    void onItemClick(String url);
    default void onItemLongClick(String url) { }  //only override this if extra handling is needed
}
