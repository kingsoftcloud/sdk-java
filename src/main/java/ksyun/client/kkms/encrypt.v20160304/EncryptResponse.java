package ksyun.client.kkms.encrypt.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname EncryptResponse
* @Description Encrypt 返回体
*/
@Data
@ToString
public class EncryptResponse extends BaseResponseModel {

    /**
- 请求ID
- 类型: String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
- 密文数据
- 类型:Base64-encoded binary data object
- 是否可缺省: 否

#### */
    @JsonProperty("CiphertextBlob")
    private String CiphertextBlob;

}
