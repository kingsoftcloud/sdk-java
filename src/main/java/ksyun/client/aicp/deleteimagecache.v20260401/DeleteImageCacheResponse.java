package ksyun.client.aicp.deleteimagecache.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteImageCacheResponse
* @Description DeleteImageCache 返回体
*/
@Data
@ToString
public class DeleteImageCacheResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**被删除的镜像缓存记录ID*/
    @JsonProperty("ImageCacheId")
    private String ImageCacheId;

}
