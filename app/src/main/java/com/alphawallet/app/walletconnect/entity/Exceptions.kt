package com.alphawallet.app.walletconnect.entity
/**
 * Created by MikodesTeam
 * 07/06/2022.
 */
class InvalidHmacException : Exception("Invalid HMAC")
class InvalidJsonRpcParamsException(val requestId: Long) : Exception("Invalid JSON RPC Request")
class InvalidSessionException : Exception("Invalid session")
class InvalidPayloadException : Exception("Invalid WCEncryptionPayload")