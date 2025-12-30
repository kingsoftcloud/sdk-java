package ksyun.client.kcrs.describeimagescan.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImageScanResponse
* @Description DescribeImageScan 返回体
*/
@Data
@ToString
public class DescribeImageScanResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**镜像安全扫描状态
*/
    @JsonProperty("Status")
    private String Status;

    /**镜像安全扫描结果数量
*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**扫描完成时间*/
    @JsonProperty("FinishTime")
    private String FinishTime;

    /**安全漏洞等级数量*/
    @JsonProperty("Summary")
    private SummaryDto Summary;

    @Data
    @ToString
    public static class SummaryDto {
        /**高危漏洞数量
*/
        @JsonProperty("High")
        private Integer High;

        /**中危漏洞数量*/
        @JsonProperty("Medium")
        private Integer Medium;

        /**低危漏洞数量
*/
        @JsonProperty("Low")
        private Integer Low;

        /**可忽略
*/
        @JsonProperty("Negligible")
        private Integer Negligible;

        /**未评级
*/
        @JsonProperty("Unknown")
        private Integer Unknown;

    }

    /**镜像安全扫描结果详细信息
*/
    @JsonProperty("VulnerabilitySet")
    private VulnerabilitySetDto VulnerabilitySet;

    @Data
    @ToString
    public static class VulnerabilitySetDto {
        /**漏洞编号
*/
        @JsonProperty("CveName")
        private String CveName;

        /**漏洞链接
*/
        @JsonProperty("CveLink")
        private String CveLink;

        /**漏洞描述
*/
        @JsonProperty("Description")
        private String Description;

        /**漏洞等级
*/
        @JsonProperty("Severity")
        private String Severity;

        /**软件包*/
        @JsonProperty("Feature")
        private String Feature;

        /**当前版本*/
        @JsonProperty("CurrentVersion")
        private String CurrentVersion;

        /**修复版本*/
        @JsonProperty("RepairedVersion")
        private String RepairedVersion;

    }

}
