package ksyun.client.cen.createcenbandwidthpackage.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCenBandWidthPackageResponse
* @Description CreateCenBandWidthPackage 返回体
*/
@Data
@ToString
public class CreateCenBandWidthPackageResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**云企业网带宽包的信息*/
    @JsonProperty("CenBandWidthPackage")
    private CenBandWidthPackageDto CenBandWidthPackage;

    @Data
    @ToString
    public static class CenBandWidthPackageDto {
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

    }

}
