package ksyun.client.cen.deletecenregionbandwidth.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteCenRegionBandwidthRequest
 * @Description 请求参数
 */
@Data
public class DeleteCenRegionBandwidthRequest {
    /**
     * 跨地域带宽的ID
     */
    @KsYunField(name = "CenRegionBandwidthId")
    private String CenRegionBandwidthId;

}