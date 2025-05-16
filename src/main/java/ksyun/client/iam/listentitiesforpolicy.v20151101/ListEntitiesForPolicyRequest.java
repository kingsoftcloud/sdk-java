package ksyun.client.iam.listentitiesforpolicy.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListEntitiesForPolicyRequest
 * @Description 请求参数
 */
@Data
public class ListEntitiesForPolicyRequest {
    /**
     * 待查询的策略krn
     */
    @KsYunField(name = "PolicyKrn")
    private String PolicyKrn;

    /**
     * 用于限制本次查询结果返回的关联实体数量，如果仍有额外关联实体未显示，则返回元素中的IsTruncated的值会被设置为true，同时返回下次查询的起始点Marker值
     */
    @KsYunField(name = "MaxItems")
    private Integer MaxItems;

    /**
     * 当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询关联实体操作的起始点
     */
    @KsYunField(name = "Marker")
    private String Marker;

}