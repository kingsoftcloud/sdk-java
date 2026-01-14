package ksyun.client.trade.queryinstances.v20250828;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname QueryInstancesRequest
* @Description 请求参数
*/
@Data
public class QueryInstancesRequest{
    /**企业账号中心关联用户ID。如果空，则会返回企业账号中心有查看权限的用户ID下的实例。*/
    @KsYunField(name="associatedUserId")
    private Long AssociatedUserId;

    /**实例ID列表*/
    @KsYunField(name="instanceIds",type=2)
    private List<String> InstanceIdsList;

    /**实例状态，默认值为2.
枚举值如下：1-创建中,2-已开通,3-开通失败,4-已过期,5-已回收,6-已退订,7-已删除,8-已欠费,9-欠费回收,10-一键关停,11-一键回收,12-退订中*/
    @KsYunField(name="status")
    private Integer Status;

    /**产品线ID，ID可以通过“价格体系”的QueryProductTypes接口查询*/
    @KsYunField(name="productGroup")
    private Integer ProductGroup;

    /**续费策略：0 手动续费，1 自动续费*/
    @KsYunField(name="renewStrategy")
    private Integer RenewStrategy;

    /**计费开始时间起始，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="billingBeginTimeFrom")
    private String BillingBeginTimeFrom;

    /**计费开始时间结束，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="billingBeginTimeTo")
    private String BillingBeginTimeTo;

    /**计费结束时间起始，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="billingEndTimeFrom")
    private String BillingEndTimeFrom;

    /**计费结束时间结束，格式：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="billingEndTimeTo")
    private String BillingEndTimeTo;

    /**服务开始时间起始，格式：yyyy-MM-dd HH:mm:ss
和计费开始时间的区别是因为有试用，所以服务时间不等于计费时间。*/
    @KsYunField(name="serviceBeginTimeFrom")
    private String ServiceBeginTimeFrom;

    /**服务开始时间结束，格式：yyyy-MM-dd HH:mm:ss
和计费开始时间的区别是因为有试用，所以服务时间不等于计费时间。*/
    @KsYunField(name="serviceBeginTimeTo")
    private String ServiceBeginTimeTo;

    /**页数，从1开始，默认1*/
    @KsYunField(name="page")
    private Integer Page;

    /**页大小，默认10*/
    @KsYunField(name="size")
    private Integer Size;

}
