package ksyun.client.aicp.stopbatchinferencejob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StopBatchInferenceJobResponse
* @Description StopBatchInferenceJob 返回体
*/
@Data
@ToString
public class StopBatchInferenceJobResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Success")
    private Boolean Success;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
