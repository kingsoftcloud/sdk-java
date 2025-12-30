package ksyun.client.ebs.creatededicatedblockstoragecluster.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDedicatedBlockStorageClusterResponse
* @Description CreateDedicatedBlockStorageCluster 返回体
*/
@Data
@ToString
public class CreateDedicatedBlockStorageClusterResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("DbscId")
    private String DbscId;

}
