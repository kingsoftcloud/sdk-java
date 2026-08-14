package ksyun.client.aicp.querymemoryhistory.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryMemoryHistoryRequest
* @Description 请求参数
*/
@Data
public class QueryMemoryHistoryRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆ID*/
    @KsYunField(name="MemoryId")
    private String MemoryId;

}
