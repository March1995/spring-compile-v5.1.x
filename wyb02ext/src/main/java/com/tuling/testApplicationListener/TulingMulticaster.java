package com.tuling.testApplicationListener;

import org.springframework.context.event.SimpleApplicationEventMulticaster;
import org.springframework.stereotype.Component;

import java.util.concurrent.Executors;

@Component(value = "applicationEventMulticaster")
public class TulingMulticaster extends SimpleApplicationEventMulticaster {

    public TulingMulticaster() {
        setTaskExecutor(Executors.newSingleThreadExecutor());
    }

}
