package com.example.action.tracer;

import brave.Span;
import brave.Tracer;
import org.springframework.beans.factory.annotation.Autowired;

public class TracerConfig {

    @Autowired
    Tracer tracer;


}
