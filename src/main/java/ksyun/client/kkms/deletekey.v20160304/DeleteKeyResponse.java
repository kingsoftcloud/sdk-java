package ksyun.client.kkms.deletekey.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteKeyResponse
* @Description DeleteKey 返回体
*/
@Data
@ToString
public class DeleteKeyResponse extends BaseResponseModel {

    /**
- 请求ID
- 类型: String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
- 操作是否成功
- 类型: Boolean

### */
    @JsonProperty("Return")
    private Boolean ReturnField;

}
