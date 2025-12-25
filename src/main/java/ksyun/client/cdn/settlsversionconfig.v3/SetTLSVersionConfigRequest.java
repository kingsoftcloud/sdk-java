package ksyun.client.cdn.settlsversionconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetTLSVersionConfigRequest
* @Description 请求参数
*/
@Data
public class SetTLSVersionConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**选择要启用TLS协议版本，取值：TLSv1.0, TLSV1.1, TLSV1.2, TLSv1.3，缺省时默认全部启用；
* 支持同时启用多种协议版本，以列表形式传入，见参数示例值；
* 支持同时启用两个不连续的协议版本，如：TLSv1.0,TLSV1.3；
* 至少需要启用一种TLS协议版本。*/
    @KsYunField(name="TLSVersion",type=2)
    private List<String> TLSVersionList;

}
