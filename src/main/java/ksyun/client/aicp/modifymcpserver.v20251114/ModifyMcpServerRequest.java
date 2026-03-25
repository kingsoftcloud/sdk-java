package ksyun.client.aicp.modifymcpserver.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyMcpServerRequest
* @Description 请求参数
*/
@Data
public class ModifyMcpServerRequest{
    /**MCP服务ID（必填）*/
    @KsYunField(name="McpServerId")
    private String McpServerId;

    /**MCP服务名称（1-64字符）*/
    @KsYunField(name="McpServerName")
    private String McpServerName;

    /**描述（1-255字符）*/
    @KsYunField(name="Description")
    private String Description;

    /**介绍*/
    @KsYunField(name="Introduction")
    private String Introduction;

    /**后端服务出向认证字段值*/
    @KsYunField(name="OutboundAuthFieldValue")
    private String OutboundAuthFieldValue;

    /**HTTP API配置（McpType=HttpToMcp时必填，base64格式）*/
    @KsYunField(name="HttpApiConfig")
    private String HttpApiConfig;

    /**HTTP API配置更新方式：Ignore / Replace（工具名称相同时，Ignore=忽略，Replace=替换更新）*/
    @KsYunField(name="HttpApiConfigUpdateType")
    private String HttpApiConfigUpdateType;

}
