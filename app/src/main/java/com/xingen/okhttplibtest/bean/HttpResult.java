package com.xingen.okhttplibtest.bean;

import com.xingen.okhttplib.internal.json.utils.GsonUtils;

/**
 * Created by ${xinGen} on 2018/1/20.
 */

public class HttpResult<T> {
    public int code;
    public T data;
    @Override
    public String toString() {
        return GsonUtils.toJson(this);
    }
}
