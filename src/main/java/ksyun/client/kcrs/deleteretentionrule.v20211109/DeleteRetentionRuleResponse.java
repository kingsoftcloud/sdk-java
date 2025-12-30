package ksyun.client.kcrs.deleteretentionrule.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteRetentionRuleResponse
* @Description DeleteRetentionRule 返回体
*/
@Data
@ToString
public class DeleteRetentionRuleResponse extends BaseResponseModel {

    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回信息*/
    @JsonProperty("Data")
    private String Data;

}
