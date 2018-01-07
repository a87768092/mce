package cn.com.ecloud.mce;

import cn.com.ecloud.mce.api.MCEService;
import cn.com.ecloud.mce.model.CloudType;
import cn.com.ecloud.mce.openstack.OpenstackService;
import cn.com.ecloud.mce.vmware.VmWareService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by kevin on 2018/1/7.
 */
public class CloudProvider {



    private static final Map<CloudType,MCEService> instances = new HashMap<>() ;

    private static final Map<CloudType,MCEService> SERVICES = initializeProvider();



    private static Map<CloudType,MCEService> initializeProvider() {

       bind(CloudType.VMWARE, new VmWareService());
       bind(CloudType.OPENSTACK,new OpenstackService());
       return instances ;
    }

    public static MCEService get(CloudType type) {

        return SERVICES.get(type);
    }

    private static void bind(CloudType type ,MCEService impl) {
        instances.put(type,impl) ;
    }
}
