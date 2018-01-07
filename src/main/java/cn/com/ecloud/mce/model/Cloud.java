package cn.com.ecloud.mce.model;

/**
 * Created by kevin on 2018/1/7.
 */
public class Cloud {

    private CloudType cloudType ;

    public CloudType getCloudType() {
        return cloudType;
    }

    public void setCloudType(CloudType cloudType) {
        this.cloudType = cloudType;
    }

    public Cloud(CloudType cloudType) {
        this.cloudType = cloudType;
    }
}
