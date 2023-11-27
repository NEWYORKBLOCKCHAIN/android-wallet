package com.alphawallet.app.walletconnect.util

import com.alphawallet.token.tools.Numeric
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
fun ByteArray.toHexString(): String {
    return Numeric.toHexString(this, 0, this.size, false)
}

fun String.toByteArray(): ByteArray {
    return Numeric.hexStringToByteArray(this)
}