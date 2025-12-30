package ksyun.client.tidb.updatesecurityrule.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateSecurityRuleResponse
* @Description UpdateSecurityRule 返回体
*/
@Data
@ToString
public class UpdateSecurityRuleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
