package ksyun.client.aicp.deleteknowledgebase.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteKnowledgeBaseRequest
* @Description 请求参数
*/
@Data
public class DeleteKnowledgeBaseRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

}
