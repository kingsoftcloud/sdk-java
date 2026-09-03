package ksyun.client.aicp.addmodelaccess.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddModelAccessResponse
* @Description AddModelAccess 返回体
*/
@Data
@ToString
public class AddModelAccessResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型ID*/
    @JsonProperty("ModelId")
    private String ModelId;

}
