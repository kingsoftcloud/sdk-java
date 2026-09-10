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

    /**内网 Zone的子域名递归解析代理模式
有效值：
AUTHORITY：当前Zone未开启递归解析代理（创建默认值）
RECURSIVE：当前Zone开启递归解析代理*/
    @KsYunField(name="ProxyPattern")
    private String ProxyPattern;

    /**是否开启删除保护on/off*/
    @KsYunField(name="DeleteProtection")
    private String DeleteProtection;

    /**是否开启修改保护on/off*/
    @KsYunField(name="ModifyProtection")
    private String ModifyProtection;

}
