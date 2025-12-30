package ksyun.client.kci.updateimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateImageCacheResponse
* @Description UpdateImageCache 返回体
*/
@Data
@ToString
public class UpdateImageCacheResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**镜像缓存ID*/
    @JsonProperty("ImageCacheId")
    private String ImageCacheId;

}
