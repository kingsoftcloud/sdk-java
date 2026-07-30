package ksyun.client.aicp.getsandboxtemplatelist.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSandboxTemplateListResponse
* @Description GetSandboxTemplateList 返回体
*/
@Data
@ToString
public class GetSandboxTemplateListResponse extends BaseResponseModel {

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
        @JsonProperty("Templates")
        private List<DataTemplatesDto> Templates;

        @Data
        @ToString
        public static class DataTemplatesDto {
            /***/
            @JsonProperty("TemplateId")
            private String TemplateId;

            /***/
            @JsonProperty("TemplateName")
            private String TemplateName;

            /***/
            @JsonProperty("Description")
            private String Description;

            /***/
            @JsonProperty("TemplateType")
            private String TemplateType;

            /***/
            @JsonProperty("Status")
            private String Status;

            /***/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /***/
            @JsonProperty("CanDelete")
            private Boolean CanDelete;

            /***/
            @JsonProperty("TemplateCategory")
            private String TemplateCategory;

            /***/
            @JsonProperty("KlogConfig")
            private DataTemplatesKlogConfigDto KlogConfig;

            @Data
            @ToString
            public static class DataTemplatesKlogConfigDto {
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

        }

        /***/
        @JsonProperty("TotalCount")
        private Integer TotalCount;

        /***/
        @JsonProperty("PageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("PageSize")
        private Integer PageSize;

    }

}
