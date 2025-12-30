package ksyun.client.kcf.checkfunctionservice.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CheckFunctionServiceResponse
* @Description CheckFunctionService 返回体
*/
@Data
@ToString
public class CheckFunctionServiceResponse extends BaseResponseModel {

    /**若为true，表示已开通；若为false，表示未开通*/
    @JsonProperty("Data")
    private String Data;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
