package cn.com.ecloud.mce;

import cn.com.ecloud.mce.api.MCEService;
import cn.com.ecloud.mce.model.Cloud;

/**
 * Created by kevin on 2018/1/7.
 */
public class CloudFactory {

   public static  MCEService createCloud(Cloud cloud)  {

       return  CloudProvider.get(cloud.getCloudType());
   }
}
