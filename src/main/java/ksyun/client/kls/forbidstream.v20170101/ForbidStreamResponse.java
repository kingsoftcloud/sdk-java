package ksyun.client.kls.forbidstream.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ForbidStreamResponse
* @Description ForbidStream 返回体
*/
@Data
@ToString
public class ForbidStreamResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("RetCode")
        private Integer RetCode;

        /***/
        @JsonProperty("RetMsg")
        private String RetMsg;

    }

}
