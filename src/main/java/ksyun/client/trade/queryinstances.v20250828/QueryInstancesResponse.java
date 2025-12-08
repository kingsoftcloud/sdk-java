package ksyun.client.trade.queryinstances.v20250828;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryInstancesResponse
* @Description QueryInstances 返回体
*/
@Data
@ToString
public class QueryInstancesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例列表*/
        @JsonProperty("retResponse")
        private List<RetResponseDto> RetResponse;

        @Data
        @ToString
        public static class RetResponseDto {
            /**计费方式ID*/
            @JsonProperty("billType")
            private Integer BillType;

            /**计费方式名称*/
            @JsonProperty("billTypeName")
            private String BillTypeName;

            /**计费开始时间*/
            @JsonProperty("billingBeginTime")
            private String BillingBeginTime;

            /**计费结束时间*/
            @JsonProperty("billingEndTime")
            private String BillingEndTime;

            /**创建时间*/
            @JsonProperty("createTime")
            private String CreateTime;

            /**项目制ID*/
            @JsonProperty("iamProjectId")
            private Integer IamProjectId;

            /**实例ID*/
            @JsonProperty("instanceId")
            private String InstanceId;

            /**实例类型名称：1-正式，2-试用*/
            @JsonProperty("instanceType")
            private Integer InstanceType;

            /***/
            @JsonProperty("instanceTypeName")
            private String InstanceTypeName;

            /**计费类别*/
            @JsonProperty("payTypeName")
            private String PayTypeName;

            /**产品线ID
ID可以通过“价格体系”的QueryProductTypes接口查询*/
            @JsonProperty("productGroup")
            private Integer ProductGroup;

            /**产品类型ID。
ID可以通过“价格体系”的QueryProductTypes接口查询*/
            @JsonProperty("productType")
            private Integer ProductType;

            /**产品类型名称*/
            @JsonProperty("productTypeName")
            private String ProductTypeName;

            /**机房code*/
            @JsonProperty("region")
            private String Region;

            /**机房名称*/
            @JsonProperty("regionName")
            private String RegionName;

            /**自动续费周期，单位月*/
            @JsonProperty("renewDuration")
            private Integer RenewDuration;

            /**续费策略
枚举值：0 手动续费，1 自动续费*/
            @JsonProperty("renewStrategy")
            private Integer RenewStrategy;

            /**续费策略枚举值名称*/
            @JsonProperty("renewStrategyName")
            private String RenewStrategyName;

            /**实例状态
枚举值如下：1-创建中,2-已开通,3-开通失败,4-已过期,5-已回收,6-已退订,7-已删除,8-已欠费,9-欠费回收,10-一键关停,11-一键回收,12-退订中*/
            @JsonProperty("status")
            private Integer Status;

            /**实例状态枚举值名称*/
            @JsonProperty("statusName")
            private String StatusName;

            /**用户ID*/
            @JsonProperty("userId")
            private Integer UserId;

        }

        /**实例总数*/
        @JsonProperty("total")
        private Integer Total;

    }

}
