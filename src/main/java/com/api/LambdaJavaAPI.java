package com.api;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Collections;

public class LambdaJavaAPI implements RequestHandler<Object, GatewayResponse> {

    @Override
    public GatewayResponse handleRequest(Object object, Context context) {

        String message = "Hello 6";
        System.out.println(message);

        GatewayResponse response = new GatewayResponse(
                message,
                200,
                Collections.singletonMap("X-Powered-By", "TechPrimers"),
                false
        );
        return response;
    }
}
