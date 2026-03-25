package ksyun.client.aicp.describemcpofficialservers.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeMcpOfficialServersRequest
* @Description 请求参数
*/
@Data
public class DescribeMcpOfficialServersRequest{
    /**MCP服务ID列表*/
    @KsYunField(name="McpServerIds",type=2)
    private List<String> McpServerIdsList;

    /**名称关键词*/
    @KsYunField(name="NameKeyword")
    private String NameKeyword;

    /**区域*/
    @KsYunField(name="Region")
    private String Region;

}
