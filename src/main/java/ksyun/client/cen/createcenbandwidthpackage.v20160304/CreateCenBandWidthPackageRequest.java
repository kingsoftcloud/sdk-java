package ksyun.client.cen.createcenbandwidthpackage.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateCenBandWidthPackageRequest
* @Description 请求参数
*/
@Data
public class CreateCenBandWidthPackageRequest{
    /**云企业网ID*/
    @KsYunField(name="CenId")
    private String CenId;

    /**带宽包的名称*/
    @KsYunField(name="Name")
    private String Name;

    /**地域组A的ID*/
    @KsYunField(name="RegionAGroupId")
    private String RegionAGroupId;

    /**地域组B的ID*/
    @KsYunField(name="RegionBGroupId")
    private String RegionBGroupId;

    /**带宽值*/
    @KsYunField(name="BandWidth")
    private Integer BandWidth;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**计费类型 (Monthly|Peak|Daily|Hourly|PrepaidByTime|PostpaidByTime|TrafficMonthly)*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

    /**购买时长，计费类型为包年包月时不可缺省。*/
    @KsYunField(name="PurchaseTime")
    private Integer PurchaseTime;


}