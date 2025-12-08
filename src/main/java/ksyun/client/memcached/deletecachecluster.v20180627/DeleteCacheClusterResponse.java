package ksyun.client.memcached.deletecachecluster.v20180627;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteCacheClusterResponse
* @Description DeleteCacheCluster 返回体
*/
@Data
@ToString
public class DeleteCacheClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
