package ksyun.client.kce.deleteprometheusinstance.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeletePrometheusInstanceResponse
* @Description DeletePrometheusInstance 返回体
*/
@Data
@ToString
public class DeletePrometheusInstanceResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
