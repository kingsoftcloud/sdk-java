package ksyun.client.kcf.createormodifyautoscalingconfig.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateOrModifyAutoScalingConfigResponse
* @Description CreateOrModifyAutoScalingConfig 返回体
*/
@Data
@ToString
public class CreateOrModifyAutoScalingConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
