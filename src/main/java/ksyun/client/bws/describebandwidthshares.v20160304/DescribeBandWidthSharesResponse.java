package ksyun.client.bws.describebandwidthshares.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBandWidthSharesResponse
* @Description DescribeBandWidthShares 返回体
*/
@Data
@ToString
public class DescribeBandWidthSharesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**共享带宽的信息*/
    @JsonProperty("BandWidthShareSet")
    private List<BandWidthShareSetDto> BandWidthShareSet;

    @Data
    @ToString
    public static class BandWidthShareSetDto {
        /**共享带宽的ID*/
        @JsonProperty("BandWidthShareId")
        private String BandWidthShareId;

        /**共享带宽的带宽*/
        @JsonProperty("BandWidth")
        private Integer BandWidth;

        /**共享带宽的名称*/
        @JsonProperty("BandWidthShareName")
        private String BandWidthShareName;

        /**共享带宽创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**线路类型的ID*/
        @JsonProperty("LineId")
        private String LineId;

        /**项目的ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**链路名称*/
        @JsonProperty("LineName")
        private String LineName;

        /**关联EIP列表*/
        @JsonProperty("AssociateBandWidthShareInfoSet")
        private List<BandWidthShareSetAssociateBandWidthShareInfoSetDto> AssociateBandWidthShareInfoSet;

        @Data
        @ToString
        public static class BandWidthShareSetAssociateBandWidthShareInfoSetDto {
            /**弹性IP的ID*/
            @JsonProperty("AllocationId")
            private String AllocationId;

        }

        /**Nat的计费类型*/
        @JsonProperty("ChargeType")
        private String ChargeType;

        /**服务结束时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**资源所绑定的标签信息,仅查询接口且存在标签筛选条件或者IsContainTag为True时才会返回此值(会影响接口速度)*/
        @JsonProperty("TagSet")
        private List<BandWidthShareSetTagSetDto> TagSet;

        @Data
        @ToString
        public static class BandWidthShareSetTagSetDto {
            /**资源ID*/
            @JsonProperty("ResourceUuid")
            private String ResourceUuid;

            /**标签ID*/
            @JsonProperty("TagId")
            private String TagId;

            /**标签建*/
            @JsonProperty("TagKey")
            private String TagKey;

            /**标签值*/
            @JsonProperty("TagValue")
            private String TagValue;

        }

    }

}
