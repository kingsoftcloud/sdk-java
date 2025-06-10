package ksyun.client.kec.describescheduledtask.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeScheduledTaskRequest
* @Description 请求参数
*/
@Data
public class DescribeScheduledTaskRequest{
    /**弹性伸缩组id*/
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**弹性伸缩定时任务id列表*/
    @KsYunField(name="ScalingScheduledTaskId")
    private List<String> ScalingScheduledTaskIdList;

    /**弹性伸缩定时任务名称*/
    @KsYunField(name="ScalingScheduledTaskName")
    private String ScalingScheduledTaskName;

    /***/
    @KsYunField(name="Marker")
    private Integer Marker;

    /***/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

}