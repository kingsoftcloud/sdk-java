package ksyun.client.aicp.disablemodels.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DisableModelsResponse
* @Description DisableModels 返回体
*/
@Data
@ToString
public class DisableModelsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
