package ksyun.client.aicp.deletememorycollection.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteMemoryCollectionResponse
* @Description DeleteMemoryCollection 返回体
*/
@Data
@ToString
public class DeleteMemoryCollectionResponse extends BaseResponseModel {

    /**被删除的记忆库唯一 ID*/
    @JsonProperty("MemoryCollectionId")
    private String MemoryCollectionId;

}
