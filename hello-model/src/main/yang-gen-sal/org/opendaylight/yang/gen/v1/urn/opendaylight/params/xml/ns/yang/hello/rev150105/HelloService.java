package org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.hello.rev150105;
import org.opendaylight.yangtools.yang.binding.RpcService;
import org.opendaylight.yangtools.yang.common.RpcResult;
import java.util.concurrent.Future;


/**
 * Interface for implementing the following YANG RPCs defined in module <b>hello</b>
 * <br>(Source path: <i>META-INF/yang/hello.yang</i>):
 * <pre>
 * rpc hello-world {
 *     input {
 *         leaf name {
 *             type string;
 *         }
 *     }
 *     
 *     output {
 *         leaf greating {
 *             type string;
 *         }
 *     }
 * }
 * </pre>
 *
 */
public interface HelloService
    extends
    RpcService
{




    Future<RpcResult<HelloWorldOutput>> helloWorld(HelloWorldInput input);

}

