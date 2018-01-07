package cn.com.ecloud;

import cn.com.ecloud.mce.CloudFactory;
import cn.com.ecloud.mce.model.CloudType;
import cn.com.ecloud.mce.model.VmWareCloud;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CloudFactory.createCloud(new VmWareCloud(CloudType.VMWARE)).compute().createInstance();
    }
}
