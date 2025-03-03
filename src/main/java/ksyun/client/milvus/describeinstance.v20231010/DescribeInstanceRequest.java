package ksyun.client.milvus.describeinstance.v20231010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}