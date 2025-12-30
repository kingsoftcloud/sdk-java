package ksyun.client.kce.updateprometheusinstance.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdatePrometheusInstanceResponse
* @Description UpdatePrometheusInstance 返回体
*/
@Data
@ToString
public class UpdatePrometheusInstanceResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
