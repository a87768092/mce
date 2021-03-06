package cn.com.ecloud.mce.openstack;

import cn.com.ecloud.mce.api.MCEService;
import cn.com.ecloud.mce.api.compute.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by kevin on 2018/1/7.
 */
public class OpenstackService implements MCEService {


    @Override
    public ComputeService compute() {

        return new OpenstackComputeService() ;
    }
}
