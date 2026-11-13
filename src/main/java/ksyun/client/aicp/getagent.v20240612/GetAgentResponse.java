package ksyun.client.aicp.getagent.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetAgentResponse
* @Description GetAgent 返回体
*/
@Data
@ToString
public class GetAgentResponse extends BaseResponseModel {

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
        @JsonProperty("QuickAccess")
        private DataQuickAccessDto QuickAccess;

        @Data
        @ToString
        public static class DataQuickAccessDto {
            /***/
            @JsonProperty("PublicEndpoint")
            private String PublicEndpoint;

            /***/
            @JsonProperty("PrivateEndpoint")
            private String PrivateEndpoint;

            /***/
            @JsonProperty("ApiKey")
            private String ApiKey;

        }

        /***/
        @JsonProperty("Basic")
        private DataBasicDto Basic;

        @Data
        @ToString
        public static class DataBasicDto {
            /***/
            @JsonProperty("AgentId")
            private String AgentId;

            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("Name")
            private String Name;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("Phase")
            private String Phase;

            /***/
            @JsonProperty("Message")
            private String Message;

            /***/
            @JsonProperty("FreezeDeadline")
            private String FreezeDeadline;

            /***/
            @JsonProperty("FreezeReason")
            private String FreezeReason;

            /***/
            @JsonProperty("Replicas")
            private Integer Replicas;

            /***/
            @JsonProperty("ReadyReplicas")
            private Integer ReadyReplicas;

            /***/
            @JsonProperty("Creator")
            private String Creator;

            /***/
            @JsonProperty("IsPrivate")
            private Boolean IsPrivate;

            /***/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /***/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

        /***/
        @JsonProperty("Deployment")
        private DataDeploymentDto Deployment;

        @Data
        @ToString
        public static class DataDeploymentDto {
            /***/
            @JsonProperty("DeploymentType")
            private String DeploymentType;

            /***/
            @JsonProperty("ArtifactPath")
            private String ArtifactPath;

            /***/
            @JsonProperty("Framework")
            private String Framework;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("Resource")
            private DataDeploymentResourceDto Resource;

            @Data
            @ToString
            public static class DataDeploymentResourceDto {
                /***/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /***/
                @JsonProperty("Memory")
                private Integer Memory;

            }

            /***/
            @JsonProperty("Scaling")
            private DataDeploymentScalingDto Scaling;

            @Data
            @ToString
            public static class DataDeploymentScalingDto {
                /***/
                @JsonProperty("MinReplicas")
                private Integer MinReplicas;

                /***/
                @JsonProperty("MaxReplicas")
                private Integer MaxReplicas;

                /***/
                @JsonProperty("QpsPerInstance")
                private Integer QpsPerInstance;

            }

            /***/
            @JsonProperty("Storage")
            private DataDeploymentStorageDto Storage;

            @Data
            @ToString
            public static class DataDeploymentStorageDto {
                /***/
                @JsonProperty("MountPath")
                private String MountPath;

                /***/
                @JsonProperty("SizeGi")
                private Integer SizeGi;

            }

            /***/
            @JsonProperty("KS3MountConfig")
            private DataDeploymentKS3MountConfigDto KS3MountConfig;

            @Data
            @ToString
            public static class DataDeploymentKS3MountConfigDto {
                /***/
                @JsonProperty("BucketName")
                private String BucketName;

                /***/
                @JsonProperty("BucketPath")
                private String BucketPath;

                /***/
                @JsonProperty("Endpoint")
                private String Endpoint;

                /***/
                @JsonProperty("MountDir")
                private String MountDir;

                /***/
                @JsonProperty("ReadOnly")
                private Boolean ReadOnly;

                /***/
                @JsonProperty("AkId")
                private String AkId;

                /***/
                @JsonProperty("AkSecret")
                private String AkSecret;

            }

            /***/
            @JsonProperty("SessionAffinity")
            private DataDeploymentSessionAffinityDto SessionAffinity;

            @Data
            @ToString
            public static class DataDeploymentSessionAffinityDto {
                /***/
                @JsonProperty("Enabled")
                private Boolean Enabled;

                /***/
                @JsonProperty("Type")
                private String Type;

                /***/
                @JsonProperty("MaxAge")
                private Integer MaxAge;

            }

            /***/
            @JsonProperty("CodeConfig")
            private DataDeploymentCodeConfigDto CodeConfig;

            @Data
            @ToString
            public static class DataDeploymentCodeConfigDto {
                /***/
                @JsonProperty("Path")
                private String Path;

                /***/
                @JsonProperty("AccessKey")
                private String AccessKey;

                /***/
                @JsonProperty("SecretKey")
                private String SecretKey;

                /***/
                @JsonProperty("Region")
                private String Region;

                /***/
                @JsonProperty("Bucket")
                private String Bucket;

                /***/
                @JsonProperty("Language")
                private String Language;

                /***/
                @JsonProperty("Command")
                private List<String> Command;

                /***/
                @JsonProperty("Checksum")
                private String Checksum;

                /***/
                @JsonProperty("AgentKernelContractDigest")
                private String AgentKernelContractDigest;

            }

            /***/
            @JsonProperty("ContainerConfig")
            private DataDeploymentContainerConfigDto ContainerConfig;

            @Data
            @ToString
            public static class DataDeploymentContainerConfigDto {
                /***/
                @JsonProperty("ImageType")
                private String ImageType;

                /***/
                @JsonProperty("EnterpriseInstance")
                private String EnterpriseInstance;

                /***/
                @JsonProperty("EnterpriseInstanceId")
                private String EnterpriseInstanceId;

                /***/
                @JsonProperty("NameSpace")
                private String NameSpace;

                /***/
                @JsonProperty("ImageRepo")
                private String ImageRepo;

                /***/
                @JsonProperty("ImageVersion")
                private String ImageVersion;

                /***/
                @JsonProperty("ImageAddr")
                private String ImageAddr;

                /***/
                @JsonProperty("UserName")
                private String UserName;

                /***/
                @JsonProperty("Password")
                private String Password;

                /***/
                @JsonProperty("Visibility")
                private String Visibility;

                /***/
                @JsonProperty("RequireCredential")
                private Boolean RequireCredential;

                /***/
                @JsonProperty("Command")
                private List<String> Command;

                /***/
                @JsonProperty("Port")
                private Integer Port;

            }

            /***/
            @JsonProperty("RuntimeConfig")
            private DataDeploymentRuntimeConfigDto RuntimeConfig;

            @Data
            @ToString
            public static class DataDeploymentRuntimeConfigDto {
                /***/
                @JsonProperty("Name")
                private String Name;

                /***/
                @JsonProperty("Version")
                private String Version;

                /***/
                @JsonProperty("ManifestSha256")
                private String ManifestSha256;

                /***/
                @JsonProperty("ImageDigest")
                private String ImageDigest;

                /***/
                @JsonProperty("Package")
                private String PackageField;

                /***/
                @JsonProperty("Protocol")
                private String Protocol;

                /***/
                @JsonProperty("ManifestFormat")
                private String ManifestFormat;

                /***/
                @JsonProperty("Startup")
                private DataDeploymentRuntimeConfigStartupDto Startup;

                @Data
                @ToString
                public static class DataDeploymentRuntimeConfigStartupDto {
                    /***/
                    @JsonProperty("Command")
                    private List<String> Command;

                    /***/
                    @JsonProperty("Port")
                    private Integer Port;

                    /***/
                    @JsonProperty("HealthCheck")
                    private DataDeploymentRuntimeConfigStartupHealthCheckDto HealthCheck;

                    @Data
                    @ToString
                    public static class DataDeploymentRuntimeConfigStartupHealthCheckDto {
                        /***/
                        @JsonProperty("protocol")
                        private String Protocol;

                        /***/
                        @JsonProperty("path")
                        private String Path;

                    }

                    /***/
                    @JsonProperty("Sources")
                    private DataDeploymentRuntimeConfigStartupSourcesDto Sources;

                    @Data
                    @ToString
                    public static class DataDeploymentRuntimeConfigStartupSourcesDto {
                    }

                    /***/
                    @JsonProperty("TemplateVersion")
                    private String TemplateVersion;

                    /***/
                    @JsonProperty("Overrides")
                    private DataDeploymentRuntimeConfigStartupOverridesDto Overrides;

                    @Data
                    @ToString
                    public static class DataDeploymentRuntimeConfigStartupOverridesDto {
                    }

                }

                /***/
                @JsonProperty("PluginArtifacts")
                private List<DataDeploymentRuntimeConfigPluginArtifactsDto> PluginArtifacts;

                @Data
                @ToString
                public static class DataDeploymentRuntimeConfigPluginArtifactsDto {
                    /***/
                    @JsonProperty("schema_version")
                    private String Schema_version;

                    /***/
                    @JsonProperty("artifact_id")
                    private String Artifact_id;

                    /***/
                    @JsonProperty("artifact_path")
                    private String Artifact_path;

                    /***/
                    @JsonProperty("storage_region")
                    private String Storage_region;

                    /***/
                    @JsonProperty("receipt")
                    private String Receipt;

                    /***/
                    @JsonProperty("build_id")
                    private String Build_id;

                    /***/
                    @JsonProperty("manifest_sha256")
                    private String Manifest_sha256;

                    /***/
                    @JsonProperty("marketplace_name")
                    private String Marketplace_name;

                    /***/
                    @JsonProperty("plugin_names")
                    private List<String> Plugin_names;

                    /***/
                    @JsonProperty("snapshot_digest")
                    private String Snapshot_digest;

                    /***/
                    @JsonProperty("bindings")
                    private List<String> Bindings;

                }

            }

            /***/
            @JsonProperty("AgentKernelReady")
            private Boolean AgentKernelReady;

            /***/
            @JsonProperty("AgentInstanceId")
            private String AgentInstanceId;

            /***/
            @JsonProperty("BundleDigest")
            private String BundleDigest;

            /***/
            @JsonProperty("DeploymentPhase")
            private String DeploymentPhase;

        }

        /***/
        @JsonProperty("DeploymentState")
        private DataDeploymentStateDto DeploymentState;

        @Data
        @ToString
        public static class DataDeploymentStateDto {
            /***/
            @JsonProperty("DesiredVersionId")
            private String DesiredVersionId;

            /***/
            @JsonProperty("ObservedVersionId")
            private String ObservedVersionId;

            /***/
            @JsonProperty("Ready")
            private Boolean Ready;

            /***/
            @JsonProperty("Phase")
            private String Phase;

            /***/
            @JsonProperty("Error")
            private DataDeploymentStateErrorDto Error;

            @Data
            @ToString
            public static class DataDeploymentStateErrorDto {
            }

            /***/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

        /***/
        @JsonProperty("Network")
        private DataNetworkDto Network;

        @Data
        @ToString
        public static class DataNetworkDto {
            /***/
            @JsonProperty("EnablePublicAccess")
            private Boolean EnablePublicAccess;

            /***/
            @JsonProperty("EnableVpcAccess")
            private Boolean EnableVpcAccess;

            /***/
            @JsonProperty("PublicEndpoint")
            private String PublicEndpoint;

            /***/
            @JsonProperty("PrivateEndpoint")
            private String PrivateEndpoint;

            /***/
            @JsonProperty("VpcId")
            private String VpcId;

            /***/
            @JsonProperty("VpcName")
            private String VpcName;

            /***/
            @JsonProperty("SubnetId")
            private String SubnetId;

            /***/
            @JsonProperty("SubnetName")
            private String SubnetName;

            /***/
            @JsonProperty("SecurityGroupId")
            private String SecurityGroupId;

            /***/
            @JsonProperty("SecurityGroupName")
            private String SecurityGroupName;

            /***/
            @JsonProperty("AvailabilityZone")
            private String AvailabilityZone;

            /***/
            @JsonProperty("AvailabilityZoneName")
            private String AvailabilityZoneName;

        }

        /***/
        @JsonProperty("Access")
        private DataAccessDto Access;

        @Data
        @ToString
        public static class DataAccessDto {
            /***/
            @JsonProperty("AuthType")
            private String AuthType;

            /***/
            @JsonProperty("ApiKeyId")
            private String ApiKeyId;

            /***/
            @JsonProperty("ApiKeyMasked")
            private String ApiKeyMasked;

            /***/
            @JsonProperty("IamRole")
            private String IamRole;

        }

        /***/
        @JsonProperty("Advanced")
        private DataAdvancedDto Advanced;

        @Data
        @ToString
        public static class DataAdvancedDto {
            /***/
            @JsonProperty("EnableObservability")
            private Boolean EnableObservability;

            /***/
            @JsonProperty("ObservabilityUrl")
            private String ObservabilityUrl;

            /***/
            @JsonProperty("ProjectName")
            private String ProjectName;

            /***/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /***/
            @JsonProperty("InboundIdentityAuth")
            private String InboundIdentityAuth;

            /***/
            @JsonProperty("EnvironmentVariables")
            private List<DataAdvancedEnvironmentVariablesDto> EnvironmentVariables;

            @Data
            @ToString
            public static class DataAdvancedEnvironmentVariablesDto {
                /***/
                @JsonProperty("Key")
                private String Key;

                /***/
                @JsonProperty("Value")
                private String Value;

                /***/
                @JsonProperty("IsSensitive")
                private Boolean IsSensitive;

            }

            /***/
            @JsonProperty("ModelName")
            private String ModelName;

            /***/
            @JsonProperty("ModelApiBase")
            private String ModelApiBase;

            /***/
            @JsonProperty("ModelApiKey")
            private String ModelApiKey;

            /***/
            @JsonProperty("ModelDeployMode")
            private String ModelDeployMode;

            /***/
            @JsonProperty("Tags")
            private List<String> Tags;

            /***/
            @JsonProperty("MemoryConfig")
            private DataAdvancedMemoryConfigDto MemoryConfig;

            @Data
            @ToString
            public static class DataAdvancedMemoryConfigDto {
                /***/
                @JsonProperty("MemorySystem")
                private String MemorySystem;

                /***/
                @JsonProperty("Mem0InstanceId")
                private String Mem0InstanceId;

                /***/
                @JsonProperty("Mem0InstanceName")
                private String Mem0InstanceName;

                /***/
                @JsonProperty("Mem0Region")
                private String Mem0Region;

                /***/
                @JsonProperty("LanceDbDeployMode")
                private String LanceDbDeployMode;

                /***/
                @JsonProperty("LanceDbKs3Uri")
                private String LanceDbKs3Uri;

            }

            /***/
            @JsonProperty("IsPrivate")
            private Boolean IsPrivate;

        }

        /***/
        @JsonProperty("ComponentConfig")
        private DataComponentConfigDto ComponentConfig;

        @Data
        @ToString
        public static class DataComponentConfigDto {
            /***/
            @JsonProperty("KnowledgeBase")
            private DataComponentConfigKnowledgeBaseDto KnowledgeBase;

            @Data
            @ToString
            public static class DataComponentConfigKnowledgeBaseDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Name")
                private String Name;

                /***/
                @JsonProperty("ApiKey")
                private String ApiKey;

            }

            /***/
            @JsonProperty("Memory")
            private DataComponentConfigMemoryDto Memory;

            @Data
            @ToString
            public static class DataComponentConfigMemoryDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Name")
                private String Name;

                /***/
                @JsonProperty("ApiKey")
                private String ApiKey;

            }

            /***/
            @JsonProperty("Sandbox")
            private DataComponentConfigSandboxDto Sandbox;

            @Data
            @ToString
            public static class DataComponentConfigSandboxDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Name")
                private String Name;

                /***/
                @JsonProperty("ApiKey")
                private String ApiKey;

            }

            /***/
            @JsonProperty("SkillWorkspace")
            private DataComponentConfigSkillWorkspaceDto SkillWorkspace;

            @Data
            @ToString
            public static class DataComponentConfigSkillWorkspaceDto {
                /***/
                @JsonProperty("Id")
                private String Id;

                /***/
                @JsonProperty("Name")
                private String Name;

                /***/
                @JsonProperty("ApiKey")
                private String ApiKey;

            }

            /***/
            @JsonProperty("SessionManagement")
            private DataComponentConfigSessionManagementDto SessionManagement;

            @Data
            @ToString
            public static class DataComponentConfigSessionManagementDto {
                /***/
                @JsonProperty("SessionResourceId")
                private String SessionResourceId;

                /***/
                @JsonProperty("Password")
                private String Password;

            }

            /***/
            @JsonProperty("A2ASpace")
            private DataComponentConfigA2ASpaceDto A2ASpace;

            @Data
            @ToString
            public static class DataComponentConfigA2ASpaceDto {
                /***/
                @JsonProperty("RuntimeProfile")
                private String RuntimeProfile;

            }

        }

        /***/
        @JsonProperty("UiConfig")
        private DataUiConfigDto UiConfig;

        @Data
        @ToString
        public static class DataUiConfigDto {
            /***/
            @JsonProperty("Profile")
            private String Profile;

            /***/
            @JsonProperty("Path")
            private String Path;

            /***/
            @JsonProperty("Url")
            private String Url;

        }

    }

}
