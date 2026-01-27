package ksyun.client.aicp.deletemodelversion.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteModelVersionResponse
* @Description DeleteModelVersion 返回体
*/
@Data
@ToString
public class DeleteModelVersionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型版本ID*/
    @JsonProperty("ModelVersionId")
    private String ModelVersionId;

}
