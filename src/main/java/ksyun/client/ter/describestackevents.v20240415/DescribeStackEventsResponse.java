package ksyun.client.ter.describestackevents.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeStackEventsResponse
* @Description DescribeStackEvents 返回体
*/
@Data
@ToString
public class DescribeStackEventsResponse extends BaseResponseModel {
    /**接口请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**事件列表*/
    @JsonProperty("Events")
    private List<EventsDto> Events;

    @Data
    @ToString
    public static class EventsDto {
        /**事件类型*/
        @JsonProperty("EventType")
        private String EventType;

        /**关联资源ID*/
        @JsonProperty("ResourceId")
        private String ResourceId;

        /**资源逻辑名称*/
        @JsonProperty("ResourceLogicName")
        private String ResourceLogicName;

        /**资源类型*/
        @JsonProperty("ResourceType")
        private String ResourceType;

        /**事件时间*/
        @JsonProperty("EventTime")
        private String EventTime;

        /**事件描述*/
        @JsonProperty("EventDescription")
        private String EventDescription;

    }

}
