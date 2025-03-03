package ksyun.client.cen.modifycenregionbandwidth.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ModifyCenRegionBandwidthRequest
 * @Description 请求参数
 */
@Data
public class ModifyCenRegionBandwidthRequest {
    /**
     * 跨地域带宽的ID
     */
    @KsYunField(name = "CenRegionBandwidthId")
    private String CenRegionBandwidthId;

    /**
     * 带宽
     */
    @KsYunField(name = "BandWidth")
    private String BandWidth;


}