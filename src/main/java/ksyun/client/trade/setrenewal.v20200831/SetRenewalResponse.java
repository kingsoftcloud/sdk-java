package ksyun.client.trade.setrenewal.v20200831;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetRenewalResponse
* @Description SetRenewal 返回体
*/
@Data
@ToString
public class SetRenewalResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**是否设置成功*/
    @JsonProperty("success")
    private Boolean Success;

}
