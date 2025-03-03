package ksyun.client.pdns.bindzonevpc.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname BindZoneVpcResponse
 * @Description BindZoneVpc 返回体
 */
@Data
@ToString
public class BindZoneVpcResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
