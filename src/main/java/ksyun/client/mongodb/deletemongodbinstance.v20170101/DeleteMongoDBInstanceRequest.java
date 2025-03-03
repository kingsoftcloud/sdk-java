package ksyun.client.mongodb.deletemongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteMongoDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeleteMongoDBInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;


}