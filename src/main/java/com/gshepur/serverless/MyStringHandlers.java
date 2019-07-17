package com.gshepur.serverless;

import com.gshepur.serverless.domain.ReverseStringRequest;
import com.gshepur.serverless.domain.ReverseStringResponse;
import org.springframework.cloud.function.adapter.aws.SpringBootRequestHandler;

public class MyStringHandlers extends SpringBootRequestHandler<ReverseStringRequest, ReverseStringResponse> {
 
}