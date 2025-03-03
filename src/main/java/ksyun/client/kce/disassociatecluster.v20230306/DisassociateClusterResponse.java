package ksyun.client.kce.disassociatecluster.v20230306;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname DisassociateClusterResponse
 * @Description DisassociateCluster 返回体
 */
@Data
@ToString
public class DisassociateClusterResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
