package ksyun.client.pdns.modifypdnszone.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyPdnsZoneRequest
* @Description 请求参数
*/
@Data
public class ModifyPdnsZoneRequest{
    /**Zone的ID*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**TTL*/
    @KsYunField(name="ZoneTtl")
    private Integer ZoneTtl;

    /**内网Zone的子域名递归解析代理模式
有效值：
AUTHORITY：当前Zone未开启递归解析代理
RECURSIVE：当前Zone开启递归解析代理*/
    @KsYunField(name="ProxyPattern")
    private String ProxyPattern;

}
