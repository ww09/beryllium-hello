package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.Module;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.ServiceRef;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * wires in the RPC registry service
 *
 * <p>This class represents the following YANG schema fragment defined in module <b>hello-impl</b>
 * <br>(Source path: <i>META-INF/yang/hello-impl.yang</i>):
 * <pre>
 * container rpc-registry {
 *     leaf type {
 *         type leafref;
 *     }
 *     leaf name {
 *         type leafref;
 *     }
 *     uses service-ref {
 *         refine (urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl?revision=2016-05-20)type {
 *             leaf type {
 *                 type leafref;
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>hello-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl?revision=2016-05-20)hello-impl/rpc-registry</i>
 *
 * <p>To create instances of this class use {@link org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl.RpcRegistryBuilder}.
 * @see org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl.RpcRegistryBuilder
 *
 */
public interface RpcRegistry
    extends
    ChildOf<Module>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl.RpcRegistry>,
    ServiceRef
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl",
        "2016-05-20", "rpc-registry").intern();


}

