package ksyun.client.aicp.batchdisplaystatus.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchDisplayStatusRequest
* @Description 请求参数
*/
@Data
public class BatchDisplayStatusRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档 ID 列表（上限 100）*/
    @KsYunField(name="DocumentIds",type=2)
    private List<String> DocumentIdsList;

}
