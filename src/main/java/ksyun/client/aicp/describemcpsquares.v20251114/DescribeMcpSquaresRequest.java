package ksyun.client.aicp.describemcpsquares.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMcpSquaresRequest
* @Description 请求参数
*/
@Data
public class DescribeMcpSquaresRequest{
    /**MCP服务ID列表*/
    @KsYunField(name="McpServerIds",type=2)
    private List<String> McpServerIdsList;

    /**名称关键词*/
    @KsYunField(name="NameKeyword")
    private String NameKeyword;

}
