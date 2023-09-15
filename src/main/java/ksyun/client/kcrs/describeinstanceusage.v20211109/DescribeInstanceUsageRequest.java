package ksyun.client.kcrs.describeinstanceusage.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceUsageRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceUsageRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;


}