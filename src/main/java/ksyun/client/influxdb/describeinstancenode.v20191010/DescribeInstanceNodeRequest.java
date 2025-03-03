package ksyun.client.influxdb.describeinstancenode.v20191010;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceNodeRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceNodeRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

}