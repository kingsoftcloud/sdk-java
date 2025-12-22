package ksyun.client.cdn.setignorequerystringconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetIgnoreQueryStringConfigRequest
* @Description 请求参数
*/
@Data
public class SetIgnoreQueryStringConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置过滤参数的开启或关闭 取值：on、off ，默认为on 。*/
    @KsYunField(name="Enable")
    private String Enable;

    /**保留参数，多个用逗号（英文、半角）分隔。*/
    @KsYunField(name="HashKeyArgs")
    private String HashKeyArgs;

    /**过滤参数类型
取值：block：删除部分参数；allow：保留部分参数；
当type参数填写是，hashkeyargs必填，否则报错*/
    @KsYunField(name="Type")
    private String Type;

}
