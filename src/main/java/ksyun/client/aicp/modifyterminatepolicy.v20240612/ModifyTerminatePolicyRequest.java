package ksyun.client.aicp.modifyterminatepolicy.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyTerminatePolicyRequest
* @Description 请求参数
*/
@Data
public class ModifyTerminatePolicyRequest{
    /**名称。若不传入则保持原值*/
    @KsYunField(name="Name")
    private String Name;

    /**资源ID列表，当 TerminatePolicyType = WhiteList时，可传。若不传入则保持原值，传入则覆盖式修改*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

    /**资源利用率配置，TerminatePolicyType = ResourceUseRate 可传*/
    @KsYunField(name="UseRatePolicy")
    private UseRatePolicyDto UseRatePolicy;

    @Data
    @ToString
    public static class UseRatePolicyDto {
        /**CPU使用率，NoSet或范围值[1 ~ 100]。若不传入则保持原值*/
        @KsYunField(name="Cpu")
        private String Cpu;

        /**内存利用率，NoSet或范围值[1 ~ 100]。若不传入则保持原值*/
        @KsYunField(name="Memory")
        private String Memory;

        /**GPU使用率，NoSet或范围值[1 ~ 100]。若不传入则保持原值*/
        @KsYunField(name="Gpu")
        private String Gpu;

        /**策略命中持续时长(单位，小时)。若不传入则保持原值*/
        @KsYunField(name="Hour")
        private Integer Hour;

    }

    /**关停策略ID*/
    @KsYunField(name="TerminatePolicyId")
    private String TerminatePolicyId;

}
