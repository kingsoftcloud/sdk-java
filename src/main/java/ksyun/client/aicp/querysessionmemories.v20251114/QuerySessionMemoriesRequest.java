package ksyun.client.aicp.querysessionmemories.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QuerySessionMemoriesRequest
* @Description 请求参数
*/
@Data
public class QuerySessionMemoriesRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**对话ID，区分多个对话*/
    @KsYunField(name="SessionId")
    private String SessionId;

}
