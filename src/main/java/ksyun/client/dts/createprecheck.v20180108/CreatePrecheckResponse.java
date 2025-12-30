package ksyun.client.dts.createprecheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreatePrecheckResponse
* @Description CreatePrecheck 返回体
*/
@Data
@ToString
public class CreatePrecheckResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("PrecheckId")
        private String PrecheckId;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
