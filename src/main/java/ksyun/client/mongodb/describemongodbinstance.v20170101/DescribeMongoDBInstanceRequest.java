package ksyun.client.mongodb.describemongodbinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMongoDBInstanceRequest
 * @Description 请求参数
 */
@Data
public class DescribeMongoDBInstanceRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}