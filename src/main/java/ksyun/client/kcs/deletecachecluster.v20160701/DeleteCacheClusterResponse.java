package ksyun.client.kcs.deletecachecluster.v20160701;

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

}
