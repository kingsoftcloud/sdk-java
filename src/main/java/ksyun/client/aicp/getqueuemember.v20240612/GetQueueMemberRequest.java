package ksyun.client.aicp.getqueuemember.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname GetQueueMemberRequest
* @Description 请求参数
*/
@Data
public class GetQueueMemberRequest{
    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**子账号ID*/
    @KsYunField(name="SubAccountId")
    private String SubAccountId;

    /**页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量。可选范围5-1000*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
