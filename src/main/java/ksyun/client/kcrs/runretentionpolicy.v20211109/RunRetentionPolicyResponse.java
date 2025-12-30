package ksyun.client.kcrs.runretentionpolicy.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RunRetentionPolicyResponse
* @Description RunRetentionPolicy 返回体
*/
@Data
@ToString
public class RunRetentionPolicyResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回信息*/
    @JsonProperty("Data")
    private String Data;

}
