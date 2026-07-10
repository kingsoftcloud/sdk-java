package ksyun.client.aicp.getapioverview.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetApiOverviewRequest
* @Description 请求参数
*/
@Data
public class GetApiOverviewRequest{
    /**服务名称（必填）*/
    @KsYunField(name="ApiService")
    private String ApiService;

    /**版本号，不填则查询所有版本*/
    @KsYunField(name="ApiVersion")
    private String ApiVersion;

}
