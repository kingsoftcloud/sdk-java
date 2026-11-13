package ksyun.client.aicp.listversions.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListVersionsRequest
* @Description 请求参数
*/
@Data
public class ListVersionsRequest{
    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="Page")
    private Integer Page;

    /***/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
