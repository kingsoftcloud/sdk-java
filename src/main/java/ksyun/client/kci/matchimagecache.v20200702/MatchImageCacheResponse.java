package ksyun.client.kci.matchimagecache.v20200702;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname MatchImageCacheResponse
 * @Description MatchImageCache 返回体
 */
@Data
@ToString
public class MatchImageCacheResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
