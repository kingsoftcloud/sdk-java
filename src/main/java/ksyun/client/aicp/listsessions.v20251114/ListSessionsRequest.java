package ksyun.client.aicp.listsessions.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSessionsRequest
* @Description 请求参数
*/
@Data
public class ListSessionsRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**与Agent交互的用户唯一标识*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

    /**查询会话内容*/
    @KsYunField(name="Query")
    private String Query;

    /**起始页码*/
    @KsYunField(name="Page")
    private Integer Page;

    /**页大小*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**毫秒级时间戳*/
    @KsYunField(name="CreatedAfter")
    private Integer CreatedAfter;

    /**毫秒级时间戳*/
    @KsYunField(name="CreatedBefore")
    private Integer CreatedBefore;

}
