package ksyun.client.cen.describecenbandwidthpackages.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCenBandWidthPackagesResponse
* @Description DescribeCenBandWidthPackages 返回体
*/
@Data
@ToString
public class DescribeCenBandWidthPackagesResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**云企业网带宽包的信息*/
    @JsonProperty("CenBandWidthPackageSet")
    private List<CenBandWidthPackageSetDto> CenBandWidthPackageSet;

    @Data
    @ToString
    public static class CenBandWidthPackageSetDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**带宽包的ID*/
        @JsonProperty("CenBandWidthPackageId")
        private String CenBandWidthPackageId;

        /**带宽包的名称*/
        @JsonProperty("CenBandWidthPackageName")
        private String CenBandWidthPackageName;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**带宽包的带宽*/
        @JsonProperty("PackageBandWidth")
        private Integer PackageBandWidth;

        /**本端区域ID*/
        @JsonProperty("LocalAreaId")
        private String LocalAreaId;

        /**对端区域ID*/
        @JsonProperty("RemoteAreaId")
        private String RemoteAreaId;

        /**计费类型*/
        @JsonProperty("BillType")
        private Integer BillType;

        /**商品类型(1正式产品，2试用产品)*/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /**实例到期时间*/
        @JsonProperty("ServiceEndTime")
        private String ServiceEndTime;

        /**标签列表*/
        @JsonProperty("TagSet")
        private List<CenBandWidthPackageSetTagSetDto> TagSet;

        @Data
        @ToString
        public static class CenBandWidthPackageSetTagSetDto {
            /**标签ID*/
            @JsonProperty("TagId")
            private Integer TagId;

            /**资源ID*/
            @JsonProperty("ResourceUuid")
            private String ResourceUuid;

            /**标签Key*/
            @JsonProperty("TagKey")
            private String TagKey;

            /**标签Value*/
            @JsonProperty("TagValue")
            private String TagValue;

        }

    }

}
