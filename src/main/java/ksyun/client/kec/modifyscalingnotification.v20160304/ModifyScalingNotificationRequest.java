package ksyun.client.kec.modifyscalingnotification.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyScalingNotificationRequest
* @Description 请求参数
*/
@Data
public class ModifyScalingNotificationRequest{
    /**要修改的通知所在的伸缩组ID*/
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**要修改的通知ID，目前仅支持主账号*/
    @KsYunField(name="ScalingNotificationId")
    private Integer ScalingNotificationId;

    /**通知类型数组，即为需要订阅的伸缩活动通知集合，范围从1到6。具体映射关系如下：<br/>1：扩容成功<br/>2：扩容失败<br/>3：缩容成功<br/>4：缩容失败<br/>5：替换不健康子机成功<br/>6：替换不健康子机失败*/
    @KsYunField(name="NotificationType")
    private List<String> NotificationTypeList;

}