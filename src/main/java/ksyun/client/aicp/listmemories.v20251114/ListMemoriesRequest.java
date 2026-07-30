package ksyun.client.aicp.listmemories.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListMemoriesRequest
* @Description 请求参数
*/
@Data
public class ListMemoriesRequest{
    /**记忆库 ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**查询的用户ID*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

    /**主题 ID*/
    @KsYunField(name="TopicId")
    private String TopicId;

    /**查询关键字*/
    @KsYunField(name="Query")
    private String Query;

    /**分页参数——页码  默认1*/
    @KsYunField(name="Page")
    private Long Page;

    /**分页参数——每页条数，默认10*/
    @KsYunField(name="PageSize")
    private Long PageSize;

    /**排序字段，默认 记忆创建时间
枚举值:
created_at  记忆创建时间
occurred_start  事件开始时间
occurred_end  事件结束时间
updated_at  记忆更新时间*/
    @KsYunField(name="SortBy")
    private String SortBy;

    /**排序方向，默认 desc
枚举值:
asc  升序
desc  降序*/
    @KsYunField(name="SortOrder")
    private String SortOrder;

    /**记忆创建时间下界（ms，闭区间）：仅返回创建时间 >= 该值的记忆，值须 >= 0*/
    @KsYunField(name="CreatedAfter")
    private Long CreatedAfter;

    /**记忆创建时间上界（ms，开区间）：仅返回创建时间 < 该值的记忆，值须 >= 0*/
    @KsYunField(name="CreatedBefore")
    private Long CreatedBefore;

    /**事件时间下界（ms，闭区间）：仅返回事件时间 >= 该值的记忆，值须 >= 0*/
    @KsYunField(name="OccurredAfter")
    private Long OccurredAfter;

    /**事件时间上界（ms，开区间）：仅返回事件时间 < 该值的记忆，值须 >= 0*/
    @KsYunField(name="OccurredBefore")
    private Long OccurredBefore;

}
