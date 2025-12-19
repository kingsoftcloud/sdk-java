package ksyun.client.cdn.deletecdndomain.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteCdnDomainRequest
* @Description 请求参数
*/
@Data
public class DeleteCdnDomainRequest{
    /**DomainId*/
    @KsYunField(name="DomainId")
    private String DomainId;

}
