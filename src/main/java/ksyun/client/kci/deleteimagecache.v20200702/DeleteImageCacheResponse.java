package ksyun.client.kci.deleteimagecache.v20200702;

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

}
