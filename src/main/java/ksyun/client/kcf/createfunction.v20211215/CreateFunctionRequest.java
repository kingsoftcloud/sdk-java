package ksyun.client.kcf.createfunction.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateFunctionRequest
* @Description 请求参数
*/
@Data
public class CreateFunctionRequest{
    /**函数ID*/
    @KsYunField(name="Id")
    private String Id;

    /**函数名称*/
    @KsYunField(name="Name")
    private String Name;

    /**命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**运行时环境，支持的值：Java8、Java11、Java17、Go1、Nodejs16、Nodejs14、Nodejs12、Nodejs10、Python3.10*/
    @KsYunField(name="Runtime")
    private String Runtime;

    /**应用端口  1 ≤ CaPort ≤ 65535*/
    @KsYunField(name="CaPort")
    private Integer CaPort;

    /**启动命令，如 ["./start.sh", "-c", "config.yaml"]， [ "python","python-test.py"]， [ "node","nodejs-test.js"], [ "java","-jar","demo.jar"]*/
    @KsYunField(name="StartupCommand",type=2)
    private List<String> StartupCommandList;

    /**函数描述 最多 32 个 Unicode 字符*/
    @KsYunField(name="Description")
    private String Description;

    /**函数超时时间，单位：秒，默认180秒 。若指定，需满足1 ≤ Timeout ≤ 86400*/
    @KsYunField(name="Timeout")
    private Integer Timeout;

    /**函数内存大小，单位：MB，默认512MB。若指定，若指定，必须满足 MemorySize ≤ 3072 且 MemorySize % 64 == 0*/
    @KsYunField(name="MemorySize")
    private Integer MemorySize;

    /**单实例并发数，默认1  1 ≤ SingleInstanceConcurrency ≤ 100；*/
    @KsYunField(name="SingleInstanceConcurrency")
    private Integer SingleInstanceConcurrency;

    /**是否允许访问公网，默认false*/
    @KsYunField(name="InternetAccess")
    private Boolean InternetAccess;

    /***/
    @KsYunField(name="Code")
    private CodeDto1 Code;

    @Data
    @ToString
    public static class CodeDto1 {
        /**代码包的KS3地址*/
        @KsYunField(name="SourceUrl")
        private String SourceUrl;

        /**KS3存储桶名称*/
        @KsYunField(name="Ks3BucketName")
        private String Ks3BucketName;

        /**KS3对象名称*/
        @KsYunField(name="Ks3ObjectName")
        private String Ks3ObjectName;

    }

    /**环境变量配置*/
    @KsYunField(name="Environment")
    private EnvironmentDto2 Environment;

    @Data
    @ToString
    public static class EnvironmentDto2 {
        /**环境变量键值对*/
        @KsYunField(name="Variables",type=2)
        private List<VariablesDto3> VariablesList;

        @Data
        @ToString
        public static class VariablesDto3 {
            /***/
            @KsYunField(name="Key")
            private String Key;

            /***/
            @KsYunField(name="Value")
            private String Value;

        }

    }

    /**VPC配置信息*/
    @KsYunField(name="VpcConfig")
    private VpcConfigDto4 VpcConfig;

    @Data
    @ToString
    public static class VpcConfigDto4 {
        /**是否启用VPC*/
        @KsYunField(name="EnableVpc")
        private Boolean EnableVpc;

        /**VPC ID*/
        @KsYunField(name="VpcId")
        private String VpcId;

        /**子网ID*/
        @KsYunField(name="SubnetId")
        private String SubnetId;

        /**安全组ID*/
        @KsYunField(name="SgId")
        private String SgId;

        /**子网CIDR块*/
        @KsYunField(name="CidrBlock")
        private String CidrBlock;

        /**VPC CIDR块*/
        @KsYunField(name="VpcCidrBlock")
        private String VpcCidrBlock;

    }

    /**日志配置信息*/
    @KsYunField(name="LogConfig")
    private LogConfigDto5 LogConfig;

    @Data
    @ToString
    public static class LogConfigDto5 {
        /**是否启用日志服务*/
        @KsYunField(name="EnableKlog")
        private Boolean EnableKlog;

        /**日志项目名称*/
        @KsYunField(name="Project")
        private String Project;

        /**日志池名称*/
        @KsYunField(name="LogPool")
        private String LogPool;

    }

    /**存活探针配置*/
    @KsYunField(name="LivenessProbeConfig")
    private LivenessProbeConfigDto6 LivenessProbeConfig;

    @Data
    @ToString
    public static class LivenessProbeConfigDto6 {
        /**HTTP探针配置*/
        @KsYunField(name="HTTPGet")
        private HTTPGetDto7 HTTPGet;

        @Data
        @ToString
        public static class HTTPGetDto7 {
            /**协议，http*/
            @KsYunField(name="Protocol")
            private String Protocol;

            /**探测路径*/
            @KsYunField(name="Path")
            private String Path;

            /**探测端口*/
            @KsYunField(name="Port")
            private Integer Port;

            /**超时时间，单位秒*/
            @KsYunField(name="TimeoutSeconds")
            private Integer TimeoutSeconds;

        }

    }

    /**就绪探针配置*/
    @KsYunField(name="ReadinessProbeConfig")
    private ReadinessProbeConfigDto8 ReadinessProbeConfig;

    @Data
    @ToString
    public static class ReadinessProbeConfigDto8 {
        /**HTTP探针配置*/
        @KsYunField(name="HTTPGet")
        private HTTPGetDto9 HTTPGet;

        @Data
        @ToString
        public static class HTTPGetDto9 {
            /**协议，http*/
            @KsYunField(name="Protocol")
            private String Protocol;

            /**探测路径*/
            @KsYunField(name="Path")
            private String Path;

            /**超时时间，单位秒*/
            @KsYunField(name="TimeoutSeconds")
            private Integer TimeoutSeconds;

            /**探测端口*/
            @KsYunField(name="Port")
            private Integer Port;

        }

    }

    /**Layer列表，格式为“name#version”，如 “layer#1”*/
    @KsYunField(name="Layers",type=2)
    private List<String> LayersList;

}
