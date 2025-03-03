package ksyun.client.cen.createcenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CreateCenBandWidthPackageRequest
 * @Description 请求参数
 */
@Data
public class CreateCenBandWidthPackageRequest {
    /**
     * 云企业网ID
     */
    @KsYunField(name = "CenId")
    private String CenId;

    /**
     * 带宽包的名称
     */
    @KsYunField(name = "CenBandWidthPackageName")
    private String CenBandWidthPackageName;

    /**
     * 本端区域ID
     */
    @KsYunField(name = "LocalAreaId")
    private String LocalAreaId;

    /**
     * 远端区域ID
     */
    @KsYunField(name = "RemoteAreaId")
    private String RemoteAreaId;

    /**
     * 带宽值
     */
    @KsYunField(name = "PackageBandWidth")
    private Integer PackageBandWidth;

    /**
     * 项目的ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;

    /**
     * 计费类型 (Monthly|Daily)
     */
    @KsYunField(name = "ChargeType")
    private String ChargeType;

    /**
     * 购买时长，计费类型为包年包月Monthly时不可缺省。
     */
    @KsYunField(name = "PurchaseTime")
    private Integer PurchaseTime;

}