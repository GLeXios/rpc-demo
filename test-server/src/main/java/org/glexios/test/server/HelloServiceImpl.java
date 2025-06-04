package org.glexios.test.server;

import org.glexios.rpc.api.HelloObject;
import org.glexios.rpc.api.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author GLeXios
 * @Date 2025/6/3
 */
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject helloObject) {
        return "";
    }
}