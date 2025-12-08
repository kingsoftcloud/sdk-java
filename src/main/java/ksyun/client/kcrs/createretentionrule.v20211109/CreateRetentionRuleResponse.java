package ksyun.client.kcrs.createretentionrule.v20211109;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateRetentionRuleResponse
* @Description CreateRetentionRule 返回体
*/
@Data
@ToString
public class CreateRetentionRuleResponse extends BaseResponseModel {
    /**请求Id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回信息*/
    @JsonProperty("Data")
    private String Data;

}
