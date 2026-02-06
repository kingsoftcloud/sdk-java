package ksyun.client.kcf.modifyautoscaledtrigger.v20211215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyAutoScaledTriggerRequest
* @Description 请求参数
*/
@Data
public class ModifyAutoScaledTriggerRequest{
    /***/
    @KsYunField(name="FucntionId")
    private String FucntionId;

    /**触发器名称*/
    @KsYunField(name="Name")
    private String Name;

    /**触发器配置。缺失的字段会采用原触发器值回填*/
    @KsYunField(name="TriggerConfig")
    private TriggerConfigDto TriggerConfig;

    @Data
    @ToString
    public static class TriggerConfigDto {
        /**qps弹性触发器参数：触发弹性伸缩所需的qps值，需小于300*/
        @KsYunField(name="QpsValue")
        private Integer QpsValue;

        /**定时弹性触发器参数：定时类型。
可选值如下：
NOREPEAT: 不重复，仅在指定时间段内生效一次
EVERYDAY: 每天生效
WORKDAY: 工作日（周一至周五）生效
WEEKEND: 周末（周六、周日）生效
CUSTOM: 自定义 Cron 表达式*/
        @KsYunField(name="CronType")
        private String CronType;

        /**开始生效时间（毫秒时间戳），不填表示持续生效*/
        @KsYunField(name="StartTime")
        private Long StartTime;

        /**结束生效时间（毫秒时间戳），不填表示持续生效*/
        @KsYunField(name="EndTime")
        private Long EndTime;

        /**定时弹性触发器参数：期望实例数*/
        @KsYunField(name="DesiredReplicas")
        private Integer DesiredReplicas;

        /**内存弹性触发器参数：内存类型，可选值如下：
AverageValue: 平均值模式，MemoryValue 表示平均内存使用量（MB）
Utilization: 利用率模式，MemoryValue 表示内存使用率百分比（0-100）*/
        @KsYunField(name="MemoryType")
        private String MemoryType;

        /**内存弹性触发器参数：内存阈值（百分比或绝对值）*/
        @KsYunField(name="MemoryValue")
        private Integer MemoryValue;

    }

}
