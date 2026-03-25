package ksyun.client.aicp.creatememorycollection.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMemoryCollectionResponse
* @Description CreateMemoryCollection 返回体
*/
@Data
@ToString
public class CreateMemoryCollectionResponse extends BaseResponseModel {

    /**创建后生成的记忆库唯一 ID*/
    @JsonProperty("MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆库状态；可选值：CreateFailed（创建失败）、Ready（可用）*/
    @JsonProperty("Status")
    private String Status;

}
