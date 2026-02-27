package ksyun.client.aicp.describeknowledgebasemodels.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKnowledgeBaseModelsRequest
* @Description 请求参数
*/
@Data
public class DescribeKnowledgeBaseModelsRequest{
    /**模型类型：llm|text-embedding|rerank*/
    @KsYunField(name="ModelType")
    private String ModelType;

}
