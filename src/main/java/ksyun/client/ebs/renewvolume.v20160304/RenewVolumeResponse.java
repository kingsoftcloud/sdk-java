package ksyun.client.ebs.renewvolume.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RenewVolumeResponse
* @Description RenewVolume 返回体
*/
@Data
@ToString
public class RenewVolumeResponse extends BaseResponseModel {
    /**唯一请求ID，每次请求都会返回*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**支付的费用*/
    @JsonProperty("PaidMoney")
    private Integer PaidMoney;

}
