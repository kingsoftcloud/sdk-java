package ksyun.client.aicp.createsession.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSessionResponse
* @Description CreateSession 返回体
*/
@Data
@ToString
public class CreateSessionResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Action")
    private String Action;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Session")
        private DataSessionDto Session;

        @Data
        @ToString
        public static class DataSessionDto {
            /***/
            @JsonProperty("SessionId")
            private String SessionId;

            /***/
            @JsonProperty("AgentId")
            private String AgentId;

            /***/
            @JsonProperty("UserId")
            private String UserId;

            /***/
            @JsonProperty("Title")
            private String Title;

            /***/
            @JsonProperty("TitleSource")
            private String TitleSource;

            /***/
            @JsonProperty("Summary")
            private String Summary;

            /***/
            @JsonProperty("FirstPrompt")
            private String FirstPrompt;

            /***/
            @JsonProperty("LastPrompt")
            private String LastPrompt;

            /***/
            @JsonProperty("State")
            private DataSessionStateDto State;

            @Data
            @ToString
            public static class DataSessionStateDto {
            }

            /***/
            @JsonProperty("Version")
            private Integer Version;

            /***/
            @JsonProperty("Tags")
            private DataSessionTagsDto Tags;

            @Data
            @ToString
            public static class DataSessionTagsDto {
            }

            /***/
            @JsonProperty("TagsRevision")
            private Integer TagsRevision;

            /***/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /***/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

            /***/
            @JsonProperty("RuntimeSync")
            private String RuntimeSync;

            /***/
            @JsonProperty("ActiveRunStatus")
            private String ActiveRunStatus;

            /***/
            @JsonProperty("ActiveInvocationId")
            private String ActiveInvocationId;

            /***/
            @JsonProperty("ActiveRunMode")
            private String ActiveRunMode;

            /***/
            @JsonProperty("ActiveRunTrigger")
            private String ActiveRunTrigger;

            /***/
            @JsonProperty("ActiveRunUpdatedAt")
            private String ActiveRunUpdatedAt;

            /***/
            @JsonProperty("Model")
            private DataSessionModelDto Model;

            @Data
            @ToString
            public static class DataSessionModelDto {
            }

            /***/
            @JsonProperty("ContextUsage")
            private DataSessionContextUsageDto ContextUsage;

            @Data
            @ToString
            public static class DataSessionContextUsageDto {
            }

            /***/
            @JsonProperty("TokenUsage")
            private DataSessionTokenUsageDto TokenUsage;

            @Data
            @ToString
            public static class DataSessionTokenUsageDto {
            }

        }

        /***/
        @JsonProperty("RuntimeSync")
        private DataRuntimeSyncDto RuntimeSync;

        @Data
        @ToString
        public static class DataRuntimeSyncDto {
        }

    }

}
