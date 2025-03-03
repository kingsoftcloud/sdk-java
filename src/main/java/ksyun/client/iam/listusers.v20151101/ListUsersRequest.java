package ksyun.client.iam.listusers.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListUsersRequest
 * @Description 请求参数
 */
@Data
public class ListUsersRequest {
    /**
     * 当返回结果被截断时，使用本次返回的Marker值用于标示下次调用查询用户操作的起始点
     * <p>
     * 取值范围：1-320
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /**
     * 用于限制本次查询结果返回的用户数量，如果仍有额外用户未显示，则返回元素中的IsTruncated的值会被设置为true，同时返回下次查询的起始点Marker值
     * <p>
     * 取值范围：1 ~ 100。默认值：100。
     */
    @KsYunField(name = "MaxItems")
    private Integer MaxItems;

    /**
     * 用户ak
     */
    @KsYunField(name = "AccessKey")
    private String AccessKey;

}