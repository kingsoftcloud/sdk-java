package ksyun.client.kec.describescalingactivity.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DescribeScalingActivityRequest
 * @Description 请求参数
 */
@Data
public class DescribeScalingActivityRequest {
    /**
     * 待查询的伸缩组ID
     */
    @KsYunField(name = "ScalingGroupId")
    private String ScalingGroupId;

    /**
     * 伸缩活动ID可指定查询某些伸缩活动记录
     */
    @KsYunField(name = "ScalingActivityId")
    private List<String> ScalingActivityIdList;

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

    /**
     * 指定开始时间
     * 举例：2018-03-15 00:00:00
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 指定结束时间
     * 举例：2018-03-15 00:00:00
     */
    @KsYunField(name = "EndTime")
    private String EndTime;


}