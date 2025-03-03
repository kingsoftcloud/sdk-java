package ksyun.client.mongodb.restartmongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestartMongoDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class RestartMongoDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}