package ksyun.client.bws.deletebandwidthshare.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteBandWidthShareRequest
 * @Description 请求参数
 */
@Data
public class DeleteBandWidthShareRequest {
    /**
     * 共享带宽的ID
     */
    @KsYunField(name = "BandWidthShareId")
    private String BandWidthShareId;


}