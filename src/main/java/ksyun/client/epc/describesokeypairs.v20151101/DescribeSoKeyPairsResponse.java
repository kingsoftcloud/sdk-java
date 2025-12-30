package ksyun.client.epc.describesokeypairs.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSoKeyPairsResponse
* @Description DescribeSoKeyPairs 返回体
*/
@Data
@ToString
public class DescribeSoKeyPairsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("KeyPairs")
    private List<KeyPairsDto> KeyPairs;

    @Data
    @ToString
    public static class KeyPairsDto {
        /**2025-07-24T18:41:14+08:00*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /***/
        @JsonProperty("Description")
        private String Description;

        /**89b726fd64d277c1a4af88bec56753b3*/
        @JsonProperty("FingerPrint")
        private String FingerPrint;

        /**kp-ye0xql4lnf38dgb1slmk*/
        @JsonProperty("KeyPairId")
        private String KeyPairId;

        /**3322*/
        @JsonProperty("KeyPairName")
        private String KeyPairName;

        /**2025-07-24T18:41:14+08:00*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

    }

    /**eWR6dWdqemN6b2thazRlOG1ibDQ=*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**4b304828-1775-4a5f-bd4a-ce86fa2c04f1*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**true*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
