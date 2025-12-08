package ksyun.client.waf.createwaf.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateWafResponse
* @Description CreateWaf 返回体
*/
@Data
@ToString
public class CreateWafResponse extends BaseResponseModel {
    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**WAF实例信息*/
    @JsonProperty("WafInfo")
    private String WafInfo;

}
