package ksyun.client.mongodb.describeinstanceparams.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceParamsRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceParamsRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}