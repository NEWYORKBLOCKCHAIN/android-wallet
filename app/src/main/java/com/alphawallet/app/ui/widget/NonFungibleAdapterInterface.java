package com.alphawallet.app.ui.widget;

import java.math.BigInteger;
import java.util.List;

/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public interface NonFungibleAdapterInterface
{
    List<BigInteger> getSelectedTokenIds(List<BigInteger> selection);
    int getSelectedGroups();
    void setRadioButtons(boolean selected);
}
