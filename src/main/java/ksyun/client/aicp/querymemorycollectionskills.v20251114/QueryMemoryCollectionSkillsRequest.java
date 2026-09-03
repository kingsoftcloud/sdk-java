package ksyun.client.aicp.querymemorycollectionskills.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMemoryCollectionSkillsRequest
* @Description 请求参数
*/
@Data
public class QueryMemoryCollectionSkillsRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

}
