package ksyun.client.influxdb.describeinstances.v20191010;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstancesRequest {
    /***/
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /***/
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /***/
    @KsYunField(name = "Vip")
    private String Vip;

    /***/
    @KsYunField(name = "VpcId")
    private String VpcId;

    /***/
    @KsYunField(name = "FuzzySearch")
    private String FuzzySearch;

}