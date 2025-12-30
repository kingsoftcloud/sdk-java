package ksyun.client.kcrs.describewebhooktriggerlog.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeWebhookTriggerLogResponse
* @Description DescribeWebhookTriggerLog 返回体
*/
@Data
@ToString
public class DescribeWebhookTriggerLogResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /***/
    @JsonProperty("Marker")
    private Integer Marker;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("Logs")
    private LogsDto Logs;

    @Data
    @ToString
    public static class LogsDto {
    }

}
