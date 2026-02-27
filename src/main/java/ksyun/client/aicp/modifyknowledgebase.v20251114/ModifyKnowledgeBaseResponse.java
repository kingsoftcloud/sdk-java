package ksyun.client.aicp.modifyknowledgebase.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyKnowledgeBaseResponse
* @Description ModifyKnowledgeBase 返回体
*/
@Data
@ToString
public class ModifyKnowledgeBaseResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**知识库 ID*/
    @JsonProperty("Id")
    private String Id;

}
