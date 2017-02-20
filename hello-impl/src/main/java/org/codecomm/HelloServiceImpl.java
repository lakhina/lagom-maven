package org.codecomm;

import akka.NotUsed;
import com.lightbend.lagom.javadsl.api.ServiceCall;

import java.util.concurrent.CompletableFuture;


public class HelloServiceImpl implements HelloService {

    @Override
    public ServiceCall<NotUsed, Greet> hello(String id) {
        return request ->
        {
            Greet greet = new Greet("Hindi", "Namaste "+id);
            return CompletableFuture.completedFuture(greet);
        };
    }

}
