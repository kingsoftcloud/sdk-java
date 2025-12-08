package ksyun.client.kcs.opendirectaccesstocluster.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname OpenDirectAccessToClusterResponse
* @Description OpenDirectAccessToCluster 返回体
*/
@Data
@ToString
public class OpenDirectAccessToClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
