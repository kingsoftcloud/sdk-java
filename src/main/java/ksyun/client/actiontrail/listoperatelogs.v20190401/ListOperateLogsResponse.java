package ksyun.client.actiontrail.listoperatelogs.v20190401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListOperateLogsResponse
* @Description ListOperateLogs 返回体
*/
@Data
@ToString
public class ListOperateLogsResponse extends BaseResponseModel {
    /**返回的总事件数量*/
    @JsonProperty("Total")
    private Integer Total;

    /**事件列表*/
    @JsonProperty("Events")
    private List<EventsDto> Events;

    @Data
    @ToString
    public static class EventsDto {
        /**错误信息，例如：The request was rejected because the old password was incorrect*/
        @JsonProperty("ErrorMessage")
        private String ErrorMessage;

        /**事件的创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**事件相关的云服务名称，例如iam*/
        @JsonProperty("ServiceName")
        private String ServiceName;

        /**事件来源。例如 iam.inner.api.ksyun.com*/
        @JsonProperty("EventSource")
        private String EventSource;

        /**API的版本号*/
        @JsonProperty("ApiVersion")
        private String ApiVersion;

        /**API请求的输入参数。*/
        @JsonProperty("RequestParameters")
        private RequestParametersDto RequestParameters;

        @Data
        @ToString
        public static class RequestParametersDto {
        }

        /**事件发起的源IP地址。*/
        @JsonProperty("SourceIpAddress")
        private String SourceIpAddress;

        /***/
        @JsonProperty("EventVersion")
        private String EventVersion;

        /**发生的事件类型。取值：
ApiCall：API调用事件。大多金山云控制台基于API开发，对应的操作行为也会记录为ApiCall。
ConsoleSignin：控制台登录事件。*/
        @JsonProperty("EventType")
        private String EventType;

        /**事件ID。操作审计为每个管控事件所产生的一个UUID。
例如55733e91-4e3b-4******b-053787278d2e*/
        @JsonProperty("EventId")
        private String EventId;

        /**事件的读写类型。
read：读类型
write：写类型*/
        @JsonProperty("EventRw")
        private String EventRw;

        /**事件名称。
如果eventType取值为ApiCall，该字段为API的名称。
如果eventType取值不为ApiCall，该字段为简单的英文短句，表示事件含义。*/
        @JsonProperty("EventName")
        private String EventName;

        /**请求者的身份信息。*/
        @JsonProperty("UserIdentity")
        private UserIdentityDto UserIdentity;

        @Data
        @ToString
        public static class UserIdentityDto {
            /**如果是角色访问，则记录为角色名称*/
            @JsonProperty("RoleName")
            private String RoleName;

            /**金山云账号ID*/
            @JsonProperty("AccountId")
            private String AccountId;

            /**如果是金山云主账号，记录为root
如果是IAM子用户，记录为username
如果为IAM角色，则记录accouid：rolename*/
            @JsonProperty("UserName")
            private String UserName;

            /**如果请求者通过Openapi访问API，则记录该字段。如果请求者通过控制台登录，则该字段不显示。*/
            @JsonProperty("AccessKey")
            private String AccessKey;

        }

        /**事件影响的资源列表。*/
        @JsonProperty("ReferencedResources")
        private List<ReferencedResourcesDto> ReferencedResources;

        @Data
        @ToString
        public static class ReferencedResourcesDto {
        }

        /**错误码*/
        @JsonProperty("ErrorCode")
        private String ErrorCode;

        /**地域，例如cn-beijing-6*/
        @JsonProperty("Region")
        private String Region;

        /**请求ID。例如ae7d9265-c82d-4f15-b98a-67ef278ff129*/
        @JsonProperty("RequestId")
        private String RequestId;

        /**事件的发生时间。例如：2021-08-10 17:40:59*/
        @JsonProperty("EventTime")
        private String EventTime;

        /***/
        @JsonProperty("UserAgent")
        private String UserAgent;

        /**资源类型*/
        @JsonProperty("ResourceType")
        private String ResourceType;

        /**资源名称*/
        @JsonProperty("ResourceName")
        private String ResourceName;

        /**地域中文名称，例如华北1（北京）*/
        @JsonProperty("RegionCn")
        private String RegionCn;

    }

    /**记录查询结果列表最后一条数据的游标*/
    @JsonProperty("SearchAfter")
    private Integer SearchAfter;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
