package ksyun.client.kcrs.describewebhooktrigger.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeWebhookTriggerResponse
* @Description DescribeWebhookTrigger 返回体
*/
@Data
@ToString
public class DescribeWebhookTriggerResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /***/
    @JsonProperty("TriggerSet")
    private List<TriggerSetDto> TriggerSet;

    @Data
    @ToString
    public static class TriggerSetDto {
        /***/
        @JsonProperty("TriggerId")
        private Integer TriggerId;

        /***/
        @JsonProperty("TriggerName")
        private String TriggerName;

        /***/
        @JsonProperty("EventType")
        private List<String> EventType;

        /***/
        @JsonProperty("TriggerUrl")
        private String TriggerUrl;

        /***/
        @JsonProperty("Enabled")
        private Boolean Enabled;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

}
