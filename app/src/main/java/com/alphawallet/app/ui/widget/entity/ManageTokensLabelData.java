package com.alphawallet.app.ui.widget.entity;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class ManageTokensLabelData {
    public String title;
    public boolean showIgnore = false;

    public ManageTokensLabelData(String title) {
        this.title = title;
    }

    public ManageTokensLabelData(String title, boolean showIgnore) {
        this.title = title;
        this.showIgnore = showIgnore;
    }
}