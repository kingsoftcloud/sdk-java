package ksyun.client.ked.clouddeskreinstall.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CloudDeskreinstallRequest
 * @Description 请求参数
 */
@Data
public class CloudDeskreinstallRequest {
    /**
     * 云电脑 id
     */
    @KsYunField(name = "instanceId")
    private String InstanceId;

    /**
     * 镜像 id
     */
    @KsYunField(name = "imageId")
    private String ImageId;

}