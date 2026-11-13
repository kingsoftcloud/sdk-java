package ksyun.client.aicp.getimagecachelist.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetImageCacheListResponse
* @Description GetImageCacheList 返回体
*/
@Data
@ToString
public class GetImageCacheListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**镜像缓存列表*/
    @JsonProperty("ImageCaches")
    private List<ImageCachesDto> ImageCaches;

    @Data
    @ToString
    public static class ImageCachesDto {
        /**镜像缓存记录ID*/
        @JsonProperty("ImageCacheId")
        private String ImageCacheId;

        /**镜像地址，不含Tag*/
        @JsonProperty("ImageUrl")
        private String ImageUrl;

        /**镜像Tag*/
        @JsonProperty("ImageTag")
        private String ImageTag;

        /**镜像描述，仅公共镜像列表可能返回*/
        @JsonProperty("Description")
        private String Description;

        /**公共镜像适用模板类型，仅公共镜像列表可能返回*/
        @JsonProperty("TemplateType")
        private String TemplateType;

        /**镜像大小（GB，保留小数）*/
        @JsonProperty("ImageSize")
        private Double ImageSize;

        /**底层返回的中文展示状态，例如“缓存中”*/
        @JsonProperty("CacheStatus")
        private String CacheStatus;

        /**缓存失败原因，仅失败时可能返回*/
        @JsonProperty("FailedReason")
        private String FailedReason;

        /**聚合状态：Preheating/Ready/Failed/PartialFailed/Uncached*/
        @JsonProperty("Status")
        private String Status;

        /**创建时间*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**更新时间*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

    }

    /**页码*/
    @JsonProperty("PageNum")
    private Integer PageNum;

    /**每页数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**总条数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

}
