package ksyun.client.kkms.generatedatakey.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GenerateDataKeyResponse
* @Description GenerateDataKey 返回体
*/
@Data
@ToString
public class GenerateDataKeyResponse extends BaseResponseModel {

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

    /**
- DataKey的明文数据，最多长度不超过4096
- 类型:Base64-encoded binary data object
- 是否可缺省: 否

#### */
    @JsonProperty("Plaintext")
    private String Plaintext;

}
