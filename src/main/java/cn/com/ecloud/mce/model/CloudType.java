package cn.com.ecloud.mce.model;

import cn.com.ecloud.mce.model.exception.CloudTypeNotFoundException;

/**
 * Created by kevin on 2018/1/7.
 */
public enum CloudType {

    VMWARE("vmware"),
    OPENSTACK("openstack")
    ;

    private String value ;

    CloudType(String value) {
        this.value = value;
    }

    public CloudType getType(String name){

        for (CloudType type : CloudType.values()) {
            if (name.equals(type.value)) {
                return type ;
            }
        }

        throw new CloudTypeNotFoundException("") ;
    }
}
