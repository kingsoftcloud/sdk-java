package ksyun.client.aicp.listmemorycollections.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListMemoryCollectionsRequest
* @Description 请求参数
*/
@Data
public class ListMemoryCollectionsRequest{
    /**秒级时间戳，筛选该时间后创建的记忆库*/
    @KsYunField(name="CreateTimeAfter")
    private Long CreateTimeAfter;

    /**秒级时间戳，筛选该时间前创建的记忆库*/
    @KsYunField(name="CreateTimeBefore")
    private Long CreateTimeBefore;

    /**秒级时间戳，筛选该时间后更新的记忆库*/
    @KsYunField(name="UpdateTimeAfter")
    private Long UpdateTimeAfter;

    /**秒级时间戳，筛选该时间前更新的记忆库*/
    @KsYunField(name="UpdateTimeBefore")
    private Long UpdateTimeBefore;

    /**记忆库唯一ID，精确查询*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆库名称，精确查询*/
    @KsYunField(name="Name")
    private String Name;

    /**名称关键词，模糊查询*/
    @KsYunField(name="NameKeyword")
    private String NameKeyword;

    /**状态，可选CreateFailed/Ready*/
    @KsYunField(name="Status")
    private String Status;

    /***/
    @KsYunField(name="Marker")
    private Long Marker;

    /***/
    @KsYunField(name="MaxResults")
    private Long MaxResults;

}
