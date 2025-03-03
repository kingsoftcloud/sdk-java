package ksyun.client.vpc.rejectvpcpeeringconnection.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname RejectVpcPeeringConnectionResponse
 * @Description RejectVpcPeeringConnection 返回体
 */
@Data
@ToString
public class RejectVpcPeeringConnectionResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
