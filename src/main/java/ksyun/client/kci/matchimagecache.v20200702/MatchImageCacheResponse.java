package ksyun.client.kci.matchimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname MatchImageCacheResponse
* @Description MatchImageCache 返回体
*/
@Data
@ToString
public class MatchImageCacheResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**镜像缓存匹配结果记录，只返回最优的一条记录*/
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

    }

}
