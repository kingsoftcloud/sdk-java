package ksyun.client.aicp.deletemetadata.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteMetadataRequest
* @Description 请求参数
*/
@Data
public class DeleteMetadataRequest{
    /**知识库ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**元数据ID*/
    @KsYunField(name="MetadataId")
    private String MetadataId;

}
