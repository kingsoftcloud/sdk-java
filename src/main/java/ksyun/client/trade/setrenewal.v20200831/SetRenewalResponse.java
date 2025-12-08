package ksyun.client.trade.setrenewal.v20200831;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname SetRenewalResponse
* @Description SetRenewal 返回体
*/
@Data
@ToString
public class SetRenewalResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
