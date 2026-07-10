package ksyun.client.epc.describelaunchtemplates.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeLaunchTemplatesResponse
* @Description DescribeLaunchTemplates 返回体
*/
@Data
@ToString
public class DescribeLaunchTemplatesResponse extends BaseResponseModel {

    /***/
    @JsonProperty("LaunchTemplates")
    private List<LaunchTemplatesDto> LaunchTemplates;

    @Data
    @ToString
    public static class LaunchTemplatesDto {
        /***/
        @JsonProperty("LaunchTemplateId")
        private String LaunchTemplateId;

        /***/
        @JsonProperty("LaunchTemplateName")
        private String LaunchTemplateName;

        /***/
        @JsonProperty("LatestVersionNumber")
        private Integer LatestVersionNumber;

        /***/
        @JsonProperty("DefaultVersionNumber")
        private Integer DefaultVersionNumber;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("NextToken")
    private String NextToken;

}
