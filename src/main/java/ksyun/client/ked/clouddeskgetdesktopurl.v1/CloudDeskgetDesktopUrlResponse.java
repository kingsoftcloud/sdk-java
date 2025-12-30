package ksyun.client.ked.clouddeskgetdesktopurl.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloudDeskgetDesktopUrlResponse
* @Description CloudDeskgetDesktopUrl 返回体
*/
@Data
@ToString
public class CloudDeskgetDesktopUrlResponse extends BaseResponseModel {

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
        @JsonProperty("code")
        private Integer Code;

        /***/
        @JsonProperty("url")
        private String Url;

    }

}
