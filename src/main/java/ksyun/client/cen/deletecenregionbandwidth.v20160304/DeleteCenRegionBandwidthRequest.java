package ksyun.client.cen.deletecenregionbandwidth.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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