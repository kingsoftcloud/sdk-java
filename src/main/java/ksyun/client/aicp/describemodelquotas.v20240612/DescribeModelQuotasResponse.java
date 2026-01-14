package ksyun.client.aicp.describemodelquotas.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModelQuotasResponse
* @Description DescribeModelQuotas 返回体
*/
@Data
@ToString
public class DescribeModelQuotasResponse extends BaseResponseModel {

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
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("ModelId")
        private String ModelId;

        /***/
        @JsonProperty("ModelName")
        private String ModelName;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("Icon")
        private String Icon;

        /**1-免费额度用尽后继续使用，2-免费额度用尽后禁用*/
        @JsonProperty("FreeQuotaStatus")
        private String FreeQuotaStatus;

        /**模型开通状态：1-开通，2-未开通。*/
        @JsonProperty("ActiveStatus")
        private Integer ActiveStatus;

        /**免费额度*/
        @JsonProperty("FreeTotalQuota")
        private Long FreeTotalQuota;

        /**免费已用额度*/
        @JsonProperty("FreeUsedQuota")
        private Long FreeUsedQuota;

        /**是否支持批量推理*/
        @JsonProperty("BatchSupported")
        private Boolean BatchSupported;

        /**是否视频模型*/
        @JsonProperty("VideoModel")
        private Boolean VideoModel;

        /***/
        @JsonProperty("Tpm")
        private Integer Tpm;

        /***/
        @JsonProperty("Rpm")
        private Integer Rpm;

    }

}
