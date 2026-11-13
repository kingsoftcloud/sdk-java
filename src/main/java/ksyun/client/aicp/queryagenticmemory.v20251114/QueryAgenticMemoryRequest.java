package ksyun.client.aicp.queryagenticmemory.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryAgenticMemoryRequest
* @Description 请求参数
*/
@Data
public class QueryAgenticMemoryRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**用户ID*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

    /**搜索的内容
>= 1 字符
<= 512 字符*/
    @KsYunField(name="Query")
    private String Query;

    /**场景ID   默认值:
_sys_general*/
    @KsYunField(name="SceneId")
    private String SceneId;

    /**信息发生时间范围（毫秒）  包含*/
    @KsYunField(name="OccurredAfter")
    private Long OccurredAfter;

    /**信息发生时间范围（毫秒）  不包含*/
    @KsYunField(name="OccurredBefore")
    private Long OccurredBefore;

    /**是否返回记忆关联的原始数据  默认值:
false*/
    @KsYunField(name="ReturnCitations")
    private Boolean ReturnCitations;

    /**返回数量限制  默认值:
20
>= 1
<= 200*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**最大检索次数  
>= 1
<= 5
默认值:
2*/
    @KsYunField(name="MaxSteps")
    private Integer MaxSteps;

}
