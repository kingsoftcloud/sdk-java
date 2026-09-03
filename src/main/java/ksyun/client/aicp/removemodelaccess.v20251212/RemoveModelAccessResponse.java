package ksyun.client.aicp.removemodelaccess.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveModelAccessResponse
* @Description RemoveModelAccess 返回体
*/
@Data
@ToString
public class RemoveModelAccessResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型ID*/
    @JsonProperty("ModelId")
    private String ModelId;

}
