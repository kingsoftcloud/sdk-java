package ksyun.client.aicp.createmcpserver.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMcpServerRequest
* @Description 请求参数
*/
@Data
public class CreateMcpServerRequest{
    /**MCP服务名称（必填，1-64字符）*/
    @KsYunField(name="McpServerName")
    private String McpServerName;

    /**MCP服务英文名称（必填，英文/数字/下划线/中划线，1-64字符）*/
    @KsYunField(name="McpServerNameEn")
    private String McpServerNameEn;

    /**描述（1-255字符）*/
    @KsYunField(name="Description")
    private String Description;

    /**介绍*/
    @KsYunField(name="Introduction")
    private String Introduction;

    /**服务协议：SSE / StreamableHTTP*/
    @KsYunField(name="ServiceProtocol")
    private String ServiceProtocol;

    /**后端服务URL*/
    @KsYunField(name="BackendServiceUrl")
    private String BackendServiceUrl;

    /**是否允许自定义认证*/
    @KsYunField(name="AllowCustomAuth")
    private Boolean AllowCustomAuth;

    /**服务自定义请求头*/
    @KsYunField(name="ServiceCustomHeaders")
    private String ServiceCustomHeaders;

    /**后端服务出向认证位置：Query / Header*/
    @KsYunField(name="OutboundAuthLocation")
    private String OutboundAuthLocation;

    /**后端服务出向认证字段名*/
    @KsYunField(name="OutboundAuthFieldName")
    private String OutboundAuthFieldName;

    /**后端服务出向认证字段值*/
    @KsYunField(name="OutboundAuthFieldValue")
    private String OutboundAuthFieldValue;

    /**MCP运行时配置（McpType=ProxyRuntime时必填）*/
    @KsYunField(name="McpRuntimeConfig")
    private McpRuntimeConfigDto McpRuntimeConfig;

    @Data
    @ToString
    public static class McpRuntimeConfigDto {
        /**代码来源：Ks3 / Images*/
        @KsYunField(name="CodeFrom")
        private String CodeFrom;

        /**KS3配置项*/
        @KsYunField(name="Ks3Config")
        private McpRuntimeConfigKs3ConfigDto Ks3Config;

        @Data
        @ToString
        public static class McpRuntimeConfigKs3ConfigDto {
            /**KS3路径*/
            @KsYunField(name="Path")
            private String Path;

        }

        /**容器镜像配置项*/
        @KsYunField(name="ImagesConfig")
        private McpRuntimeConfigImagesConfigDto ImagesConfig;

        @Data
        @ToString
        public static class McpRuntimeConfigImagesConfigDto {
            /**镜像类型：Personal / Enterprise*/
            @KsYunField(name="ImageType")
            private String ImageType;

            /**命名空间*/
            @KsYunField(name="NameSpace")
            private String NameSpace;

            /**镜像仓库*/
            @KsYunField(name="ImageRepo")
            private String ImageRepo;

            /**镜像版本*/
            @KsYunField(name="ImageVersion")
            private String ImageVersion;

            /**企业实例ID*/
            @KsYunField(name="EnterpriseInstanceId")
            private String EnterpriseInstanceId;

            /**企业实例名称*/
            @KsYunField(name="EnterpriseInstanceName")
            private String EnterpriseInstanceName;

            /**用户名*/
            @KsYunField(name="UserName")
            private String UserName;

            /**密码*/
            @KsYunField(name="Password")
            private String Password;

        }

        /**资源配置项*/
        @KsYunField(name="Resource")
        private McpRuntimeConfigResourceDto Resource;

        @Data
        @ToString
        public static class McpRuntimeConfigResourceDto {
            /**CPU配置*/
            @KsYunField(name="Cpu")
            private Integer Cpu;

            /**内存配置*/
            @KsYunField(name="Memory")
            private Integer Memory;

        }

        /**高级配置项*/
        @KsYunField(name="Advanced")
        private McpRuntimeConfigAdvancedDto Advanced;

        @Data
        @ToString
        public static class McpRuntimeConfigAdvancedDto {
            /**环境变量列表*/
            @KsYunField(name="EnvironmentVariables",type=2)
            private List<McpRuntimeConfigAdvancedEnvironmentVariablesDto> EnvironmentVariablesList;

            @Data
            @ToString
            public static class McpRuntimeConfigAdvancedEnvironmentVariablesDto {
                /**变量名*/
                @KsYunField(name="Key")
                private String Key;

                /**变量值*/
                @KsYunField(name="Value")
                private String Value;

            }

        }

    }

    /**HTTP API配置（McpType=HttpToMcp时必填，base64格式）*/
    @KsYunField(name="HttpApiConfig")
    private String HttpApiConfig;

    /**MCP类型：Proxy / HttpToMcp / ProxyRuntime）*/
    @KsYunField(name="McpType")
    private String McpType;

}
