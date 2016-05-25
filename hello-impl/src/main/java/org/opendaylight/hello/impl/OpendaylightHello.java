/*
 * check
 */
package org.opendaylight.hello.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;

import java.io.Closeable;

/**
 * Created by ww09 on 16-5-19.
 * 实现整个provider
 */
public class OpendaylightHello implements AutoCloseable {


    private BindingAwareBroker bindingAwareBroker;
    private  DataBroker dataBrokerService;

    @Override
    public void close() throws Exception {

    }


    public void setDataBrokerService(DataBroker dataBrokerService) {
        this.dataBrokerService = dataBrokerService;
    }

    public void setBindingAwareBroker(BindingAwareBroker bindingAwareBroker) {
        this.bindingAwareBroker = bindingAwareBroker;
    }

}