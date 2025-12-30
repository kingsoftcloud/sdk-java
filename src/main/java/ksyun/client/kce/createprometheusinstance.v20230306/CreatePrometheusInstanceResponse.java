package ksyun.client.kce.createprometheusinstance.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePrometheusInstanceResponse
* @Description CreatePrometheusInstance 返回体
*/
@Data
@ToString
public class CreatePrometheusInstanceResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**实例id*/
    @JsonProperty("InstanceId")
    private String InstanceId;

}
