package ksyun.client.aicp.rollbackversion.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RollbackVersionResponse
* @Description RollbackVersion 返回体
*/
@Data
@ToString
public class RollbackVersionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Action")
    private String Action;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("AgentId")
        private String AgentId;

        /***/
        @JsonProperty("TargetVersionId")
        private String TargetVersionId;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Noop")
        private Boolean Noop;

    }

    /***/
    @JsonProperty("ReasonCode")
    private String ReasonCode;

}
