package ksyun.client.aicp.deletememorycollection.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteMemoryCollectionRequest
* @Description 请求参数
*/
@Data
public class DeleteMemoryCollectionRequest{
    /**待删除的记忆库唯一 ID，不可为空*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

}
