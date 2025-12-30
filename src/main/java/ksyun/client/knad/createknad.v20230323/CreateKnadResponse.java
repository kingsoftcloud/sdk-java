package ksyun.client.knad.createknad.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateKnadResponse
* @Description CreateKnad 返回体
*/
@Data
@ToString
public class CreateKnadResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("kid")
    private String Kid;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
