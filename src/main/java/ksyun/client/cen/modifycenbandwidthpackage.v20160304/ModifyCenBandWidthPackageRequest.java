package ksyun.client.cen.modifycenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyCenBandWidthPackageRequest
 * @Description 请求参数
 */
@Data
public class ModifyCenBandWidthPackageRequest {
    /**
     * 云企业网带宽包的ID
     */
    @KsYunField(name = "CenBandWidthPackageId")
    private String CenBandWidthPackageId;

    /**
     * 带宽值
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;


}