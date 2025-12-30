package ksyun.client.ter.describetemplateversions.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeTemplateVersionsResponse
* @Description DescribeTemplateVersions 返回体
*/
@Data
@ToString
public class DescribeTemplateVersionsResponse extends BaseResponseModel {

    /**模板*/
    @JsonProperty("Versions")
    private List<VersionsDto> Versions;

    @Data
    @ToString
    public static class VersionsDto {
        /**版本号*/
        @JsonProperty("VersionNumber")
        private String VersionNumber;

        /**版本描述*/
        @JsonProperty("VersionDescription")
        private String VersionDescription;

        /**版本状态*/
        @JsonProperty("VersionState")
        private String VersionState;

        /**新建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

    /**接口请求ID
示例值：a831f245-2694-47de-a417-a5e7d8b250f1012*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模板ID*/
    @JsonProperty("TemplateId")
    private String TemplateId;

    /**返回的版本数量*/
    @JsonProperty("VersionCount")
    private Integer VersionCount;

}
