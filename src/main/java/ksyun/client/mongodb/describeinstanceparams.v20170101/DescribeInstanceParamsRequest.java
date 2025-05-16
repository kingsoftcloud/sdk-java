package ksyun.client.mongodb.describeinstanceparams.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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