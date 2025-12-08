package ksyun.client.ked.createclouddeskgettoken.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCloudDeskgetTokenResponse
* @Description CreateCloudDeskgetToken 返回体
*/
@Data
@ToString
public class CreateCloudDeskgetTokenResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("expiresAt")
        private Integer ExpiresAt;

        /***/
        @JsonProperty("token")
        private String Token;

    }

}
