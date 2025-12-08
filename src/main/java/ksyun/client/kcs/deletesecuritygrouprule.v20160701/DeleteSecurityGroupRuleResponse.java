package ksyun.client.kcs.deletesecuritygrouprule.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSecurityGroupRuleResponse
* @Description DeleteSecurityGroupRule 返回体
*/
@Data
@ToString
public class DeleteSecurityGroupRuleResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
