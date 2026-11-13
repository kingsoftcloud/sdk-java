package ksyun.client.aicp.listagents.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListAgentsResponse
* @Description ListAgents 返回体
*/
@Data
@ToString
public class ListAgentsResponse extends BaseResponseModel {

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
        @JsonProperty("Agents")
        private List<DataAgentsDto> Agents;

        @Data
        @ToString
        public static class DataAgentsDto {
            /***/
            @JsonProperty("AgentId")
            private String AgentId;

            /***/
            @JsonProperty("Resource")
            private DataAgentsResourceDto Resource;

            @Data
            @ToString
            public static class DataAgentsResourceDto {
                /***/
                @JsonProperty("Cpu")
                private Integer Cpu;

                /***/
                @JsonProperty("Memory")
                private Integer Memory;

            }

            /***/
            @JsonProperty("AgentRuntimeId")
            private String AgentRuntimeId;

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
            @JsonProperty("Endpoint")
            private String Endpoint;

            /***/
            @JsonProperty("Replicas")
            private Integer Replicas;

            /***/
            @JsonProperty("ReadyReplicas")
            private Integer ReadyReplicas;

            /***/
            @JsonProperty("DeploymentState")
            private DataAgentsDeploymentStateDto DeploymentState;

            @Data
            @ToString
            public static class DataAgentsDeploymentStateDto {
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
                private DataAgentsDeploymentStateErrorDto Error;

                @Data
                @ToString
                public static class DataAgentsDeploymentStateErrorDto {
                }

                /***/
                @JsonProperty("UpdatedAt")
                private String UpdatedAt;

            }

            /***/
            @JsonProperty("Framework")
            private String Framework;

            /***/
            @JsonProperty("ArtifactType")
            private String ArtifactType;

            /***/
            @JsonProperty("Region")
            private String Region;

            /***/
            @JsonProperty("MemoryConfig")
            private DataAgentsMemoryConfigDto MemoryConfig;

            @Data
            @ToString
            public static class DataAgentsMemoryConfigDto {
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
            @JsonProperty("ComponentConfig")
            private DataAgentsComponentConfigDto ComponentConfig;

            @Data
            @ToString
            public static class DataAgentsComponentConfigDto {
                /***/
                @JsonProperty("KnowledgeBase")
                private DataAgentsComponentConfigKnowledgeBaseDto KnowledgeBase;

                @Data
                @ToString
                public static class DataAgentsComponentConfigKnowledgeBaseDto {
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
                private DataAgentsComponentConfigMemoryDto Memory;

                @Data
                @ToString
                public static class DataAgentsComponentConfigMemoryDto {
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
                private DataAgentsComponentConfigSandboxDto Sandbox;

                @Data
                @ToString
                public static class DataAgentsComponentConfigSandboxDto {
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
                private DataAgentsComponentConfigSkillWorkspaceDto SkillWorkspace;

                @Data
                @ToString
                public static class DataAgentsComponentConfigSkillWorkspaceDto {
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
                private DataAgentsComponentConfigSessionManagementDto SessionManagement;

                @Data
                @ToString
                public static class DataAgentsComponentConfigSessionManagementDto {
                    /***/
                    @JsonProperty("SessionResourceId")
                    private String SessionResourceId;

                    /***/
                    @JsonProperty("Password")
                    private String Password;

                }

                /***/
                @JsonProperty("A2ASpace")
                private DataAgentsComponentConfigA2ASpaceDto A2ASpace;

                @Data
                @ToString
                public static class DataAgentsComponentConfigA2ASpaceDto {
                    /***/
                    @JsonProperty("RuntimeProfile")
                    private String RuntimeProfile;

                }

            }

            /***/
            @JsonProperty("IsPrivate")
            private Boolean IsPrivate;

            /***/
            @JsonProperty("Creator")
            private String Creator;

            /***/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /***/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

        /***/
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Page")
        private Integer Page;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

    }

}
