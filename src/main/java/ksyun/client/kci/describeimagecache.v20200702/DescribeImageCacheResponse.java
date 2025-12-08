package ksyun.client.kci.describeimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeImageCacheResponse
* @Description DescribeImageCache 返回体
*/
@Data
@ToString
public class DescribeImageCacheResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**单次请求最大记录数*/
    @JsonProperty("MaxResults")
    private Integer MaxResults;

    /**下一次请求记录的起始值，如果是0，表示所有数据已返回，重新开始从第一页获取数据*/
    @JsonProperty("Marker")
    private Integer Marker;

    /**满足查询条件的总记录数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("ImageCaches")
    private List<ImageCachesDto> ImageCaches;

    @Data
    @ToString
    public static class ImageCachesDto {
        /**镜像缓存ID*/
        @JsonProperty("ImageCacheId")
        private String ImageCacheId;

        /**镜像缓存名称*/
        @JsonProperty("ImageCacheName")
        private String ImageCacheName;

        /**过期时间，为空则表示永久保留。*/
        @JsonProperty("ExpireTime")
        private String ExpireTime;

        /**创建时间，格式yyyy-MM-dd HH:mm:ss*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**镜像缓存状态

- Preparing 准备中，计算资源启动中
- Creating 创建中，容器启动拉镜像
- SnapshotCreating 制作快照中
- Ready 创建完成
- Failed 创建失败
- Updating 更新中

过期的镜像缓存系统会自动删除*/
        @JsonProperty("Status")
        private String Status;

        /**镜像缓存大小，即创建出的ebs盘大小*/
        @JsonProperty("ImageCacheSize")
        private Integer ImageCacheSize;

        /**ebs快照ID*/
        @JsonProperty("SnapshotId")
        private String SnapshotId;

        /**容器实例ID，镜像缓存基于该容器实例进行制作的，制作完成后，容器实例会自动释放，不用担心持续计费，无须手动释放。*/
        @JsonProperty("ContainerGroupId")
        private String ContainerGroupId;

        /**该镜像缓存已缓存的镜像列表*/
        @JsonProperty("Images")
        private List<String> Images;

        /**创建镜像缓存失败原因*/
        @JsonProperty("Reason")
        private String Reason;

        /**镜像缓存类型
- Common
- Rapid*/
        @JsonProperty("ImageCacheType")
        private String ImageCacheType;

    }

}
