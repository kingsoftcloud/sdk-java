package ksyun.client.kmr.restartflinkjobrun.v20240814;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RestartFlinkJobRunResponse
* @Description RestartFlinkJobRun 返回体
*/
@Data
@ToString
public class RestartFlinkJobRunResponse extends BaseResponseModel {
    /**响应消息*/
    @JsonProperty("Code")
    private Integer Code;

    /**响应信息*/
    @JsonProperty("Message")
    private String Message;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**空结构体*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
    }

}
