package ksyun.client.memcached.deletecachecluster.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DeleteCacheClusterResponse
 * @Description DeleteCacheCluster 返回体
 */
@Data
@ToString
public class DeleteCacheClusterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
