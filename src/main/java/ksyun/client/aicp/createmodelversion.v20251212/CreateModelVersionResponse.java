package ksyun.client.aicp.createmodelversion.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateModelVersionResponse
* @Description CreateModelVersion 返回体
*/
@Data
@ToString
public class CreateModelVersionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型版本ID*/
    @JsonProperty("ModelVersionId")
    private String ModelVersionId;

}
