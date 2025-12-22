package ksyun.client.cdn.getdomainlogs.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetDomainLogsRequest
* @Description 请求参数
*/
@Data
public class GetDomainLogsRequest{
    /***/
    @KsYunField(name="DomainId")
    private String DomainId;

}
