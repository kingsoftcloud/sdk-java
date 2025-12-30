package ksyun.client.kec.deleteaccessrule.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAccessRuleRequest
* @Description 请求参数
*/
@Data
public class DeleteAccessRuleRequest{
    /**权限组ID*/
    @KsYunField(name="AccessGroupId")
    private String AccessGroupId;

    /**权限组规则ID*/
    @KsYunField(name="AccessRuleId",type=1)
    private List<String> AccessRuleIdList;

}
