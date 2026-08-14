package ksyun.client.aicp.updatememory.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateMemoryRequest
* @Description 请求参数
*/
@Data
public class UpdateMemoryRequest{
    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆ID*/
    @KsYunField(name="MemoryId")
    private String MemoryId;

    /**记忆内容*/
    @KsYunField(name="Content")
    private String Content;

    /**用户ID*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

}
