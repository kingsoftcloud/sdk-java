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
public class CreateCenRegionBandwidthRequest{
    /**本端机房Code*/
    @KsYunField(name="LocalRegion")
    private String LocalRegion;

    /**远端机房Code*/
    @KsYunField(name="RemoteRegion")
    private String RemoteRegion;

    /**云企业网带宽包的ID*/
    @KsYunField(name="CenBandWidthPackageId")
    private String CenBandWidthPackageId;

    /**跨地域的带宽值*/
    @KsYunField(name="InterBandWidth")
    private Integer InterBandWidth;

}
