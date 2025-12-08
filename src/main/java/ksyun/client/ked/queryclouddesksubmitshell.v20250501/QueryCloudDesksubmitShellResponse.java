package ksyun.client.ked.queryclouddesksubmitshell.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryCloudDesksubmitShellResponse
* @Description QueryCloudDesksubmitShell 返回体
*/
@Data
@ToString
public class QueryCloudDesksubmitShellResponse extends BaseResponseModel {
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
        /**任务id,可根据此id查询脚本执行状态*/
        @JsonProperty("planId")
        private Integer PlanId;

    }

}
