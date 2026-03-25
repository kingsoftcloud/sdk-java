package ksyun.client.aicp.deletequeue.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteQueueRequest
* @Description 请求参数
*/
@Data
public class DeleteQueueRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

}
