package ksyun.client.sks.createkey.v20151101;

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

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户的公钥信息*/
    @JsonProperty("PrivateKey")
    private String PrivateKey;

}
