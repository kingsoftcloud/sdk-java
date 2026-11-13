package ksyun.client.aicp.createbatchinferencejob.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateBatchInferenceJobResponse
* @Description CreateBatchInferenceJob 返回体
*/
@Data
@ToString
public class CreateBatchInferenceJobResponse extends BaseResponseModel {

    /**是否创建成功*/
    @JsonProperty("Success")
    private Boolean Success;

    /**本次 API 请求的唯一标识符*/
    @JsonProperty("RequestId")
    private String RequestId;

}
