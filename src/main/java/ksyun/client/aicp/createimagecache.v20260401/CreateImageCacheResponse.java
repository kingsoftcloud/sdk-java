package ksyun.client.aicp.createimagecache.v20260401;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateImageCacheResponse
* @Description CreateImageCache 返回体
*/
@Data
@ToString
public class CreateImageCacheResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**镜像缓存列表，单镜像返回1元素列表*/
    @JsonProperty("ImageCaches")
}
