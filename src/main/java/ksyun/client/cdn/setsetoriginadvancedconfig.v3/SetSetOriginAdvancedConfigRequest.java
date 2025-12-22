package ksyun.client.cdn.setsetoriginadvancedconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetSetOriginAdvancedConfigRequest
* @Description 请求参数
*/
@Data
public class SetSetOriginAdvancedConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**设置高级回源配置的开启或关闭 取值: on、off。注意：开启后会关闭掉基础配置中的的回源配置。默认值关闭。开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。*/
    @KsYunField(name="Enable")
    private String Enable;

    /**主源站类型 取值：ipaddr、 domain分别表示：IP源站、域名源站。 主源站的信息也是在创建加速域名时所设置的源站信息。关闭高级回源配置后，则沿用创建加速域名时的回源配置*/
    @KsYunField(name="OriginType")
    private String OriginType;

    /**回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。*/
    @KsYunField(name="Origin")
    private String Origin;

    /**热备源站类型，取值：ipaddr、 domain分别表示：IP源站、域名源站。热备源站类型和主源站类型可以不一致。*/
    @KsYunField(name="BackupOriginType")
    private String BackupOriginType;

    /**热备源站回源地址，可以是IP或域名；IP支持最多20个，以逗号区分，域名只能输入一个。IP与域名不能同时输入。*/
    @KsYunField(name="BackupOrigin")
    private String BackupOrigin;

    /**rr: 轮询； quality: 按质量最优的topN来轮询回源*/
    @KsYunField(name="OriginPolicy")
    private String OriginPolicy;

    /**取值1-10的整数。当OriginPolicy是quality时，该项必填。*/
    @KsYunField(name="OriginPolicyBestCount")
    private String OriginPolicyBestCount;

}
