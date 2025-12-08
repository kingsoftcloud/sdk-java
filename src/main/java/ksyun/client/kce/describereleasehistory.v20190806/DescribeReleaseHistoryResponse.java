package ksyun.client.kce.describereleasehistory.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeReleaseHistoryResponse
* @Description DescribeReleaseHistory 返回体
*/
@Data
@ToString
public class DescribeReleaseHistoryResponse extends BaseResponseModel {
    /**请求 Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReleaseVersions")
    private List<ReleaseVersionsDto> ReleaseVersions;

    @Data
    @ToString
    public static class ReleaseVersionsDto {
        /**Helm 应用名称*/
        @JsonProperty("ReleaseName")
        private String ReleaseName;

        /**helm应用状态*/
        @JsonProperty("StatusCode")
        private String StatusCode;

        /**版本号*/
        @JsonProperty("ReleaseVersion")
        private Integer ReleaseVersion;

        /**部署时间*/
        @JsonProperty("DeployTime")
        private String DeployTime;

        /**描述*/
        @JsonProperty("Description")
        private String Description;

        /**Chart 名称*/
        @JsonProperty("ChartName")
        private String ChartName;

        /**Chart版本*/
        @JsonProperty("ChartVersion")
        private String ChartVersion;

    }

}
