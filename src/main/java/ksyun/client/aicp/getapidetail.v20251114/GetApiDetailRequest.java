package ksyun.client.aicp.getapidetail.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetApiDetailRequest
* @Description 请求参数
*/
@Data
public class GetApiDetailRequest{
    /**服务名称（必填）*/
    @KsYunField(name="ApiService")
    private String ApiService;

    /**API名称（必填）*/
    @KsYunField(name="ApiName")
    private String ApiName;

    /**版本号（必填）*/
    @KsYunField(name="ApiVersion")
    private String ApiVersion;

}
