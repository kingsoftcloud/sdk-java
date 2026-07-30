package ksyun.client.aicp.getsandboxinstance.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSandboxInstanceResponse
* @Description GetSandboxInstance 返回体
*/
@Data
@ToString
public class GetSandboxInstanceResponse extends BaseResponseModel {

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
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("TemplateId")
        private String TemplateId;

        /***/
        @JsonProperty("TemplateType")
        private String TemplateType;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("CustomConfiguration")
        private DataCustomConfigurationDto CustomConfiguration;

        @Data
        @ToString
        public static class DataCustomConfigurationDto {
            /***/
            @JsonProperty("ImageUrl")
            private String ImageUrl;

            /***/
            @JsonProperty("Port")
            private Integer Port;

            /***/
            @JsonProperty("Command")
            private String Command;

            /***/
            @JsonProperty("Envs")
            private List<DataCustomConfigurationEnvsDto> Envs;

            @Data
            @ToString
            public static class DataCustomConfigurationEnvsDto {
                /***/
                @JsonProperty("Key")
                private String Key;

                /***/
                @JsonProperty("Value")
                private String Value;

            }

        }

        /***/
        @JsonProperty("Timeout")
        private Integer Timeout;

        /***/
        @JsonProperty("EndTime")
        private String EndTime;

        /***/
        @JsonProperty("Envs")
        private List<DataEnvsDto> Envs;

        @Data
        @ToString
        public static class DataEnvsDto {
            /***/
            @JsonProperty("Key")
            private String Key;

            /***/
            @JsonProperty("Value")
            private String Value;

        }

        /***/
        @JsonProperty("Ks3MountConfig")
        private DataKs3MountConfigDto Ks3MountConfig;

        @Data
        @ToString
        public static class DataKs3MountConfigDto {
            /***/
            @JsonProperty("Ks3Enable")
            private Boolean Ks3Enable;

            /***/
            @JsonProperty("Ks3MountPoints")
            private List<DataKs3MountConfigKs3MountPointsDto> Ks3MountPoints;

            @Data
            @ToString
            public static class DataKs3MountConfigKs3MountPointsDto {
                /***/
                @JsonProperty("BucketName")
                private String BucketName;

                /***/
                @JsonProperty("RemotePath")
                private String RemotePath;

                /***/
                @JsonProperty("LocalMountPath")
                private String LocalMountPath;

                /***/
                @JsonProperty("ReadOnly")
                private Boolean ReadOnly;

            }

        }

        /***/
        @JsonProperty("KpfsMountConfig")
        private DataKpfsMountConfigDto KpfsMountConfig;

        @Data
        @ToString
        public static class DataKpfsMountConfigDto {
            /***/
            @JsonProperty("KpfsEnable")
            private Boolean KpfsEnable;

            /***/
            @JsonProperty("KpfsMountPoints")
            private List<DataKpfsMountConfigKpfsMountPointsDto> KpfsMountPoints;

            @Data
            @ToString
            public static class DataKpfsMountConfigKpfsMountPointsDto {
                /***/
                @JsonProperty("FileSystemName")
                private String FileSystemName;

                /***/
                @JsonProperty("RemotePath")
                private String RemotePath;

                /***/
                @JsonProperty("LocalMountPath")
                private String LocalMountPath;

                /***/
                @JsonProperty("ReadOnly")
                private Boolean ReadOnly;

            }

        }

    }

}
