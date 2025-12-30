package ksyun.client.kec.describescalingnotification.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeScalingNotificationResponse
* @Description DescribeScalingNotification 返回体
*/
@Data
@ToString
public class DescribeScalingNotificationResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ScalingNotificationCount")
    private Integer ScalingNotificationCount;

    /***/
    @JsonProperty("ScalingNotificationSet")
    private List<ScalingNotificationSetDto> ScalingNotificationSet;

    @Data
    @ToString
    public static class ScalingNotificationSetDto {
        /***/
        @JsonProperty("ScalingNotificationId")
        private String ScalingNotificationId;

        /***/
        @JsonProperty("ScalingGroupId")
        private String ScalingGroupId;

        /***/
        @JsonProperty("ScalingNotificationTypes")
        private List<String> ScalingNotificationTypes;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("AvailabilityZone")
        private String AvailabilityZone;

    }

}
