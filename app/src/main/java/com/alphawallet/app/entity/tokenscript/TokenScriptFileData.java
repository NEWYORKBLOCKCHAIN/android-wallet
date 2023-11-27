package com.alphawallet.app.entity.tokenscript;

import com.alphawallet.token.entity.XMLDsigDescriptor;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
public class TokenScriptFileData
{
    public String hash;
    public XMLDsigDescriptor sigDescriptor;

    public TokenScriptFileData()
    {
        hash = null;
        sigDescriptor = null;
    }
}
