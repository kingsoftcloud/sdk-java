package ksyun.client.aicp.updatememory.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateMemoryResponse
* @Description UpdateMemory 返回体
*/
@Data
@ToString
public class UpdateMemoryResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**记忆库ID*/
    @JsonProperty("MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆ID*/
    @JsonProperty("MemoryId")
    private String MemoryId;

}
