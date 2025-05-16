package ksyun.client.iam.listpolicies.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListPoliciesRequest
 * @Description 请求参数
 */
@Data
public class ListPoliciesRequest {
    /**
     * 当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询策略信息列表操作的起始点
     * <p>
     * 最短1,最长320
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /**
     * 用于限制本次查询结果返回的策略数量，如果仍有额外策略未显示，则返回元素中的IsTruncated的值会被设置为true，同时返回下次查询的起始点Marker值
     * 最小值1，最大值1000，默认100
     */
    @KsYunField(name = "MaxItems")
    private String MaxItems;

    /**
     * 可选参数，用于过滤策略列表，如果设置则只返回已经附加到实体上策略
     */
    @KsYunField(name = "OnlyAttached")
    private Boolean OnlyAttached;

    /**
     * 用于过滤显示策略范围，ALL为全部，KSC是系统策略、Local是自定义策略
     */
    @KsYunField(name = "Scope")
    private String Scope;

}