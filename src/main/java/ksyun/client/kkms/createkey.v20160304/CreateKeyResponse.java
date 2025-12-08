package ksyun.client.kkms.createkey.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateKeyResponse
* @Description CreateKey 返回体
*/
@Data
@ToString
public class CreateKeyResponse extends BaseResponseModel {
    /**
- 请求ID
- 类型: String
#### */
    @JsonProperty("RequestId")
    private String RequestId;

}
