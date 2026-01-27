package ksyun.client.aicp.modifymodelversion.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyModelVersionResponse
* @Description ModifyModelVersion 返回体
*/
@Data
@ToString
public class ModifyModelVersionResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型版本ID*/
    @JsonProperty("ModelVersionId")
    private String ModelVersionId;

}
