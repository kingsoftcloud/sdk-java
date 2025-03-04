package ksyun.client.kec.createscheduledtask.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateScheduledTaskRequest
 * @Description 请求参数
 */
@Data
public class CreateScheduledTaskRequest {
    /**
     * 弹性伸缩组id
     */
    @KsYunField(name = "ScalingGroupId")
    private String ScalingGroupId;

    /**
     * 弹性伸缩定时任务名称
     */
    @KsYunField(name = "ScalingScheduledTaskName")
    private String ScalingScheduledTaskName;

    /**
     * 定时任务触发时，重设伸缩组中最小伸缩数的值
     */
    @KsYunField(name = "ReadjustMinSize")
    private Integer ReadjustMinSize;

    /**
     * 定时任务触发时，重设伸缩组中最大伸缩数的值
     */
    @KsYunField(name = "ReadjustMaxSize")
    private Integer ReadjustMaxSize;

    /**
     * 定时任务触发时，重设伸缩组中期望实例数
     */
    @KsYunField(name = "ReadjustExpectSize")
    private Integer ReadjustExpectSize;

    /**
     * 定时任务的开始时间
     */
    @KsYunField(name = "StartTime")
    private String StartTime;

    /**
     * 定时任务重复执行时的结束时间，若定时任务需要重复执行，则必填此参数
     */
    @KsYunField(name = "EndTime")
    private String EndTime;

    /**
     * 定时任务的重复方式，为标准的crontab格式 `* * * * *` ，其中分钟与小时的星号不能指定(第一位与第二位)。若定时任务需要重复执行，则必填此参数
     */
    @KsYunField(name = "Recurrence")
    private String Recurrence;

    /**
     * 重复执行的单位，日、月、周Day表示日，Month表示月，Week表示周
     */
    @KsYunField(name = "RepeatUnit")
    private String RepeatUnit;

    /**
     * 重复执行的周期，逗号隔开的字符串，如果多个参数'.例如：按天 ["2"] 表示每2天，按月 ["2"，"5"] 表示每月2到5日，按周 ["1","2","3"] 表示周一、二、三
     */
    @KsYunField(name = "RepeatCycle")
    private String RepeatCycle;

}