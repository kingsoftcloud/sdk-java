package ksyun.client.kec.describescalingnotification.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeScalingNotificationRequest
* @Description 请求参数
*/
@Data
public class DescribeScalingNotificationRequest{
    /**查询的通知所在的伸缩组ID*/
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**告警通知id*/
    @KsYunField(name="ScalingNotificationId",type=2)
    private List<String> ScalingNotificationIdList;

    /***/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**一次查询的条数，最小为5，最大为1000*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}
