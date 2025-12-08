package ksyun.client.kcs.restartcachecluster.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RestartCacheClusterResponse
* @Description RestartCacheCluster 返回体
*/
@Data
@ToString
public class RestartCacheClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
