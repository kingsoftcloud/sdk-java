package ksyun.client.cdn.setforceredirectconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetForceRedirectConfigRequest
* @Description 请求参数
*/
@Data
public class SetForceRedirectConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置强制跳转类型, 取值: off、 https，默认为off 。其中https表示http → https，当选择https时需保证域名已配置证书。*/
    @KsYunField(name="RedirectType")
    private String RedirectType;

    /**强制跳转使用的状态码，仅支持301、302、303、307和308。仅允许输入一个状态码

为空默认302*/
    @KsYunField(name="RedirectCode")
    private String RedirectCode;

}
