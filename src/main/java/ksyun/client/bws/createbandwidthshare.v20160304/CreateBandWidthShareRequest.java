package ksyun.client.bws.createbandwidthshare.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateBandWidthShareRequest
 * @Description 请求参数
 */
@Data
public class CreateBandWidthShareRequest {
    /**
     * 线路类型的ID
     */
    @KsYunField(name = "LineId")
    private String LineId;

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

    /**
     * 项目的ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 共享带宽的计费类型
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;


}