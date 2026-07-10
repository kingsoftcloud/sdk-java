package ksyun.client.aicp.describetrainjobandpodevents.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTrainJobAndPodEventsResponse
* @Description DescribeTrainJobAndPodEvents 返回体
*/
@Data
@ToString
public class DescribeTrainJobAndPodEventsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**事件列表*/
    @JsonProperty("Events")
    private List<EventsDto> Events;

    @Data
    @ToString
    public static class EventsDto {
        /**首次出现时间*/
        @JsonProperty("FirstSeen")
        private String FirstSeen;

        /**最后出现时间*/
        @JsonProperty("LastSeen")
        private String LastSeen;

        /**事件类型*/
        @JsonProperty("Type")
        private String Type;

        /**关联对象*/
        @JsonProperty("Object")
        private EventsObjectDto Object;

        @Data
        @ToString
        public static class EventsObjectDto {
            /**资源类型*/
            @JsonProperty("Kind")
            private String Kind;

            /**命名空间*/
            @JsonProperty("Namespace")
            private String Namespace;

            /**资源名称*/
            @JsonProperty("Name")
            private String Name;

            /**UID*/
            @JsonProperty("UID")
            private String UID;

            /**API版本*/
            @JsonProperty("APIVersion")
            private String APIVersion;

            /**资源版本*/
            @JsonProperty("ResourceVersion")
            private String ResourceVersion;

            /**字段路径*/
            @JsonProperty("FieldPath")
            private String FieldPath;

        }

        /**事件原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**事件消息*/
        @JsonProperty("Message")
        private String Message;

        /**事件来源*/
        @JsonProperty("Source")
        private EventsSourceDto Source;

        @Data
        @ToString
        public static class EventsSourceDto {
            /**组件*/
            @JsonProperty("Component")
            private String Component;

            /**主机*/
            @JsonProperty("Host")
            private String Host;

        }

        /**出现次数*/
        @JsonProperty("Count")
        private Integer Count;

    }

}
