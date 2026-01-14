package ksyun.client.aicp.describeapikeys.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeApikeysResponse
* @Description DescribeApikeys 返回体
*/
@Data
@ToString
public class DescribeApikeysResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**数据列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("KeyId")
        private String KeyId;

        /***/
        @JsonProperty("KeyValue")
        private String KeyValue;

        /**关联的模型列表*/
        @JsonProperty("AssociatedModelIds")
        private List<String> AssociatedModelIds;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Description")
        private String Description;

        /**状态：1启用，2禁用*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间毫秒时间戳*/
        @JsonProperty("CreateTimestamp")
        private Long CreateTimestamp;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**项目名*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**创建用户ID*/
        @JsonProperty("CreateUserId")
        private String CreateUserId;

        /**创建用户名称*/
        @JsonProperty("CreateUserName")
        private String CreateUserName;

        /***/
        @JsonProperty("AssociatedModels")
        private List<DataAssociatedModelsDto> AssociatedModels;

        @Data
        @ToString
        public static class DataAssociatedModelsDto {
            /***/
            @JsonProperty("ModelId")
            private String ModelId;

            /***/
            @JsonProperty("ModelName")
            private String ModelName;

        }

        /***/
        @JsonProperty("AllAssociatedModel")
        private Boolean AllAssociatedModel;

        /**IP白名单，返回空数组时表示未开启IP白名单*/
        @JsonProperty("AllowedIps")
        private List<String> AllowedIps;

    }

    /**分页页码，从1开始*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**分页每页大小，最大100*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
