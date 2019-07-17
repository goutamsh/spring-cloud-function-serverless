package com.gshepur.serverless;

import com.gshepur.serverless.domain.ReverseStringRequest;
import com.gshepur.serverless.domain.ReverseStringResponse;
import com.gshepur.serverless.service.ReverseStringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component("reverseStringFunction")
public class ReverseStringFunction implements Function<ReverseStringRequest, ReverseStringResponse> {

    @Autowired
    private ReverseStringService reverseStringService;

    @Override
    public ReverseStringResponse apply(final ReverseStringRequest reverseStringRequest) {
        final ReverseStringResponse result = new ReverseStringResponse();
        result.setResult(reverseStringService.reverse(reverseStringRequest.getInput()));
        return result;
    }
}