package com.tencent.dingdang.tvs.message.request.alerts;

import com.tencent.dingdang.tvs.message.Payload;

import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public final class AlertPayload extends Payload {

    private final String token;

    public AlertPayload(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
