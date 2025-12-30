package ksyun.client.kec.createscalingnotification.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateScalingNotificationRequest
* @Description 请求参数
*/
@Data
public class CreateScalingNotificationRequest{
    /**通知类型，即为需要订阅的通知类型集合，范围从1到6,  具体映射关系如下：<br/>1：扩容成功<br/>2：扩容失败<br/>3：缩容成功<br/>4：缩容失败<br/>5：替换不健康子机成功<br/>6：替换不健康子机失败 */
    @KsYunField(name="ScalingNotificationType",type=1)
    private List<String> ScalingNotificationTypeList;

    /**弹性伸缩组id*/
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**描述*/
    @KsYunField(name="Description")
    private String Description;

}
