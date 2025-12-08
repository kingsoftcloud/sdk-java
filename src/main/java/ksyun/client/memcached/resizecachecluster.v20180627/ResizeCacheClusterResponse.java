package ksyun.client.memcached.resizecachecluster.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResizeCacheClusterResponse
* @Description ResizeCacheCluster 返回体
*/
@Data
@ToString
public class ResizeCacheClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
