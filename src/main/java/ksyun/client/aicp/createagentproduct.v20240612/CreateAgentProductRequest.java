package ksyun.client.aicp.createagentproduct.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateAgentProductRequest
* @Description 请求参数
*/
@Data
public class CreateAgentProductRequest{
    /***/
    @KsYunField(name="Name")
    private String Name;

    /***/
    @KsYunField(name="Description")
    private String Description;

    /***/
    @KsYunField(name="ClientToken")
    private String ClientToken;

    /***/
    @KsYunField(name="Framework")
    private String Framework;

    /***/
    @KsYunField(name="DeploymentType")
    private String DeploymentType;

    /***/
    @KsYunField(name="CodeConfig")
    private CodeConfigDto CodeConfig;

    @Data
    @ToString
    public static class CodeConfigDto {
        /***/
        @KsYunField(name="Path")
        private String Path;

        /***/
        @KsYunField(name="AccessKey")
        private String AccessKey;

        /***/
        @KsYunField(name="SecretKey")
        private String SecretKey;

        /***/
        @KsYunField(name="Bucket")
        private String Bucket;

        /***/
        @KsYunField(name="Language")
        private String Language;

        /***/
        @KsYunField(name="Command",type=2)
        private List<String> CommandList;

        /***/
        @KsYunField(name="Checksum")
        private String Checksum;

        /***/
        @KsYunField(name="AgentKernelContractDigest")
        private String AgentKernelContractDigest;

    }

    /***/
    @KsYunField(name="ContainerConfig")
    private ContainerConfigDto ContainerConfig;

    @Data
    @ToString
    public static class ContainerConfigDto {
        /***/
        @KsYunField(name="ImageType")
        private String ImageType;

        /***/
        @KsYunField(name="EnterpriseInstance")
        private String EnterpriseInstance;

        /***/
        @KsYunField(name="EnterpriseInstanceId")
        private String EnterpriseInstanceId;

        /***/
        @KsYunField(name="NameSpace")
        private String NameSpace;

        /***/
        @KsYunField(name="ImageRepo")
        private String ImageRepo;

        /***/
        @KsYunField(name="ImageVersion")
        private String ImageVersion;

        /***/
        @KsYunField(name="ImageAddr")
        private String ImageAddr;

        /***/
        @KsYunField(name="UserName")
        private String UserName;

        /***/
        @KsYunField(name="Password")
        private String Password;

        /***/
        @KsYunField(name="Visibility")
        private String Visibility;

        /***/
        @KsYunField(name="RequireCredential")
        private Boolean RequireCredential;

        /***/
        @KsYunField(name="Command",type=2)
        private List<String> CommandList;

        /***/
        @KsYunField(name="Port")
        private Integer Port;

    }

    /***/
    @KsYunField(name="Resource")
    private ResourceDto Resource;

    @Data
    @ToString
    public static class ResourceDto {
        /***/
        @KsYunField(name="Cpu")
        private Integer Cpu;

        /***/
        @KsYunField(name="Memory")
        private Integer Memory;

    }

    /***/
    @KsYunField(name="Scaling")
    private ScalingDto Scaling;

    @Data
    @ToString
    public static class ScalingDto {
        /***/
        @KsYunField(name="MinReplicas")
        private Integer MinReplicas;

        /***/
        @KsYunField(name="MaxReplicas")
        private Integer MaxReplicas;

        /***/
        @KsYunField(name="QpsPerInstance")
        private Integer QpsPerInstance;

    }

    /***/
    @KsYunField(name="Storage")
    private StorageDto Storage;

    @Data
    @ToString
    public static class StorageDto {
        /***/
        @KsYunField(name="MountPath")
        private String MountPath;

        /***/
        @KsYunField(name="SizeGi")
        private Integer SizeGi;

    }

    /***/
    @KsYunField(name="KS3MountConfig")
    private KS3MountConfigDto KS3MountConfig;

    @Data
    @ToString
    public static class KS3MountConfigDto {
        /***/
        @KsYunField(name="BucketName")
        private String BucketName;

        /***/
        @KsYunField(name="BucketPath")
        private String BucketPath;

        /***/
        @KsYunField(name="Endpoint")
        private String Endpoint;

        /***/
        @KsYunField(name="MountDir")
        private String MountDir;

        /***/
        @KsYunField(name="ReadOnly")
        private Boolean ReadOnly;

        /***/
        @KsYunField(name="AkId")
        private String AkId;

        /***/
        @KsYunField(name="AkSecret")
        private String AkSecret;

    }

    /***/
    @KsYunField(name="SessionAffinity")
    private SessionAffinityDto SessionAffinity;

    @Data
    @ToString
    public static class SessionAffinityDto {
        /***/
        @KsYunField(name="Enabled")
        private Boolean Enabled;

        /***/
        @KsYunField(name="Type")
        private String Type;

        /***/
        @KsYunField(name="MaxAge")
        private Integer MaxAge;

    }

    /***/
    @KsYunField(name="Network")
    private NetworkDto Network;

    @Data
    @ToString
    public static class NetworkDto {
        /***/
        @KsYunField(name="EnablePublicAccess")
        private Boolean EnablePublicAccess;

        /***/
        @KsYunField(name="EnableVpcAccess")
        private Boolean EnableVpcAccess;

        /***/
        @KsYunField(name="VpcId")
        private String VpcId;

        /***/
        @KsYunField(name="VpcName")
        private String VpcName;

        /***/
        @KsYunField(name="SubnetId")
        private String SubnetId;

        /***/
        @KsYunField(name="SubnetName")
        private String SubnetName;

        /***/
        @KsYunField(name="SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @KsYunField(name="SecurityGroupName")
        private String SecurityGroupName;

        /***/
        @KsYunField(name="AvailabilityZone")
        private String AvailabilityZone;

        /***/
        @KsYunField(name="AvailabilityZoneName")
        private String AvailabilityZoneName;

    }

    /***/
    @KsYunField(name="Access")
    private AccessDto Access;

    @Data
    @ToString
    public static class AccessDto {
        /***/
        @KsYunField(name="AuthType")
        private String AuthType;

        /***/
        @KsYunField(name="IamRole")
        private String IamRole;

        /***/
        @KsYunField(name="IsPrivate")
        private Boolean IsPrivate;

    }

    /***/
    @KsYunField(name="Advanced")
    private AdvancedDto Advanced;

    @Data
    @ToString
    public static class AdvancedDto {
        /***/
        @KsYunField(name="EnableObservability")
        private Boolean EnableObservability;

        /***/
        @KsYunField(name="EnvironmentVariables",type=2)
        private List<AdvancedEnvironmentVariablesDto> EnvironmentVariablesList;

        @Data
        @ToString
        public static class AdvancedEnvironmentVariablesDto {
            /***/
            @KsYunField(name="Key")
            private String Key;

            /***/
            @KsYunField(name="Value")
            private String Value;

            /***/
            @KsYunField(name="IsSensitive")
            private Boolean IsSensitive;

        }

        /***/
        @KsYunField(name="Tags",type=2)
        private List<String> TagsList;

        /***/
        @KsYunField(name="InboundIdentityAuth")
        private String InboundIdentityAuth;

        /***/
        @KsYunField(name="ProjectName")
        private String ProjectName;

        /***/
        @KsYunField(name="ProjectId")
        private Integer ProjectId;

        /***/
        @KsYunField(name="DeployMode")
        private String DeployMode;

        /***/
        @KsYunField(name="ComponentConfig")
        private AdvancedComponentConfigDto ComponentConfig;

        @Data
        @ToString
        public static class AdvancedComponentConfigDto {
            /***/
            @KsYunField(name="KnowledgeBase")
            private AdvancedComponentConfigKnowledgeBaseDto KnowledgeBase;

            @Data
            @ToString
            public static class AdvancedComponentConfigKnowledgeBaseDto {
                /***/
                @KsYunField(name="Id")
                private String Id;

                /***/
                @KsYunField(name="Name")
                private String Name;

                /***/
                @KsYunField(name="ApiKey")
                private String ApiKey;

            }

            /***/
            @KsYunField(name="Memory")
            private AdvancedComponentConfigMemoryDto Memory;

            @Data
            @ToString
            public static class AdvancedComponentConfigMemoryDto {
                /***/
                @KsYunField(name="Id")
                private String Id;

                /***/
                @KsYunField(name="Name")
                private String Name;

                /***/
                @KsYunField(name="ApiKey")
                private String ApiKey;

            }

            /***/
            @KsYunField(name="Sandbox")
            private AdvancedComponentConfigSandboxDto Sandbox;

            @Data
            @ToString
            public static class AdvancedComponentConfigSandboxDto {
                /***/
                @KsYunField(name="Id")
                private String Id;

                /***/
                @KsYunField(name="Name")
                private String Name;

                /***/
                @KsYunField(name="ApiKey")
                private String ApiKey;

            }

            /***/
            @KsYunField(name="SkillWorkspace")
            private AdvancedComponentConfigSkillWorkspaceDto SkillWorkspace;

            @Data
            @ToString
            public static class AdvancedComponentConfigSkillWorkspaceDto {
                /***/
                @KsYunField(name="Id")
                private String Id;

                /***/
                @KsYunField(name="Name")
                private String Name;

                /***/
                @KsYunField(name="ApiKey")
                private String ApiKey;

            }

            /***/
            @KsYunField(name="SessionManagement")
            private AdvancedComponentConfigSessionManagementDto SessionManagement;

            @Data
            @ToString
            public static class AdvancedComponentConfigSessionManagementDto {
                /***/
                @KsYunField(name="SessionResourceId")
                private String SessionResourceId;

                /***/
                @KsYunField(name="Password")
                private String Password;

            }

            /***/
            @KsYunField(name="A2ASpace")
            private AdvancedComponentConfigA2ASpaceDto A2ASpace;

            @Data
            @ToString
            public static class AdvancedComponentConfigA2ASpaceDto {
                /***/
                @KsYunField(name="RuntimeProfile")
                private String RuntimeProfile;

            }

        }

        /***/
        @KsYunField(name="IsPrivate")
        private Boolean IsPrivate;

    }

    /***/
    @KsYunField(name="ComponentConfig")
    private ComponentConfigDto ComponentConfig;

    @Data
    @ToString
    public static class ComponentConfigDto {
        /***/
        @KsYunField(name="KnowledgeBase")
        private ComponentConfigKnowledgeBaseDto KnowledgeBase;

        @Data
        @ToString
        public static class ComponentConfigKnowledgeBaseDto {
            /***/
            @KsYunField(name="Id")
            private String Id;

            /***/
            @KsYunField(name="Name")
            private String Name;

            /***/
            @KsYunField(name="ApiKey")
            private String ApiKey;

        }

        /***/
        @KsYunField(name="Memory")
        private ComponentConfigMemoryDto Memory;

        @Data
        @ToString
        public static class ComponentConfigMemoryDto {
            /***/
            @KsYunField(name="Id")
            private String Id;

            /***/
            @KsYunField(name="Name")
            private String Name;

            /***/
            @KsYunField(name="ApiKey")
            private String ApiKey;

        }

        /***/
        @KsYunField(name="Sandbox")
        private ComponentConfigSandboxDto Sandbox;

        @Data
        @ToString
        public static class ComponentConfigSandboxDto {
            /***/
            @KsYunField(name="Id")
            private String Id;

            /***/
            @KsYunField(name="Name")
            private String Name;

            /***/
            @KsYunField(name="ApiKey")
            private String ApiKey;

        }

        /***/
        @KsYunField(name="SkillWorkspace")
        private ComponentConfigSkillWorkspaceDto SkillWorkspace;

        @Data
        @ToString
        public static class ComponentConfigSkillWorkspaceDto {
            /***/
            @KsYunField(name="Id")
            private String Id;

            /***/
            @KsYunField(name="Name")
            private String Name;

            /***/
            @KsYunField(name="ApiKey")
            private String ApiKey;

        }

        /***/
        @KsYunField(name="SessionManagement")
        private ComponentConfigSessionManagementDto SessionManagement;

        @Data
        @ToString
        public static class ComponentConfigSessionManagementDto {
            /***/
            @KsYunField(name="SessionResourceId")
            private String SessionResourceId;

            /***/
            @KsYunField(name="Password")
            private String Password;

        }

        /***/
        @KsYunField(name="A2ASpace")
        private ComponentConfigA2ASpaceDto A2ASpace;

        @Data
        @ToString
        public static class ComponentConfigA2ASpaceDto {
            /***/
            @KsYunField(name="RuntimeProfile")
            private String RuntimeProfile;

        }

    }

    /***/
    @KsYunField(name="UiConfig")
    private UiConfigDto UiConfig;

    @Data
    @ToString
    public static class UiConfigDto {
        /***/
        @KsYunField(name="Profile")
        private String Profile;

        /***/
        @KsYunField(name="Path")
        private String Path;

        /***/
        @KsYunField(name="Url")
        private String Url;

    }

    /***/
    @KsYunField(name="DeployMode")
    private String DeployMode;

    /***/
    @KsYunField(name="MemoryConfig")
    private MemoryConfigDto MemoryConfig;

    @Data
    @ToString
    public static class MemoryConfigDto {
        /***/
        @KsYunField(name="MemorySystem")
        private String MemorySystem;

        /***/
        @KsYunField(name="Mem0InstanceId")
        private String Mem0InstanceId;

        /***/
        @KsYunField(name="Mem0InstanceName")
        private String Mem0InstanceName;

        /***/
        @KsYunField(name="Mem0Region")
        private String Mem0Region;

        /***/
        @KsYunField(name="LanceDbDeployMode")
        private String LanceDbDeployMode;

        /***/
        @KsYunField(name="LanceDbKs3Uri")
        private String LanceDbKs3Uri;

    }

    /***/
    @KsYunField(name="AutoPay")
    private Boolean AutoPay;

}
