package ksyun.client.aicp.getsandboxtemplate.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSandboxTemplateResponse
* @Description GetSandboxTemplate 返回体
*/
@Data
@ToString
public class GetSandboxTemplateResponse extends BaseResponseModel {

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
        @JsonProperty("TemplateId")
        private String TemplateId;

        /***/
        @JsonProperty("TemplateName")
        private String TemplateName;

        /***/
        @JsonProperty("Command")
        private String Command;

        /***/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /***/
        @JsonProperty("Description")
        private String Description;

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
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("TemplateType")
        private String TemplateType;

        /***/
        @JsonProperty("CanDelete")
        private Boolean CanDelete;

        /***/
        @JsonProperty("TemplateCategory")
        private String TemplateCategory;

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

        /***/
        @JsonProperty("Ports")
        private List<Integer> Ports;

        /***/
        @JsonProperty("PreheatConfig")
        private DataPreheatConfigDto PreheatConfig;

        @Data
        @ToString
        public static class DataPreheatConfigDto {
            /***/
            @JsonProperty("PreheatEnable")
            private Boolean PreheatEnable;

            /***/
            @JsonProperty("PreheatNumber")
            private Integer PreheatNumber;

            /***/
            @JsonProperty("PreheatedInstanceNumber")
            private Integer PreheatedInstanceNumber;

        }

        /***/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

        /***/
        @JsonProperty("KlogConfig")
        private DataKlogConfigDto KlogConfig;

        @Data
        @ToString
        public static class DataKlogConfigDto {
            /***/
            @JsonProperty("KlogEnable")
            private Boolean KlogEnable;

            /***/
            @JsonProperty("KlogProjectName")
            private String KlogProjectName;

            /***/
            @JsonProperty("KlogPoolName")
            private String KlogPoolName;

        }

        /***/
        @JsonProperty("NetworkConfig")
        private DataNetworkConfigDto NetworkConfig;

        @Data
        @ToString
        public static class DataNetworkConfigDto {
            /***/
            @JsonProperty("PublicNetworkEnable")
            private Boolean PublicNetworkEnable;

            /***/
            @JsonProperty("PrivateNetworkEnable")
            private Boolean PrivateNetworkEnable;

            /***/
            @JsonProperty("SharedInternetAccessEnable")
            private Boolean SharedInternetAccessEnable;

            /***/
            @JsonProperty("VpcConfiguration")
            private DataNetworkConfigVpcConfigurationDto VpcConfiguration;

            @Data
            @ToString
            public static class DataNetworkConfigVpcConfigurationDto {
                /***/
                @JsonProperty("VpcId")
                private String VpcId;

                /***/
                @JsonProperty("SubnetId")
                private String SubnetId;

            }

        }

        /***/
        @JsonProperty("ImageConfig")
        private DataImageConfigDto ImageConfig;

        @Data
        @ToString
        public static class DataImageConfigDto {
            /***/
            @JsonProperty("ImageUrl")
            private String ImageUrl;

            /***/
            @JsonProperty("ImageTag")
            private String ImageTag;

            /***/
            @JsonProperty("ImageSource")
            private String ImageSource;

        }

        /***/
        @JsonProperty("SkillConfig")
        private DataSkillConfigDto SkillConfig;

        @Data
        @ToString
        public static class DataSkillConfigDto {
            /***/
            @JsonProperty("SkillEnable")
            private Boolean SkillEnable;

            /***/
            @JsonProperty("SkillSpaceIds")
            private List<String> SkillSpaceIds;

            /***/
            @JsonProperty("PublicSkillEnable")
            private Boolean PublicSkillEnable;

        }

        /***/
        @JsonProperty("AccessKey")
        private String AccessKey;

        /***/
        @JsonProperty("InstanceQuota")
        private Integer InstanceQuota;

        /***/
        @JsonProperty("RemainingInstanceQuota")
        private Integer RemainingInstanceQuota;

        /***/
        @JsonProperty("RemainingSystemInstanceQuota")
        private Integer RemainingSystemInstanceQuota;

        /***/
        @JsonProperty("KecConfig")
        private DataKecConfigDto KecConfig;

        @Data
        @ToString
        public static class DataKecConfigDto {
            /***/
            @JsonProperty("KecEnable")
            private Boolean KecEnable;

            /***/
            @JsonProperty("InstanceSpecs")
            private List<DataKecConfigInstanceSpecsDto> InstanceSpecs;

            @Data
            @ToString
            public static class DataKecConfigInstanceSpecsDto {
                /***/
                @JsonProperty("InstanceType")
                private String InstanceType;

                /***/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /***/
                @JsonProperty("Memory")
                private Integer Memory;

                /***/
                @JsonProperty("SystemDisk")
                private DataKecConfigInstanceSpecsSystemDiskDto SystemDisk;

                @Data
                @ToString
                public static class DataKecConfigInstanceSpecsSystemDiskDto {
                    /***/
                    @JsonProperty("Type")
                    private String Type;

                    /***/
                    @JsonProperty("Size")
                    private Integer Size;

                }

                /***/
                @JsonProperty("DataDisks")
                private List<DataKecConfigInstanceSpecsDataDisksDto> DataDisks;

                @Data
                @ToString
                public static class DataKecConfigInstanceSpecsDataDisksDto {
                    /***/
                    @JsonProperty("Type")
                    private String Type;

                    /***/
                    @JsonProperty("Size")
                    private Integer Size;

                    /***/
                    @JsonProperty("DeleteWithInstance")
                    private Boolean DeleteWithInstance;

                    /***/
                    @JsonProperty("Path")
                    private String Path;

                }

            }

        }

    }

}
