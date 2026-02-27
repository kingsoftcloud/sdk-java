package ksyun.client.aicp.activateknowledgebaseservice.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ActivateKnowledgeBaseServiceResponse
* @Description ActivateKnowledgeBaseService 返回体
*/
@Data
@ToString
public class ActivateKnowledgeBaseServiceResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

}
