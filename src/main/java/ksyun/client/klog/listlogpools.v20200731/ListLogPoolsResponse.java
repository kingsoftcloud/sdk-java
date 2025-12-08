package ksyun.client.klog.listlogpools.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListLogPoolsResponse
* @Description ListLogPools 返回体
*/
@Data
@ToString
public class ListLogPoolsResponse extends BaseResponseModel {
    /**工程名称
*/
    @JsonProperty("ProjectName")
    private String ProjectName;

    /**日志池总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**本次返回日志池数量*/
    @JsonProperty("Count")
    private Integer Count;

    /**日志池列表*/
    @JsonProperty("LogPools")
    private List<LogPoolsDto> LogPools;

    @Data
    @ToString
    public static class LogPoolsDto {
        /**工程名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**日志池创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**日志池更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**日志池名称*/
        @JsonProperty("LogPoolName")
        private String LogPoolName;

        /**日志池ID*/
        @JsonProperty("LogPoolId")
        private String LogPoolId;

        /**日志池消息队列分区数*/
        @JsonProperty("Partitions")
        private Integer Partitions;

        /**日志池保存天数*/
        @JsonProperty("RetentionDays")
        private Integer RetentionDays;

        /**需要过滤的标签列表*/
        @JsonProperty("Tags")
        private List<TagsDto> Tags;

        @Data
        @ToString
        public static class TagsDto {
            /**标签ID*/
            @JsonProperty("Id")
            private Integer Id;

            /**标签键
*/
            @JsonProperty("Key")
            private String Key;

            /**标签值*/
            @JsonProperty("Value")
            private String Value;

        }

        /**是否是Webtracking日志池*/
        @JsonProperty("WebTracking")
        private Boolean WebTracking;

        /**日志池状态*/
        @JsonProperty("Status")
        private String Status;

        /**日志池场景*/
        @JsonProperty("Scene")
        private String Scene;

    }

}
