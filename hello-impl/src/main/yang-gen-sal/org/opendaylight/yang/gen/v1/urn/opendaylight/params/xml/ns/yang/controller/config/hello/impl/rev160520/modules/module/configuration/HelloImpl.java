package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl.RpcRegistry;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.rev130405.modules.module.Configuration;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl.BindingRegistry;
import org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.hello.impl.DataBroker;
import org.opendaylight.yangtools.yang.binding.Augmentable;


/**
 * <p>This class represents the following YANG schema fragment defined in module <b>hello-impl</b>
 * <br>(Source path: <i>META-INF/yang/hello-impl.yang</i>):
 * <pre>
 * case hello-impl {
 *     container data-broker {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl?revision=2016-05-20)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container binding-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl?revision=2016-05-20)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 *     container rpc-registry {
 *         leaf type {
 *             type leafref;
 *         }
 *         leaf name {
 *             type leafref;
 *         }
 *         uses service-ref {
 *             refine (urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl?revision=2016-05-20)type {
 *                 leaf type {
 *                     type leafref;
 *                 }
 *             }
 *         }
 *     }
 * }
 * </pre>
 * The schema path to identify an instance is
 * <i>hello-impl/modules/module/configuration/(urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl?revision=2016-05-20)hello-impl</i>
 *
 */
public interface HelloImpl
    extends
    DataObject,
    Augmentable<org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.controller.config.hello.impl.rev160520.modules.module.configuration.HelloImpl>,
    Configuration
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:opendaylight:params:xml:ns:yang:controller:config:hello:impl",
        "2016-05-20", "hello-impl").intern();

    /**
     * wires in the data broker registry service
     *
     */
    DataBroker getDataBroker();
    
    /**
     * wires in the binding broker osgi service
     *
     */
    BindingRegistry getBindingRegistry();
    
    /**
     * wires in the RPC registry service
     *
     */
    RpcRegistry getRpcRegistry();

}

