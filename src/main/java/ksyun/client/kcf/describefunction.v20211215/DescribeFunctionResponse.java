package ksyun.client.kcf.describefunction.v20211215;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFunctionResponse
* @Description DescribeFunction 返回体
*/
@Data
@ToString
public class DescribeFunctionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Id")
        private String Id;

        /***/
        @JsonProperty("Namespace")
        private String Namespace;

        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("Runtime")
        private String Runtime;

        /***/
        @JsonProperty("Code")
        private DataCodeDto Code;

        @Data
        @ToString
        public static class DataCodeDto {
            /***/
            @JsonProperty("TempKs3ObjectName")
            private String TempKs3ObjectName;

        }

        /***/
        @JsonProperty("Timeout")
        private Integer Timeout;

        /***/
        @JsonProperty("SingleInstanceConcurrency")
        private Integer SingleInstanceConcurrency;

        /***/
        @JsonProperty("MemorySize")
        private Integer MemorySize;

        /***/
        @JsonProperty("InternetAccess")
        private Boolean InternetAccess;

        /***/
        @JsonProperty("VpcConfig")
        private DataVpcConfigDto VpcConfig;

        @Data
        @ToString
        public static class DataVpcConfigDto {
            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("SgId")
            private String SgId;

            /***/
            @JsonProperty("EnableVpc")
            private Boolean EnableVpc;

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

            /***/
            @JsonProperty("Subnets")
            private List<DataVpcConfigSubnetsDto> Subnets;

            @Data
            @ToString
            public static class DataVpcConfigSubnetsDto {
                /***/
                @JsonProperty("SubnetId")
                private String SubnetId;

                /***/
                @JsonProperty("SgId")
                private String SgId;

                /***/
                @JsonProperty("CidrBlock")
                private String CidrBlock;

                /***/
                @JsonProperty("AvailabilityZone")
                private String AvailabilityZone;

            }

            /***/
            @JsonProperty("VpcCidrBlock")
            private String VpcCidrBlock;

        }

        /***/
        @JsonProperty("LogConfig")
        private DataLogConfigDto LogConfig;

        @Data
        @ToString
        public static class DataLogConfigDto {
            /***/
            @JsonProperty("EnableKlog")
            private Boolean EnableKlog;

            /***/
            @JsonProperty("Project")
            private String Project;

            /***/
            @JsonProperty("LogPool")
            private String LogPool;

        }

        /***/
        @JsonProperty("LivenessProbeConfig")
        private DataLivenessProbeConfigDto LivenessProbeConfig;

        @Data
        @ToString
        public static class DataLivenessProbeConfigDto {
            /***/
            @JsonProperty("HTTPGet")
            private DataLivenessProbeConfigHTTPGetDto HTTPGet;

            @Data
            @ToString
            public static class DataLivenessProbeConfigHTTPGetDto {
                /***/
                @JsonProperty("Protocol")
                private String Protocol;

                /***/
                @JsonProperty("Path")
                private String Path;

                /***/
                @JsonProperty("Port")
                private Integer Port;

                /***/
                @JsonProperty("TimeoutSeconds")
                private Integer TimeoutSeconds;

            }

        }

        /***/
        @JsonProperty("ReadinessProbeConfig")
        private DataReadinessProbeConfigDto ReadinessProbeConfig;

        @Data
        @ToString
        public static class DataReadinessProbeConfigDto {
            /***/
            @JsonProperty("HTTPGet")
            private DataReadinessProbeConfigHTTPGetDto HTTPGet;

            @Data
            @ToString
            public static class DataReadinessProbeConfigHTTPGetDto {
                /***/
                @JsonProperty("Protocol")
                private String Protocol;

                /***/
                @JsonProperty("Path")
                private String Path;

                /***/
                @JsonProperty("Port")
                private Integer Port;

                /***/
                @JsonProperty("TimeoutSeconds")
                private Integer TimeoutSeconds;

            }

        }

        /***/
        @JsonProperty("AsyncConfig")
        private DataAsyncConfigDto AsyncConfig;

        @Data
        @ToString
        public static class DataAsyncConfigDto {
            /***/
            @JsonProperty("RetryEnable")
            private Boolean RetryEnable;

        }

        /***/
        @JsonProperty("CaPort")
        private Integer CaPort;

        /***/
        @JsonProperty("StartupCommand")
        private List<String> StartupCommand;

        /***/
        @JsonProperty("State")
        private String State;

        /***/
        @JsonProperty("CodeType")
        private String CodeType;

        /***/
        @JsonProperty("CustomContainerConfig")
        private DataCustomContainerConfigDto CustomContainerConfig;

        @Data
        @ToString
        public static class DataCustomContainerConfigDto {
            /***/
            @JsonProperty("Image")
            private String Image;

            /***/
            @JsonProperty("ImageName")
            private String ImageName;

            /***/
            @JsonProperty("Version")
            private String Version;

        }

    }

}
