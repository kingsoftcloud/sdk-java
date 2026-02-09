package ksyun.client.aicp.describemodels.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelsResponse
* @Description DescribeModels 返回体
*/
@Data
@ToString
public class DescribeModelsResponse extends BaseResponseModel {

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码，从1开始*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**分页页长，从1开始*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**数据列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("ModelId")
        private String ModelId;

        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**模型描述*/
        @JsonProperty("Description")
        private String Description;

        /**模型图标资源链接*/
        @JsonProperty("IconUrl")
        private String IconUrl;

        /**模型标签*/
        @JsonProperty("Tags")
        private List<String> Tags;

        /**更新时间，毫秒精度的时间戳*/
        @JsonProperty("UpdateTime")
        private Long UpdateTime;

        /**扩展字段*/
        @JsonProperty("CodeCase")
        private DataCodeCaseDto CodeCase;

        @Data
        @ToString
        public static class DataCodeCaseDto {
            /**是否视频模型*/
            @JsonProperty("VideoModel")
            private Boolean VideoModel;

            /**是否支持批量推理*/
            @JsonProperty("Batch")
            private Boolean Batch;

            /**模型类别*/
            @JsonProperty("ModelKind")
            private Integer ModelKind;

            /**模型支持的输入类型：1-文本，2-图片，3-视频*/
            @JsonProperty("InputType")
            private List<String> InputType;

            /**模型支持的输出类型：1-文本，2-图片，3-视频*/
            @JsonProperty("OutputType")
            private List<String> OutputType;

            /**支持模型体验类型：0-不支持，1-支持*/
            @JsonProperty("SupportTryout")
            private String SupportTryout;

            /***/
            @JsonProperty("ContextLength")
            private String ContextLength;

        }

        /**免费额度用尽后是否继续使用*/
        @JsonProperty("IsOverFreeDisable")
        private Boolean IsOverFreeDisable;

        /**免费额度*/
        @JsonProperty("FreeTotalQuota")
        private Long FreeTotalQuota;

        /**免费已用额度*/
        @JsonProperty("FreeUsedQuota")
        private Long FreeUsedQuota;

        /***/
        @JsonProperty("Tpm")
        private Integer Tpm;

        /***/
        @JsonProperty("Rpm")
        private Integer Rpm;

        /**	
模型开通状态：
1-开通，2-未开通*/
        @JsonProperty("ActiveStatus")
        private Integer ActiveStatus;

        /**模型类别*/
        @JsonProperty("ModelType")
        private String ModelType;

        /**模型供应商*/
        @JsonProperty("Provider")
        private String Provider;

    }

}
