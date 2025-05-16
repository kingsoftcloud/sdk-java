package ksyun.client.memcached.resizecachecluster.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname ResizeCacheClusterResponse
 * @Description ResizeCacheCluster 返回体
 */
@Data
@ToString
public class ResizeCacheClusterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
