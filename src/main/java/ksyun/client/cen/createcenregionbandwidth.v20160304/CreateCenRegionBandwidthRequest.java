package ksyun.client.cen.createcenregionbandwidth.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateCenRegionBandwidthRequest
 * @Description 请求参数
 */
@Data
public class CreateCenRegionBandwidthRequest {
    /**
     * 云企业网的ID
     */
    @KsYunField(name = "CenId")
    private String CenId;

    /**
     * A机房Code
     */
    @KsYunField(name = "RegionA")
    private String RegionA;

    /**
     * B机房Code
     */
    @KsYunField(name = "RegionB")
    private String RegionB;

    /**
     * 云企业网带宽包ID
     */
    @KsYunField(name = "CenBandWidthPackageId")
    private String CenBandWidthPackageId;

    /**
     * 带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;


}