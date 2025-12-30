package ksyun.client.kec.createaccessrule.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAccessRuleResponse
* @Description CreateAccessRule 返回体
*/
@Data
@ToString
public class CreateAccessRuleResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限组规则ID*/
    @JsonProperty("AccessRuleIds")
    private List<String> AccessRuleIds;

}
