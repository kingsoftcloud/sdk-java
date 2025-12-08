package ksyun.client.memcached.flushcachecluster.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname FlushCacheClusterResponse
* @Description FlushCacheCluster 返回体
*/
@Data
@ToString
public class FlushCacheClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
