package ksyun.client.cen.createcenregionbandwidth.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCenRegionBandwidthResponse
* @Description CreateCenRegionBandwidth 返回体
*/
@Data
@ToString
public class CreateCenRegionBandwidthResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**跨地域带宽的信息*/
    @JsonProperty("CenRegionBandwidth")
    private CenRegionBandwidthDto CenRegionBandwidth;

    @Data
    @ToString
    public static class CenRegionBandwidthDto {
        /**带宽包的ID*/
        @JsonProperty("CenBandWidthPackageId")
        private String CenBandWidthPackageId;

        /**云企业网的ID*/
        @JsonProperty("CenId")
        private String CenId;

        /**本端地域名称*/
        @JsonProperty("LocalRegion")
        private String LocalRegion;

        /**对端地域名称*/
        @JsonProperty("RemoteRegion")
        private String RemoteRegion;

        /**跨地域间分配的带宽*/
        @JsonProperty("InterBandWidth")
        private Integer InterBandWidth;

        /**跨地域带宽的ID*/
        @JsonProperty("CenRegionBandwidthId")
        private String CenRegionBandwidthId;

    }

}
