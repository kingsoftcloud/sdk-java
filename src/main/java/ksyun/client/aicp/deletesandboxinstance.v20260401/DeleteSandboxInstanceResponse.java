package ksyun.client.aicp.deletesandboxinstance.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSandboxInstanceResponse
* @Description DeleteSandboxInstance 返回体
*/
@Data
@ToString
public class DeleteSandboxInstanceResponse extends BaseResponseModel {

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
        @JsonProperty("SuccessDeleted")
        private List<String> SuccessDeleted;

        /***/
        @JsonProperty("FailedDeleted")
        private List<DataFailedDeletedDto> FailedDeleted;

        @Data
        @ToString
        public static class DataFailedDeletedDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("FailedReason")
            private String FailedReason;

        }

    }

}
