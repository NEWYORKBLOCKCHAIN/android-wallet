package com.alphawallet.app.web3;
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
class JsInjectorResponse {
    final String data;
    final String url;
    final String mime;
    final String charset;
    final boolean isRedirect;

    JsInjectorResponse(String data, int code, String url, String mime, String charset, boolean isRedirect) {
        this.data = data;
        this.url = url;
        this.mime = mime;
        this.charset = charset;
        this.isRedirect = isRedirect;
    }
}
