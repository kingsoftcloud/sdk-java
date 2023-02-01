package ksyun.client.iam.listattachedrolepolicies.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAttachedRolePoliciesRequest
* @Description 请求参数
*/
@Data
public class ListAttachedRolePoliciesRequest{
    /**角色名称*/
    @KsYunField(name="RoleName")
    private String RoleName;

    /**当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询操作的起始点，Marker值不会过期*/
    @KsYunField(name="Marker")
    private String Marker;

    /**用于限制本次查询结果返回的数量，如果仍有额外元素未显示，则返回元素中的IsTruncated的值会被设置为true，同时返回下次查询的起始点Marker值*/
    @KsYunField(name="MaxItems")
    private Integer MaxItems;


}