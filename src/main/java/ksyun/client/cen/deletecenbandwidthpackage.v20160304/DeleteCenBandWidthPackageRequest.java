package ksyun.client.cen.deletecenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCenBandWidthPackageRequest
 * @Description 请求参数
 */
@Data
public class DeleteCenBandWidthPackageRequest {
    /**
     * 云企业网带宽包的ID
     */
    @KsYunField(name = "CenBandWidthPackageId")
    private String CenBandWidthPackageId;

}