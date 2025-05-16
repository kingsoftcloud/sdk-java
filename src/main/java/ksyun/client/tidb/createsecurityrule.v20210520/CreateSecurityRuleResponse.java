package ksyun.client.tidb.createsecurityrule.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CreateSecurityRuleResponse
 * @Description CreateSecurityRule 返回体
 */
@Data
@ToString
public class CreateSecurityRuleResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
