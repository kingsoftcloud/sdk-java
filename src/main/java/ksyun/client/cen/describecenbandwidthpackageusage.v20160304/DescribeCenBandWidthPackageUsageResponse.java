package ksyun.client.cen.describecenbandwidthpackageusage.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCenBandWidthPackageUsageResponse
* @Description DescribeCenBandWidthPackageUsage 返回体
*/
@Data
@ToString
public class DescribeCenBandWidthPackageUsageResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**云企业网带宽包的已分配信息*/
    @JsonProperty("CenBandWidthPackageUsage")
    private CenBandWidthPackageUsageDto CenBandWidthPackageUsage;

    @Data
    @ToString
    public static class CenBandWidthPackageUsageDto {
        /**带宽包已使用带宽值*/
        @JsonProperty("PackageUsage")
        private Integer PackageUsage;

        /**带宽包的ID*/
        @JsonProperty("CenBandWidthPackageId")
        private String CenBandWidthPackageId;

    }

}
