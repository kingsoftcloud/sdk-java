package ksyun.client.krds.modifysecuritygrouprulename.v20200825;

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
    /**请求ID	
–*/
    @JsonProperty("RequestId")
    private String RequestId;

}
