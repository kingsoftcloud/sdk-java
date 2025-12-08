package ksyun.client.vpc.canceldirectconnectroutetobgp.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelDirectConnectRouteToBgpResponse
* @Description CancelDirectConnectRouteToBgp 返回体
*/
@Data
@ToString
public class CancelDirectConnectRouteToBgpResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**操作是否成功*/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
