package com.example.eurekaseoin.adapter.exception

class ExceptionResponse(
    private var code: Int,
    private var message: String
) {
    constructor(apiCode: ApiCode) : this(apiCode.code, apiCode.message) {
        this.code = apiCode.code
        this.message = apiCode.message
    }
}
