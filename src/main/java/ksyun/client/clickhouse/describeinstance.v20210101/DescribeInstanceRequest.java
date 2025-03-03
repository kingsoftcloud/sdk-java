package ksyun.client.clickhouse.describeinstance.v20210101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;


}