package cn.com.ecloud.mce.vmware;

import cn.com.ecloud.mce.api.compute.ComputeService;

/**
 * Created by kevin on 2018/1/7.
 */
public class VmWareComputeService implements ComputeService {


    @Override
    public void createInstance() {
        System.out.println("vmware");
    }
}
