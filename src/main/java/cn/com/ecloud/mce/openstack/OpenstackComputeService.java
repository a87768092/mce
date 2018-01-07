package cn.com.ecloud.mce.openstack;

import cn.com.ecloud.mce.api.compute.ComputeService;

/**
 * Created by kevin on 2018/1/7.
 */
public class OpenstackComputeService implements ComputeService {


    @Override
    public void createInstance() {
        System.out.println("Openstack");
    }
}
