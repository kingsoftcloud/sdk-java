package ksyun.client.pdns.createpdnszone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreatePdnsZoneRequest
* @Description 请求参数
*/
@Data
public class CreatePdnsZoneRequest{
    /**Zone名称*/
    @KsYunField(name="ZoneName")
    private String ZoneName;

    /**TTL*/
    @KsYunField(name="ZoneTtl")
    private Integer ZoneTtl;

    /**项目的ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**有效值：
TrafficMonthly：按量付费（流量月结）。*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

}
