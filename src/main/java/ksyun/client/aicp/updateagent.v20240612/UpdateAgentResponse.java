package ksyun.client.aicp.updateagent.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateAgentResponse
* @Description UpdateAgent 返回体
*/
@Data
@ToString
public class UpdateAgentResponse extends BaseResponseModel {

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
        @JsonProperty("agent_id")
        private String Agent_id;

        /***/
        @JsonProperty("status")
        private String Status;

    }

}
