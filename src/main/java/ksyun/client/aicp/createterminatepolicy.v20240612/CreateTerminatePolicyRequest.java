package ksyun.client.aicp.createterminatepolicy.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateTerminatePolicyRequest
* @Description 请求参数
*/
@Data
public class CreateTerminatePolicyRequest{
    /**名称*/
    @KsYunField(name="Name")
    private String Name;

    /**队列ID*/
    @KsYunField(name="QueueId")
    private String QueueId;

    /**关停策略类型
	- ResourceUseRate 资源使用率
	- WhiteList 白名单
*/
    @KsYunField(name="TerminatePolicyType")
    private String TerminatePolicyType;

    /**策略对象
	- Notebook 开发任务*/
    @KsYunField(name="TerminatePolicyTarget")
    private String TerminatePolicyTarget;

    /**资源ID列表，当 TerminatePolicyType = WhiteList时，可为空*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

    /**资源利用率配置，TerminatePolicyType = ResourceUseRate 必传*/
    @KsYunField(name="UseRatePolicy")
    private UseRatePolicyDto UseRatePolicy;

    @Data
    @ToString
    public static class UseRatePolicyDto {
        /**CPU使用率，NoSet或范围值[1 ~ 100]*/
        @KsYunField(name="Cpu")
        private String Cpu;

        /**内存利用率，NoSet或范围值[1 ~ 100]*/
        @KsYunField(name="Memory")
        private String Memory;

        /**GPU使用率，NoSet或范围值[1 ~ 100]*/
        @KsYunField(name="Gpu")
        private String Gpu;

        /**策略命中持续时长(单位，小时)*/
        @KsYunField(name="Hour")
        private Integer Hour;

    }

}
