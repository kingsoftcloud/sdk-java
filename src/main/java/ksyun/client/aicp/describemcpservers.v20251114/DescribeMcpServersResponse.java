package ksyun.client.aicp.describemcpservers.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMcpServersResponse
* @Description DescribeMcpServers 返回体
*/
@Data
@ToString
public class DescribeMcpServersResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**MCP服务列表*/
    @JsonProperty("McpServers")
    private List<McpServersDto> McpServers;

    @Data
    @ToString
    public static class McpServersDto {
        /**MCP服务ID*/
        @JsonProperty("McpServerId")
        private String McpServerId;

        /**MCP服务名称*/
        @JsonProperty("McpServerName")
        private String McpServerName;

        /**状态*/
        @JsonProperty("State")
        private String State;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**MCP服务英文名称*/
        @JsonProperty("McpServerNameEn")
        private String McpServerNameEn;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**介绍*/
        @JsonProperty("Introduction")
        private String Introduction;

        /**参数配置*/
        @JsonProperty("ParamConfig")
        private String ParamConfig;

        /**服务协议：SSE / StreamableHTTP*/
        @JsonProperty("ServiceProtocol")
        private String ServiceProtocol;

        /**工具列表*/
        @JsonProperty("Tools")
        private String Tools;

        /**是否已激活*/
        @JsonProperty("IsActivated")
        private Boolean IsActivated;

        /**是否允许自定义认证*/
        @JsonProperty("AllowCustomAuth")
        private Boolean AllowCustomAuth;

        /**MCP类型：Proxy / HttpToMcp / ProxyRuntime*/
        @JsonProperty("McpType")
        private String McpType;

        /**MCP状态*/
        @JsonProperty("McpStatus")
        private String McpStatus;

        /**MCP状态描述*/
        @JsonProperty("McpStatusMsg")
        private String McpStatusMsg;

        /**后端服务出向认证位置：Query / Header*/
        @JsonProperty("OutboundAuthLocation")
        private String OutboundAuthLocation;

        /**后端服务出向认证字段名*/
        @JsonProperty("OutboundAuthFieldName")
        private String OutboundAuthFieldName;

    }

}
