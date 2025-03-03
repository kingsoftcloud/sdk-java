package ksyun.client.mongodb.updatemongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateMongoDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class UpdateMongoDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例配置套餐。 可选:  1C2G        2C4G        4C8G  8C16G    8C32G  16C32G    16C64G    16C128G    32C64G。
     */
    @KsYunField(name = "InstanceClass")
    private String InstanceClass;

    /**
     * 硬盘大小,单位GB。
     */
    @KsYunField(name = "Storage")
    private Integer Storage;

}