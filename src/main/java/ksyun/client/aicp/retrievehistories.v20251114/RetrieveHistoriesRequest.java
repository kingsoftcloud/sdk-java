package ksyun.client.aicp.retrievehistories.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname RetrieveHistoriesRequest
* @Description 请求参数
*/
@Data
public class RetrieveHistoriesRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**页码（1-1000，默认 1）*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页条数（1-100，默认 20）*/
    @KsYunField(name="Limit")
    private Integer Limit;

}
