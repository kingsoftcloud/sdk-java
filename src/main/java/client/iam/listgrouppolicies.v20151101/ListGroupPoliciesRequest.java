package client.iam.listgrouppolicies.v20151101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListGroupPoliciesRequest
* @Description 请求参数
*/
@Data
public class ListGroupPoliciesRequest{
    /**用户组名称*/
    @KsYunField(name="GroupName")
    private String GroupName;

    /**最大返回个数，默认值100*/
    @KsYunField(name="MaxItems")
    private String MaxItems;

    /**当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询用户操作的起始点*/
    @KsYunField(name="Marker")
    private String Marker;


}