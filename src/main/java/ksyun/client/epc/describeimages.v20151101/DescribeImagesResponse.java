package ksyun.client.epc.describeimages.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImagesResponse
* @Description DescribeImages 返回体
*/
@Data
@ToString
public class DescribeImagesResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**获取另一页返回结果的 token.*/
    @JsonProperty("NextToken")
    private String NextToken;

    /**裸金属服务器总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**Image的信息*/
    @JsonProperty("ImageSet")
    private List<ImageSetDto> ImageSet;

    @Data
    @ToString
    public static class ImageSetDto {
        /**镜像ID*/
        @JsonProperty("ImageId")
        private String ImageId;

        /**镜像名称*/
        @JsonProperty("ImageName")
        private String ImageName;

        /**镜像类别，枚举为：Base,标准镜像；默认为标准镜像 有效值：base|private*/
        @JsonProperty("ImageType")
        private String ImageType;

        /**操作系统名称*/
        @JsonProperty("OsName")
        private String OsName;

        /**操作系统类型*/
        @JsonProperty("OsType")
        private String OsType;

        /**是否支持容器*/
        @JsonProperty("EnableContainer")
        private Boolean EnableContainer;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**磁盘类型*/
        @JsonProperty("DiskType")
        private String DiskType;

        /**云盘镜像尺寸*/
        @JsonProperty("EbsImageSize")
        private String EbsImageSize;

        /**状态*/
        @JsonProperty("Status")
        private String Status;

        /**裸金属服务器自定义镜像初始化选项:Initialization|Uninitialized*/
        @JsonProperty("ImageInitialization")
        private String ImageInitialization;

        /**名称*/
        @JsonProperty("Name")
        private String Name;

        /**导出状态*/
        @JsonProperty("ExportStatus")
        private String ExportStatus;

        /**导出进度*/
        @JsonProperty("ExportProgress")
        private String ExportProgress;

        /**来源*/
        @JsonProperty("Source")
        private String Source;

        /**镜像版本*/
        @JsonProperty("KernelVersion")
        private String KernelVersion;

    }

}
