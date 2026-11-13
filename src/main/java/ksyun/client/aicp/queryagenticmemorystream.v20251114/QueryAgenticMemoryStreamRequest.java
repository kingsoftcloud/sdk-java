package ksyun.client.aicp.queryagenticmemorystream.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryAgenticMemoryStreamRequest
* @Description 请求参数
*/
@Data
public class QueryAgenticMemoryStreamRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**用户ID
*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

    /**查询文本
*/
    @KsYunField(name="Query")
    private String Query;

    /**返回数量限制(1-200)
*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**场景ID*/
    @KsYunField(name="SceneId")
    private String SceneId;

    /**是否返回记忆关联的原始数据
*/
    @KsYunField(name="ReturnCitations")
    private Boolean ReturnCitations;

    /**信息发生时间范围（毫秒）（包含）*/
    @KsYunField(name="OccurredAfter")
    private Integer OccurredAfter;

    /**信息发生时间范围（毫秒）（不包含）*/
    @KsYunField(name="OccurredBefore")
    private Integer OccurredBefore;

    /**最大检索次数（1 - 5）
*/
    @KsYunField(name="MaxSteps")
    private Integer MaxSteps;

}
