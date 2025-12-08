package ksyun.client.iam.listattacheduserpolicies.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListAttachedUserPoliciesRequest
* @Description 请求参数
*/
@Data
public class ListAttachedUserPoliciesRequest{
    /**待查询策略列表的目标用户名*/
    @KsYunField(name="UserName")
    private String UserName;

    /**当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询策略信息列表操作的起始点
最短1,最长320*/
    @KsYunField(name="Marker")
    private String Marker;

    /**用于限制本次查询结果返回的策略数量，如果仍有额外策略未显示，则返回元素中的IsTruncated的值会被设置为true，同时返回下次查询的起始点Marker值
最小值1，最大值1000，默认100*/
    @KsYunField(name="MaxItems")
    private String MaxItems;

}
