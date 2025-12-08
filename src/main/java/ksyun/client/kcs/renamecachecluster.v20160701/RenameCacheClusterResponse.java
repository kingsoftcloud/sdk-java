package ksyun.client.kcs.renamecachecluster.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RenameCacheClusterResponse
* @Description RenameCacheCluster 返回体
*/
@Data
@ToString
public class RenameCacheClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
