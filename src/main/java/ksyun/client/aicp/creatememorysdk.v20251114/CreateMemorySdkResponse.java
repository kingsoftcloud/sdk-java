package ksyun.client.aicp.creatememorysdk.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMemorySdkResponse
* @Description CreateMemorySdk 返回体
*/
@Data
@ToString
public class CreateMemorySdkResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
