package ksyun.client.trade.queryorderinfo.v20250321;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryOrderInfoResponse
* @Description QueryOrderInfo 返回体
*/
@Data
@ToString
public class QueryOrderInfoResponse extends BaseResponseModel {
    /**计费方式名称*/
    @JsonProperty("billName")
    private String BillName;

    /**创建时间，单位ms*/
    @JsonProperty("createTime")
    private Integer CreateTime;

    /**代金券优惠抵扣金额*/
    @JsonProperty("discountAmount")
    private Integer DiscountAmount;

    /**0-订单未支付;
1-订单已支付;
2-订单已取消;
4-退订订单已退款;
5-退订订单退款中;
20-因个别实例开通失败，部分退款，存在开通成功的实例;
21-全部实例开通失败，全部退款;*/
    @JsonProperty("hasRefund")
    private Integer HasRefund;

    /**订单ID*/
    @JsonProperty("orderId")
    private String OrderId;

    /**订单详情列表*/
    @JsonProperty("orderList")
    private List<OrderListDto> OrderList;

    @Data
    @ToString
    public static class OrderListDto {
        /**计费方式ID*/
        @JsonProperty("billType")
        private Integer BillType;

        /**项目制ID*/
        @JsonProperty("iamProjectId")
        private Integer IamProjectId;

        /**支付后产生的实例ID*/
        @JsonProperty("instanceId")
        private String InstanceId;

        /**当前商品配置购买数量*/
        @JsonProperty("num")
        private Integer Num;

        /**订单ID*/
        @JsonProperty("orderId")
        private String OrderId;

        /**折后价格*/
        @JsonProperty("price")
        private Integer Price;

        /**产品线ID*/
        @JsonProperty("productGroup")
        private Integer ProductGroup;

        /**产品线名称*/
        @JsonProperty("productGroupName")
        private String ProductGroupName;

        /**商品ID*/
        @JsonProperty("productId")
        private String ProductId;

        /**配置详情*/
        @JsonProperty("productItems")
        private List<OrderListDtoProductItemsDto> ProductItems;

        @Data
        @ToString
        public static class OrderListDtoProductItemsDto {
            /***/
            @JsonProperty("key")
            private String Key;

            /***/
            @JsonProperty("value")
            private String Value;

        }

        /**产品类型ID*/
        @JsonProperty("productType")
        private Integer ProductType;

        /**产品类型名称*/
        @JsonProperty("productTypeName")
        private String ProductTypeName;

        /**促销详情*/
        @JsonProperty("promotionItem")
        private OrderListDtoPromotionItemDto PromotionItem;

        @Data
        @ToString
        public static class OrderListDtoPromotionItemDto {
            /**活动名称*/
            @JsonProperty("name")
            private String Name;

            /***/
            @JsonProperty("type")
            private String Type;

        }

        /**订单服务开始时间,单位ms*/
        @JsonProperty("serviceBeginTime")
        private Integer ServiceBeginTime;

        /**订单服务结束时间，单位ms*/
        @JsonProperty("serviceEndTime")
        private Integer ServiceEndTime;

        /**0-订单未支付;
1-订单已支付;
2-订单已取消;
4-退订订单已退款;
5-退订订单退款中;
20-因个别实例开通失败，部分退款，存在开通成功的实例;
21-全部实例开通失败，全部退款;*/
        @JsonProperty("status")
        private Integer Status;

        /**子订单ID*/
        @JsonProperty("subOrderId")
        private String SubOrderId;

    }

    /**订单名称*/
    @JsonProperty("orderName")
    private String OrderName;

    /**订单类型：
1-试用订单;
2-常规订单;*/
    @JsonProperty("orderType")
    private Integer OrderType;

    /**订单用途：
0-未知;
1-购买;
2-续费;
3-更配;
4-试用;
5-转正;
7-退款;
8-延期;
9-修改计费类型;
10-更配及新购;*/
    @JsonProperty("orderUse")
    private Integer OrderUse;

    /**支付时间，单位ms*/
    @JsonProperty("payTime")
    private Integer PayTime;

    /**订单总待支付金额，单位：元*/
    @JsonProperty("payableMoney")
    private Integer PayableMoney;

    /**打折后支付金额，单位：元*/
    @JsonProperty("realMoney")
    private Integer RealMoney;

    /**0-订单未支付;
1-订单已支付;
2-订单已取消;
4-退订订单已退款;
5-退订订单退款中;
20-因个别实例开通失败，部分退款，存在开通成功的实例;
21-全部实例开通失败，全部退款;*/
    @JsonProperty("status")
    private Integer Status;

    /**订单总金额，官网原价*/
    @JsonProperty("totalMoney")
    private Integer TotalMoney;

    /**更新时间，单位ms*/
    @JsonProperty("updateTime")
    private Integer UpdateTime;

    /**userId*/
    @JsonProperty("userId")
    private Integer UserId;

}
