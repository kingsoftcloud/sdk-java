package ksyun.client.monitor.getprometheustoken.v20250101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetPrometheusTokenResponse
* @Description GetPrometheusToken 返回体
*/
@Data
@ToString
public class GetPrometheusTokenResponse extends BaseResponseModel {

    /**请求ID。*/
    @JsonProperty("RequestID")
    private String RequestID;

    /**访问Token。

> 该Token可用于Prometheus访问，具体使用，可参考：[监控数据查询](https://docs.ksyun.com/documents/44463?type=3) 相关文档。*/
    @JsonProperty("Token")
    private String Token;

}
