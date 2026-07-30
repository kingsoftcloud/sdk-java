package ksyun.client.aicp.startsandboxinstance.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname StartSandboxInstanceResponse
* @Description StartSandboxInstance 返回体
*/
@Data
@ToString
public class StartSandboxInstanceResponse extends BaseResponseModel {

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
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Endpoint")
        private String Endpoint;

        /***/
        @JsonProperty("TemplateId")
        private String TemplateId;

        /***/
        @JsonProperty("Token")
        private String Token;

        /***/
        @JsonProperty("Timeout")
        private Integer Timeout;

    }

}
