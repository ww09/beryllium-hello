/*
 * check
 */
package org.opendaylight.hello.impl;

import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.hello.rev150105.HelloService;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.hello.rev150105.HelloWorldInput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.hello.rev150105.HelloWorldOutput;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.hello.rev150105.HelloWorldOutputBuilder;
import org.opendaylight.yangtools.yang.common.RpcResult;
import org.opendaylight.yangtools.yang.common.RpcResultBuilder;

import java.util.concurrent.Future;

/**
 * Created by ww09 on 16-5-19.
 * 实现rpc
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public Future<RpcResult<HelloWorldOutput>> helloWorld(HelloWorldInput input) {
        String name = input.getName();
        HelloWorldOutputBuilder outputBuilder = new HelloWorldOutputBuilder();
        outputBuilder.setGreating("hello opendaylight "+name);
        return RpcResultBuilder.success(outputBuilder.build()).buildFuture();
    }
}
