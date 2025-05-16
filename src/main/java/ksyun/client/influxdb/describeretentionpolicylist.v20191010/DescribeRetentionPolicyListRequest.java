package ksyun.client.influxdb.describeretentionpolicylist.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeRetentionPolicyListRequest
 * @Description 请求参数
 */
@Data
public class DescribeRetentionPolicyListRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "DatabaseName")
    private String DatabaseName;

}