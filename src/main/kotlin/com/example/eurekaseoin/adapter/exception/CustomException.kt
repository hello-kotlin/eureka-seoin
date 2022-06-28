package com.example.eurekaseoin.adapter.exception

class CustomException(apiCode: ApiCode) : RuntimeException() {
    var code: Int
    override val message: String?

    init {
        this.code = apiCode.code
        this.message = apiCode.message
    }
}
