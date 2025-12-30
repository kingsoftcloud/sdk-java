package ksyun.client.monitor.describesystemeventattributes.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSystemEventAttributesResponse
* @Description DescribeSystemEventAttributes 返回体
*/
@Data
@ToString
public class DescribeSystemEventAttributesResponse extends BaseResponseModel {

    /**请求ID。*/
    @JsonProperty("RequestID")
    private String RequestID;

    /**事件内容详情集合。*/
    @JsonProperty("SystemEvents")
    private List<SystemEventsDto> SystemEvents;

    @Data
    @ToString
    public static class SystemEventsDto {
        /**事件发生的时间戳。

单位：毫秒。*/
        @JsonProperty("Time")
        private Integer Time;

        /**表示一类云产品，指定命名空间。*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**产品类型ID。*/
        @JsonProperty("NamespaceID")
        private Integer NamespaceID;

        /**事件类型。*/
        @JsonProperty("EventType")
        private String EventType;

        /**事件名称。*/
        @JsonProperty("EventName")
        private String EventName;

        /**事件级别。

有效值：
- Critical：严重
- Warn(Warning)：警告
- Info：信息
*/
        @JsonProperty("EventLevel")
        private String EventLevel;

        /**事件状态。*/
        @JsonProperty("EventStatus")
        private String EventStatus;

        /***/
        @JsonProperty("Tags")
        private List<String> Tags;

        /**事件内容详情。*/
        @JsonProperty("Content")
        private String Content;

        /**实例名称。*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例ID。*/
        @JsonProperty("InstanceID")
        private String InstanceID;

        /**区域。*/
        @JsonProperty("Region")
        private String Region;

    }

    /**事件总数。*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
