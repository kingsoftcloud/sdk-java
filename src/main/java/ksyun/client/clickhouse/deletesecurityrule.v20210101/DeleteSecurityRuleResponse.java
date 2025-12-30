package ksyun.client.clickhouse.deletesecurityrule.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSecurityRuleResponse
* @Description DeleteSecurityRule 返回体
*/
@Data
@ToString
public class DeleteSecurityRuleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
