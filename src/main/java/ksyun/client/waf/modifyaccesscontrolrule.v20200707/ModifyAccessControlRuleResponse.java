package ksyun.client.waf.modifyaccesscontrolrule.v20200707;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAccessControlRuleResponse
* @Description ModifyAccessControlRule 返回体
*/
@Data
@ToString
public class ModifyAccessControlRuleResponse extends BaseResponseModel {

    /**

- 描述：请求id
- 类型：String

#### */
    @JsonProperty("RequestId")
    private String RequestId;

}
