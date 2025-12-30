package ksyun.client.dmp.testinstanceconnection.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname TestInstanceConnectionResponse
* @Description TestInstanceConnection 返回体
*/
@Data
@ToString
public class TestInstanceConnectionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("FailedReason")
        private String FailedReason;

        /***/
        @JsonProperty("ConnectionSuccess")
        private Boolean ConnectionSuccess;

    }

}
