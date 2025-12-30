package ksyun.client.clickhouse.createsecurityrule.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSecurityRuleResponse
* @Description CreateSecurityRule 返回体
*/
@Data
@ToString
public class CreateSecurityRuleResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private Boolean Data;

}
