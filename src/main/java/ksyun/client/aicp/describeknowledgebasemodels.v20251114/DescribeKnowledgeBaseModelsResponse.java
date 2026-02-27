package ksyun.client.aicp.describeknowledgebasemodels.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeKnowledgeBaseModelsResponse
* @Description DescribeKnowledgeBaseModels 返回体
*/
@Data
@ToString
public class DescribeKnowledgeBaseModelsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型列表*/
    @JsonProperty("Models")
    private List<ModelsDto> Models;

    @Data
    @ToString
    public static class ModelsDto {
        /**模型名称*/
        @JsonProperty("ModelName")
        private String ModelName;

        /**模型提供商*/
        @JsonProperty("ModelProvider")
        private String ModelProvider;

        /**模型类型*/
        @JsonProperty("ModelType")
        private String ModelType;

    }

}
