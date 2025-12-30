package ksyun.client.kec.describescheduledtask.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScheduledTaskResponse
* @Description DescribeScheduledTask 返回体
*/
@Data
@ToString
public class DescribeScheduledTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ScheduledTaskSize")
    private Integer ScheduledTaskSize;

    /***/
    @JsonProperty("ScalingScheduleTaskSet")
    private List<ScalingScheduleTaskSetDto> ScalingScheduleTaskSet;

    @Data
    @ToString
    public static class ScalingScheduleTaskSetDto {
        /***/
        @JsonProperty("ScalingGroupId")
        private String ScalingGroupId;

        /***/
        @JsonProperty("ScalingScheduledTaskId")
        private String ScalingScheduledTaskId;

        /***/
        @JsonProperty("ScalingScheduledTaskName")
        private String ScalingScheduledTaskName;

        /***/
        @JsonProperty("ReadjustMaxSize")
        private Integer ReadjustMaxSize;

        /***/
        @JsonProperty("ReadjustMinSize")
        private Integer ReadjustMinSize;

        /***/
        @JsonProperty("ReadjustExpectSize")
        private Integer ReadjustExpectSize;

        /***/
        @JsonProperty("StartTime")
        private String StartTime;

        /***/
        @JsonProperty("Recurrence")
        private String Recurrence;

        /***/
        @JsonProperty("RepeatUnit")
        private String RepeatUnit;

        /***/
        @JsonProperty("RepeatCycle")
        private String RepeatCycle;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("EndTime")
        private String EndTime;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @JsonProperty("Description")
        private String Description;

    }

}
