package org.opendaylight.controller.config.yang.config.hello.impl;

import org.opendaylight.controller.md.sal.binding.api.DataBroker;
import org.opendaylight.controller.sal.binding.api.BindingAwareBroker;
import org.opendaylight.hello.impl.HelloServiceImpl;
import org.opendaylight.hello.impl.OpendaylightHello;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.hello.rev150105.*;

public class HelloImplModule extends org.opendaylight.controller.config.yang.config.hello.impl.AbstractHelloImplModule {
    public HelloImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver) {
        super(identifier, dependencyResolver);
    }

    public HelloImplModule(org.opendaylight.controller.config.api.ModuleIdentifier identifier, org.opendaylight.controller.config.api.DependencyResolver dependencyResolver, org.opendaylight.controller.config.yang.config.hello.impl.HelloImplModule oldModule, java.lang.AutoCloseable oldInstance) {
        super(identifier, dependencyResolver, oldModule, oldInstance);
    }

    @Override
    public void customValidation() {
        // add custom validation form module attributes here.
    }

    @Override
    public java.lang.AutoCloseable createInstance() {
        // HelloServiceImpl 处理rest过来的数据
        final HelloServiceImpl hello_rpc = new HelloServiceImpl();
        final BindingAwareBroker.RpcRegistration<HelloService> helloServiceRpcRegistration =
                getRpcRegistryDependency().addRpcImplementation(HelloService.class, hello_rpc);


        OpendaylightHello hello = new OpendaylightHello();
        DataBroker dataBrokerService = getDataBrokerDependency();
        hello.setDataBrokerService(dataBrokerService);
        BindingAwareBroker bindingAwareBroker = getBindingRegistryDependency();
        hello.setBindingAwareBroker(bindingAwareBroker);
/*
        SfcProviderHelloDataListener sfcProviderSffEntryDataListener = new SfcProviderHelloDataListener();
        final ListenerRegistration<DataChangeListener> sffDataChangeListenerRegistration =
                dataBrokerService.registerDataChangeListener( LogicalDatastoreType.CONFIGURATION,
                        OpendaylightHello.HellO_ENTRY_IID, sfcProviderSffEntryDataListener,  DataBroker.DataChangeScope.SUBTREE );*/


        final class AutoCloseableHello implements AutoCloseable {
            @Override
            public void close() throws Exception {
                helloServiceRpcRegistration.close();
            }
        }
        AutoCloseableHello close = new AutoCloseableHello();
        return close;
    }

}
