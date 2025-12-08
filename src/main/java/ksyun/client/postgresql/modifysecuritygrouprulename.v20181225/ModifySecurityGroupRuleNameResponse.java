package ksyun.client.postgresql.modifysecuritygrouprulename.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifySecurityGroupRuleNameResponse
* @Description ModifySecurityGroupRuleName 返回体
*/
@Data
@ToString
public class ModifySecurityGroupRuleNameResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
