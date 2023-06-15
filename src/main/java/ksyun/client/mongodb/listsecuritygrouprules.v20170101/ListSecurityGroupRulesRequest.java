package ksyun.client.mongodb.listsecuritygrouprules.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListSecurityGroupRulesRequest
* @Description 请求参数
*/
@Data
public class ListSecurityGroupRulesRequest{
    /**实例ID */
    @KsYunField(name="InstanceId")
    private String InstanceId;


}