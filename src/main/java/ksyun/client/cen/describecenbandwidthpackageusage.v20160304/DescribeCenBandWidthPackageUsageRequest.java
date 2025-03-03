package ksyun.client.cen.describecenbandwidthpackageusage.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeCenBandWidthPackageUsageRequest
 * @Description 请求参数
 */
@Data
public class DescribeCenBandWidthPackageUsageRequest {
    /**
     * 云企业网带宽包的ID
     */
    @KsYunField(name = "CenBandWidthPackageId")
    private String CenBandWidthPackageId;


}