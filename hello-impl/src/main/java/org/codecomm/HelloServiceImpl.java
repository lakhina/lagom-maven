package org.codecomm;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.concurrent.CompletableFuture;


public class HelloServiceImpl implements HelloService {

    @Override
    public ServiceCall<NotUsed, String> hello(String id) {
        return request -> CompletableFuture.completedFuture("Hello " + id);
    }

}
