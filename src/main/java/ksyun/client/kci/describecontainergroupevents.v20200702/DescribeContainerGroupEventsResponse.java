package ksyun.client.kci.describecontainergroupevents.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeContainerGroupEventsResponse
* @Description DescribeContainerGroupEvents 返回体
*/
@Data
@ToString
public class DescribeContainerGroupEventsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**事件列表*/
    @JsonProperty("Events")
    private List<EventsDto> Events;

    @Data
    @ToString
    public static class EventsDto {
        /**首次出现时间*/
        @JsonProperty("FirstTimestamp")
        private String FirstTimestamp;

        /**最后一次出现时间*/
        @JsonProperty("LastTimestamp")
        private String LastTimestamp;

        /**发生次数*/
        @JsonProperty("Count")
        private Integer Count;

        /**事件类型*/
        @JsonProperty("Type")
        private String Type;

        /**事件发生原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**事件详细信息*/
        @JsonProperty("Message")
        private String Message;

    }

}
