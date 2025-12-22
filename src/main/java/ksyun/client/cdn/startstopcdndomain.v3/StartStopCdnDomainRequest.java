package ksyun.client.cdn.startstopcdndomain.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StartStopCdnDomainRequest
* @Description 请求参数
*/
@Data
public class StartStopCdnDomainRequest{
    /**需要启用或停用CDN服务的域名ID，只允许输入一个域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**操作接口名，取值：start：启用；stop：停用*/
    @KsYunField(name="ActionType")
    private String ActionType;

}
