package ksyun.client.kcf.openfunctionservice.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname OpenFunctionServiceResponse
* @Description OpenFunctionService 返回体
*/
@Data
@ToString
public class OpenFunctionServiceResponse extends BaseResponseModel {

    /**若为true，表示之前已开通；若为Id，表示开通对应的订单Id*/
    @JsonProperty("Data")
    private String Data;

}
