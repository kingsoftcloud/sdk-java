package ksyun.client.aicp.modifybatchinferencejob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyBatchInferenceJobResponse
* @Description ModifyBatchInferenceJob 返回体
*/
@Data
@ToString
public class ModifyBatchInferenceJobResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
