package ksyun.client.aicp.querymemorysdk.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMemorySdkRequest
* @Description 请求参数
*/
@Data
public class QueryMemorySdkRequest{
    /**查询文本
*/
    @KsYunField(name="Query")
    private String Query;

    /**场景ID，用来区分各个场景，提供精细化记忆提取策略
可选：
"_sys_work_assistant"、"_sys_travel_assistant"、"_sys_ai_chat_assistant"、"_sys_coding_assistant"、 "_sys_general"*/
    @KsYunField(name="SceneId")
    private String SceneId;

    /**记忆事实发生时间（毫秒），左边界*/
    @KsYunField(name="OccurredAfter")
    private Long OccurredAfter;

    /**记忆事实发生时间（毫秒），右边界*/
    @KsYunField(name="OccurredBefore")
    private Long OccurredBefore;

    /**检索方式：default（默认，性能型）、agentic（效果型）*/
    @KsYunField(name="Mode")
    private String Mode;

    /**是否返回记忆关联的原始数据*/
    @KsYunField(name="ReturnCitations")
    private Boolean ReturnCitations;

    /**返回数量限制*/
    @KsYunField(name="Limit")
    private Integer Limit;

    /**场景ID列表*/
    @KsYunField(name="SceneIds",type=2)
    private List<String> SceneIdsList;

    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**与Agent交互的用户唯一标识*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

}
