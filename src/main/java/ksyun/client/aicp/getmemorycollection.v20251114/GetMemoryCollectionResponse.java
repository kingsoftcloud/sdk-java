package ksyun.client.aicp.getmemorycollection.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetMemoryCollectionResponse
* @Description GetMemoryCollection 返回体
*/
@Data
@ToString
public class GetMemoryCollectionResponse extends BaseResponseModel {

    /**记忆库唯一 ID*/
    @JsonProperty("MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆库名称*/
    @JsonProperty("Name")
    private String Name;

    /**记忆库描述信息*/
    @JsonProperty("Description")
    private String Description;

    /**记忆库状态；可选值：CreateFailed/Ready*/
    @JsonProperty("Status")
    private String Status;

    /**记忆库创建时间，秒级时间戳*/
    @JsonProperty("CreateTime")
    private String CreateTime;

    /**记忆库最后更新时间，秒级时间戳*/
    @JsonProperty("LastUpdateTime")
    private String LastUpdateTime;

    /**记忆库所属地域*/
    @JsonProperty("Region")
    private String Region;

}
