package ksyun.client.kkms.decrypt.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DecryptResponse
* @Description Decrypt 返回体
*/
@Data
@ToString
public class DecryptResponse extends BaseResponseModel {

    /**
- 请求ID
- 类型: String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
- 客户主KEY的ID
- 类型:String
- 是否可缺省: 否

#### */
    @JsonProperty("KeyId")
    private String KeyId;

}
