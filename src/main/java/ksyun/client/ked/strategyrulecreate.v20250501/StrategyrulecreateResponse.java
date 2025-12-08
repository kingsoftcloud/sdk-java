package ksyun.client.ked.strategyrulecreate.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StrategyrulecreateResponse
* @Description Strategyrulecreate 返回体
*/
@Data
@ToString
public class StrategyrulecreateResponse extends BaseResponseModel {
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
        @JsonProperty("id")
        private Integer Id;

    }

}
