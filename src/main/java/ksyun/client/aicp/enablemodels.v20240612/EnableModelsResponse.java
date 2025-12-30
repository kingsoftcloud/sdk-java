package ksyun.client.aicp.enablemodels.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EnableModelsResponse
* @Description EnableModels 返回体
*/
@Data
@ToString
public class EnableModelsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Success")
    private Boolean Success;

}
