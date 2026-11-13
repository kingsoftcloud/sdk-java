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

    /**是否终止成功*/
    @JsonProperty("Success")
    private Boolean Success;

    /**本次 API 请求的唯一标识符*/
    @JsonProperty("RequestId")
    private String RequestId;

}
