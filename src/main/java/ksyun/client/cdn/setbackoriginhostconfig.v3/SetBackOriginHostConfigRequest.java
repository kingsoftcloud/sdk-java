package ksyun.client.cdn.setbackoriginhostconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetBackOriginHostConfigRequest
* @Description 请求参数
*/
@Data
public class SetBackOriginHostConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**回源host是否跟随请求域名，取值为true：是，false：否，默认为false*/
    @KsYunField(name="FollowReqDomain")
    private String FollowReqDomain;

    /**自定义回源域名，默认为空，表示不需要修改回源Host；当FollowReqDomain 为 false时，本参数为必填；FollowReqDomain 为 true时，本参数为非必填，若BackOriginHost传值，将被置空*/
    @KsYunField(name="BackOriginHost")
    private String BackOriginHost;

}
