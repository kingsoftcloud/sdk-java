package ksyun.client.kcs.closedirectaccesstocluster.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloseDirectAccessToClusterResponse
* @Description CloseDirectAccessToCluster 返回体
*/
@Data
@ToString
public class CloseDirectAccessToClusterResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
