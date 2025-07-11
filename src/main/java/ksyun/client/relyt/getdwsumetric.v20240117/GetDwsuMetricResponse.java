package ksyun.client.relyt.getdwsumetric.v20240117;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetDwsuMetricResponse
 * @Description GetDwsuMetric 返回体
 */
@Data
@ToString
public class GetDwsuMetricResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
