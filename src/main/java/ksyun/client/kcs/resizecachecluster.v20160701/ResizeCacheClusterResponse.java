package ksyun.client.kcs.resizecachecluster.v20160701;

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

}
