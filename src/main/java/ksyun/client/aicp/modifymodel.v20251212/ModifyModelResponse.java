package ksyun.client.aicp.modifymodel.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyModelResponse
* @Description ModifyModel 返回体
*/
@Data
@ToString
public class ModifyModelResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型ID*/
    @JsonProperty("ModelId")
    private String ModelId;

}
