package ksyun.client.cdn.deletehttpheadersconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteHttpHeadersConfigRequest
* @Description 请求参数
*/
@Data
public class DeleteHttpHeadersConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**已经设置的Http头参数*/
    @KsYunField(name="HeaderKey")
    private String HeaderKey;

}
