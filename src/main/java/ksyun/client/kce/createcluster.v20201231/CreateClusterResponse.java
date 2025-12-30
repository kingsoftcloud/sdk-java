package ksyun.client.kce.createcluster.v20201231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateClusterResponse
* @Description CreateCluster 返回体
*/
@Data
@ToString
public class CreateClusterResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**集群id*/
    @JsonProperty("ClusterId")
    private String ClusterId;

}
