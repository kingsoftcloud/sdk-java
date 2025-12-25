package ksyun.client.cdn.sethttpheadersconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetHttpHeadersConfigRequest
* @Description 请求参数
*/
@Data
public class SetHttpHeadersConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**要设置的HTTP头参数名称，支持英文、数字、下划线、英文中划线，必须以英文开头，最大长度为128个字符*/
    @KsYunField(name="HeaderKey")
    private String HeaderKey;

    /**要设置的Http头参数取值，取值组成：不支持双引号、单引号、中括号、花括号、中文，最大长度为255个字符*/
    @KsYunField(name="HeaderValue")
    private String HeaderValue;

}
