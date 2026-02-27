package ksyun.client.aicp.describedocument.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDocumentRequest
* @Description 请求参数
*/
@Data
public class DescribeDocumentRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档 ID*/
    @KsYunField(name="DocumentId")
    private String DocumentId;

    /**返回内容粒度：all / only / without（默认 all）*/
    @KsYunField(name="Metadata")
    private String Metadata;

}
