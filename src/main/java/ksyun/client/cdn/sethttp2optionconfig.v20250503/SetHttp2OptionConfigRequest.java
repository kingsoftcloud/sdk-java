package ksyun.client.cdn.sethttp2optionconfig.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetHttp2OptionConfigRequest
* @Description 请求参数
*/
@Data
public class SetHttp2OptionConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置HTTP 2.0功能的开启或关闭 取值：on、off ，默认为off ；开启需保证域名已配置证书。*/
    @KsYunField(name="Enable")
    private String Enable;

}
