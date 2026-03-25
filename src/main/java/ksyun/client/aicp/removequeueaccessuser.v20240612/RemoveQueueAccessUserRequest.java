package ksyun.client.aicp.removequeueaccessuser.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RemoveQueueAccessUserRequest
* @Description 请求参数
*/
@Data
public class RemoveQueueAccessUserRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**子账号ID*/
    @KsYunField(name="SubAccountId")
    private String SubAccountId;

}
