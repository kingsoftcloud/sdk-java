package ksyun.client.aicp.createqueue.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateQueueResponse
* @Description CreateQueue 返回体
*/
@Data
@ToString
public class CreateQueueResponse extends BaseResponseModel {

    /**队列ID*/
    @JsonProperty("QueueId")
    private String QueueId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
