package ksyun.client.kec.describescalinginstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeScalingInstanceRequest
 * @Description 请求参数
 */
@Data
public class DescribeScalingInstanceRequest {
    /**
     * 伸缩组ID
     */
    @KsYunField(name = "ScalingGroupId")
    private String ScalingGroupId;

    /**
     * 待查询的云服务器ID默认显示与伸缩组绑定的所有云服务器
     */
    @KsYunField(name = "ScalingInstanceId")
    private List<String> ScalingInstanceIdList;

    /**
     * 待查询的与伸缩组绑定的云服务器类型
     * Auto：表示伸缩组自动创建生成的实例；Manual：表示用户手动创建的实例
     */
    @KsYunField(name = "CreationType")
    private String CreationType;

    /**
     * 待查询的与伸缩组绑定的云服务器健康状态
     * Healthy：表示健康；UnHealthy：表示不健康
     */
    @KsYunField(name = "HealthStatus")
    private String HealthStatus;

    /**
     * 分页标识单次调用未返回全部伸缩组时，标记下次调用的返回值的起点，默认值是0
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 返回最大条目数范围为5-1000
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

}