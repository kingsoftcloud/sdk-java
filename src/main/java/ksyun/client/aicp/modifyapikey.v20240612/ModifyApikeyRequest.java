package ksyun.client.aicp.modifyapikey.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyApikeyRequest
* @Description 请求参数
*/
@Data
public class ModifyApikeyRequest{
    /***/
    @KsYunField(name="KeyId")
    private String KeyId;

    /**API Key 名称*/
    @KsYunField(name="Name")
    private String Name;

    /**API Key 描述*/
    @KsYunField(name="Description")
    private String Description;

    /**API Key 关联的模型列表*/
    @KsYunField(name="AssociatedModelIds",type=2)
    private List<String> AssociatedModelIdsList;

    /**是否全选*/
    @KsYunField(name="AllAssociatedModel")
    private Boolean AllAssociatedModel;

    /**接入点列表*/
    @KsYunField(name="AllowEndpoints",type=2)
    private List<String> AllowEndpointsList;

    /**项目下所有资源全选*/
    @KsYunField(name="AllAssociatedProjectResources")
    private Boolean AllAssociatedProjectResources;

    /**接入点全选*/
    @KsYunField(name="AllAssociatedEndpoint")
    private Boolean AllAssociatedEndpoint;

    /**低价池(标准池)模型名称列表*/
    @KsYunField(name="LowPriceModels",type=2)
    private List<String> LowPriceModelsList;

    /**高价池模型名称列表*/
    @KsYunField(name="HighPriceModels",type=2)
    private List<String> HighPriceModelsList;

    /**闲时模型名称列表*/
    @KsYunField(name="OffpeakModels",type=2)
    private List<String> OffpeakModelsList;

    /**金额配额
缺省/空数组=不动金额配额*/
    @KsYunField(name="CostQuotas",type=2)
    private List<CostQuotasDto> CostQuotasList;

    @Data
    @ToString
    public static class CostQuotasDto {
        /**周期类型：cost_daily/cost_weekly/cost_monthly/cost_custom*/
        @KsYunField(name="QuotaType")
        private String QuotaType;

        /**配额上限（CNY 金额，整数，单位元）*/
        @KsYunField(name="QuotaLimit")
        private String QuotaLimit;

        /**自定义周期天数（仅 cost_custom 有效）*/
        @KsYunField(name="PeriodValue")
        private String PeriodValue;

        /**状态：1=启用，0=禁用*/
        @KsYunField(name="Status")
        private Integer Status;

        /**是否开启使用率告警*/
        @KsYunField(name="AlertEnabled")
        private Boolean AlertEnabled;

        /**告警阈值百分比（0-100），缺省 80*/
        @KsYunField(name="AlertThreshold")
        private Integer AlertThreshold;

    }

}
