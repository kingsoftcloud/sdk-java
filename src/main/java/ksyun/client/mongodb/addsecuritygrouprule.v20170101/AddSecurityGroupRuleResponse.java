package ksyun.client.mongodb.addsecuritygrouprule.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname AddSecurityGroupRuleResponse
 * @Description AddSecurityGroupRule 返回体
 */
@Data
@ToString
public class AddSecurityGroupRuleResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
