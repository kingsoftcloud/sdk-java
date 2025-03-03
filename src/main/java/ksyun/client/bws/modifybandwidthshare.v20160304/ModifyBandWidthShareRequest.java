package ksyun.client.bws.modifybandwidthshare.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyBandWidthShareRequest
 * @Description 请求参数
 */
@Data
public class ModifyBandWidthShareRequest {
    /**
     * 共享带宽的ID
     */
    @KsYunField(name = "BandWidthShareId")
    private String BandWidthShareId;

    /**
     * 共享带宽的带宽
     */
    @KsYunField(name = "BandWidth")
    private Integer BandWidth;

    /**
     * 共享带宽的名称
     */
    @KsYunField(name = "BandWidthShareName")
    private String BandWidthShareName;

}