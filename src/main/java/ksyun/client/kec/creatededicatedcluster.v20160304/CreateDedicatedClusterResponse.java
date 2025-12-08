package ksyun.client.kec.creatededicatedcluster.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDedicatedClusterResponse
* @Description CreateDedicatedCluster 返回体
*/
@Data
@ToString
public class CreateDedicatedClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DedicatedClusterId")
    private String DedicatedClusterId;

}
