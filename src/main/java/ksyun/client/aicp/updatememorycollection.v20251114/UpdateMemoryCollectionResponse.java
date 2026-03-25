package ksyun.client.aicp.updatememorycollection.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateMemoryCollectionResponse
* @Description UpdateMemoryCollection 返回体
*/
@Data
@ToString
public class UpdateMemoryCollectionResponse extends BaseResponseModel {

    /**修改的记忆库唯一 ID*/
    @JsonProperty("MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆库名称（修改接口不支持修改名称，返回原有）*/
    @JsonProperty("Name")
    private String Name;

}
