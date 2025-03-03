package ksyun.client.kcrs.describeinstancetoken.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeInstanceTokenRequest
 * @Description 请求参数
 */
@Data
public class DescribeInstanceTokenRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /**
     * 单次调用所返回的最大实例数目，默认20， 最大99
     */
    @KsYunField(name = "MaxResults")
    private String MaxResults;

}