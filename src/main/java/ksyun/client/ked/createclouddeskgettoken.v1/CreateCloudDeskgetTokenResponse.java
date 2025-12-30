package ksyun.client.ked.createclouddeskgettoken.v1;

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
