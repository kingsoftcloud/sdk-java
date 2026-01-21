package ksyun.client.aicp.describeimages.v20240612;

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

    /**镜像列表*/
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

        /**镜像来源*/
        @JsonProperty("ImageSource")
        private String ImageSource;

        /**镜像类型*/
        @JsonProperty("ImageType")
        private String ImageType;

        /**镜像框架 (官方镜像有此属性)*/
        @JsonProperty("ImageFrame")
        private List<String> ImageFrame;

        /**Python版本 (官方镜像有此属性)*/
        @JsonProperty("PythonVersion")
        private String PythonVersion;

        /**应用场景 (官方镜像有此属性)*/
        @JsonProperty("ApplicationScenario")
        private String ApplicationScenario;

        /**CUDA版本 (官方镜像有此属性)*/
        @JsonProperty("CudaVersion")
        private String CudaVersion;

        /**镜像大小*/
        @JsonProperty("ImageSize")
        private String ImageSize;

        /**描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**命名空间*/
        @JsonProperty("Namespace")
        private String Namespace;

        /**命名空间权限*/
        @JsonProperty("NamespacePermission")
        private String NamespacePermission;

        /**镜像仓库*/
        @JsonProperty("ImageRepo")
        private String ImageRepo;

        /**镜像版本*/
        @JsonProperty("ImageVersion")
        private String ImageVersion;

        /**镜像域名*/
        @JsonProperty("ImageDomain")
        private String ImageDomain;

        /**企业镜像实例*/
        @JsonProperty("OfficialInstance")
        private String OfficialInstance;

        /**镜像权限*/
        @JsonProperty("ImagePermission")
        private String ImagePermission;

        /**镜像状态*/
        @JsonProperty("ImageStatus")
        private String ImageStatus;

        /**镜像异常原因*/
        @JsonProperty("ImageAbnormalReason")
        private String ImageAbnormalReason;

        /**镜像状态名称*/
        @JsonProperty("ImageStatusName")
        private String ImageStatusName;

        /**创建用户*/
        @JsonProperty("CreateUser")
        private String CreateUser;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

    }

    /**镜像总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**单次调用可返回的最大条目数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

}
