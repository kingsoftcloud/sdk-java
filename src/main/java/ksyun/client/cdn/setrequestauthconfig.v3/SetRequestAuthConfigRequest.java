package ksyun.client.cdn.setrequestauthconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetRequestAuthConfigRequest
* @Description 请求参数
*/
@Data
public class SetRequestAuthConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置是否开启或关闭取值：on、off，默认值为off关闭。开启时，下述必须项为必填项；关闭时，只更改此标识，忽略后面的项目。*/
    @KsYunField(name="Enable")
    private String Enable;

    /**防盗链类型，取值：typeA 、typeB；开启后必填（两种类型说明见下）*/
    @KsYunField(name="AuthType")
    private String AuthType;

    /**主享密钥，必须由大小写字母（a-Z）或者数字（0-9）组成，长度在6-128个字符之间。*/
    @KsYunField(name="Key1")
    private String Key1;

    /**备享密钥，必须由大小写字母（a-Z）或者数字（0-9）组成，长度在6-128个字符之间。*/
    @KsYunField(name="Key2")
    private String Key2;

    /**过期时间，单位为“秒”，输入大于等于0的正整数，最大不要超过31536000。
两种防盗链类型说明如下：*/
    @KsYunField(name="ExpirationTime")
    private String ExpirationTime;

}
