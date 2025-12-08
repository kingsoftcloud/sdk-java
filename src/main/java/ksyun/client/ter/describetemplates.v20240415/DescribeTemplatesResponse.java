package ksyun.client.ter.describetemplates.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTemplatesResponse
* @Description DescribeTemplates 返回体
*/
@Data
@ToString
public class DescribeTemplatesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("TemplateCount")
    private Integer TemplateCount;

    /***/
    @JsonProperty("Templates")
    private List<TemplatesDto> Templates;

    @Data
    @ToString
    public static class TemplatesDto {
        /***/
        @JsonProperty("TemplateId")
        private String TemplateId;

        /***/
        @JsonProperty("TemplateType")
        private String TemplateType;

        /***/
        @JsonProperty("TemplateName")
        private String TemplateName;

        /***/
        @JsonProperty("TemplateDescription")
        private String TemplateDescription;

        /***/
        @JsonProperty("LatestVersion")
        private String LatestVersion;

        /***/
        @JsonProperty("VersionCount")
        private Integer VersionCount;

        /***/
        @JsonProperty("UsingCount")
        private Integer UsingCount;

        /***/
        @JsonProperty("CreatTime")
        private String CreatTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
