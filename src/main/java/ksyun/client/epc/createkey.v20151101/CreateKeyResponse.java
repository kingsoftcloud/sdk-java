package ksyun.client.epc.createkey.v20151101;

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
    /**请求接口时传递过来的，用户跟踪问题
*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**用户的公钥信息
*/
    @JsonProperty("PrivateKey")
    private String PrivateKey;

    /***/
    @JsonProperty("Key")
    private KeyDto Key;

    @Data
    @ToString
    public static class KeyDto {
        /***/
        @JsonProperty("KeyName")
        private String KeyName;

        /***/
        @JsonProperty("PublicKey")
        private String PublicKey;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("KeyId")
        private String KeyId;

    }

}
