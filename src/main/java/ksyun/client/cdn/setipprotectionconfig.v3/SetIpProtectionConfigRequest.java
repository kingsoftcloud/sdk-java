package ksyun.client.cdn.setipprotectionconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetIpProtectionConfigRequest
* @Description 请求参数
*/
@Data
public class SetIpProtectionConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置是否开启或关闭 取值：on、off，默认值为off关闭。开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。*/
    @KsYunField(name="Enable")
    private String Enable;

    /**Ip黑白名单类型，取值：block：黑名单；allow：白名单，开启后必填*/
    @KsYunField(name="IpType")
    private String IpType;

    /**103.200.110.0-103.200.110.254；
10.10.10.0/24 (24表示采用子网掩码中的前24位有效位，即用32-24=8bit来表示主机号，该子网可以容纳2^8-2=254台主机，故10.10.10.0/24表示IP网段范围是：10.10.10.1~10.10.10.254。)*/
    @KsYunField(name="IpList")
    private String IpList;

}
