package ksyun.client.aicp.modifyqueue.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyQueueResponse
* @Description ModifyQueue 返回体
*/
@Data
@ToString
public class ModifyQueueResponse extends BaseResponseModel {

    /**队列ID*/
    @JsonProperty("QueueId")
    private String QueueId;

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

}
