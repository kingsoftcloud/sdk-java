package ksyun.client.aicp.deletedocument.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDocumentRequest
* @Description 请求参数
*/
@Data
public class DeleteDocumentRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档 ID*/
    @KsYunField(name="DocumentId")
    private String DocumentId;

}
