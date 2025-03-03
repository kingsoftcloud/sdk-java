package ksyun.client.mongodb.describemongodbshardnode.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMongoDBShardNodeRequest
 * @Description 请求参数
 */
@Data
public class DescribeMongoDBShardNodeRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;


}