package ksyun.client.aicp.indexingstatus.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname IndexingStatusRequest
* @Description 请求参数
*/
@Data
public class IndexingStatusRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**上传批次号*/
    @KsYunField(name="Batch")
    private String Batch;

}
