package ksyun.client.aicp.modifydocumentstatus.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyDocumentStatusRequest
* @Description 请求参数
*/
@Data
public class ModifyDocumentStatusRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档 ID*/
    @KsYunField(name="DocumentId")
    private String DocumentId;

    /**文档状态：enable（启用）/ disable（禁用）*/
    @KsYunField(name="Status")
    private String Status;

}
