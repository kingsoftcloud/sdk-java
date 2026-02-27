package ksyun.client.aicp.describeknowledgebase.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeKnowledgeBaseRequest
* @Description 请求参数
*/
@Data
public class DescribeKnowledgeBaseRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

}
