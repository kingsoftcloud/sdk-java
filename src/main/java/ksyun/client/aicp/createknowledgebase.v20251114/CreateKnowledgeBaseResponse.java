package ksyun.client.aicp.createknowledgebase.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateKnowledgeBaseResponse
* @Description CreateKnowledgeBase 返回体
*/
@Data
@ToString
public class CreateKnowledgeBaseResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**新建知识库 ID*/
    @JsonProperty("Id")
    private String Id;

}
