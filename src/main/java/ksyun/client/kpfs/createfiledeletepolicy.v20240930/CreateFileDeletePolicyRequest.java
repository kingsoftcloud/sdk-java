package ksyun.client.kpfs.createfiledeletepolicy.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateFileDeletePolicyRequest
* @Description 请求参数
*/
@Data
public class CreateFileDeletePolicyRequest{
    /**文件系统的实例ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**文件删除策略名称
格式要求：允许字符长度:1-63，允许包含一下字符:数字 字母 + = . @ _ -，不能以 . 字符开头*/
    @KsYunField(name="FileDeletePolicyName")
    private String FileDeletePolicyName;

    /**目录绝对路径*/
    @KsYunField(name="DirPath")
    private String DirPath;

    /**执行类型
有效值：
• 周期执行：CycleExecution
• 立即执行：ImmediateExecution
• 默认：CycleExecution*/
    @KsYunField(name="ExecutionType")
    private String ExecutionType;

    /**文件删除策略执行频率。
有效值：
• day：按天
• week：按周
• month：按月*/
    @KsYunField(name="FrequencyUnit")
    private String FrequencyUnit;

    /**文件删除策略执行日期。
• 按天不传
• 按周（必传） （1-7  可多选）
• 按月（必传）（1-30 可多选）*/
    @KsYunField(name="IndexOfFrequency",type=2)
    private List<Integer> IndexOfFrequencyList;

    /**文件删除策略定期执行时间点，只支持小时（整点）*/
    @KsYunField(name="FrequencyTimePoints",type=2)
    private List<FrequencyTimePointsDto> FrequencyTimePointsList;

    @Data
    @ToString
    public static class FrequencyTimePointsDto {
        /**开始时间*/
        @KsYunField(name="Start")
        private FrequencyTimePointsStartDto Start;

        @Data
        @ToString
        public static class FrequencyTimePointsStartDto {
            /**删除策略执行开始时间（0~23）*/
            @KsYunField(name="Hour")
            private Integer Hour;

        }

        /**结束时间*/
        @KsYunField(name="End")
        private FrequencyTimePointsEndDto End;

        @Data
        @ToString
        public static class FrequencyTimePointsEndDto {
            /**删除策略执行结束时间（0~23）*/
            @KsYunField(name="Hour")
            private Integer Hour;

        }

    }

    /**文件名过滤规则*/
    @KsYunField(name="FileNameRule")
    private FileNameRuleDto FileNameRule;

    @Data
    @ToString
    public static class FileNameRuleDto {
        /**文件名过滤规则关键字格式要求:
• 允许字符长度：0-31 
• 以，分隔
• 支持？和*通配符
• 默认为全部*/
        @KsYunField(name="Rule")
        private String Rule;

    }

    /**文件大小过滤规则*/
    @KsYunField(name="FileSizeRule")
    private FileSizeRuleDto FileSizeRule;

    @Data
    @ToString
    public static class FileSizeRuleDto {
        /**文件大小过滤规则: 小于等于，大于 介于三种
• LE:小于等于最大值maxValue
• GT: 大于最小值minValue
• BT: 介于，左闭右开 [minValue,maxValue)*/
        @KsYunField(name="Rule")
        private String Rule;

        /**最大值 值范围：正整数*/
        @KsYunField(name="MaxValue")
        private Integer MaxValue;

        /**最小值 值范围：正整数*/
        @KsYunField(name="MinValue")
        private Integer MinValue;

        /**文件大小单位:KB，MB ,GB
• KB: 存储容量单位KB
• MB: 存储容量单位MB
• GB:存储容量单位GB*/
        @KsYunField(name="Unit")
        private String Unit;

    }

    /**时间参数*/
    @KsYunField(name="TimeRuleParameters",type=2)
    private List<TimeRuleParametersDto> TimeRuleParametersList;

    @Data
    @ToString
    public static class TimeRuleParametersDto {
        /**时间参数的类型:修改时间，访问时间，元素数据修改时间
• UPDATE_TIME:修改时间
• ACCESS_TIME:访问时间
• META_UPDATE_TIME:元数据修改时间*/
        @KsYunField(name="Type")
        private String Type;

        /**时间参数字段的操作类型
• ACCESS:访问\修改
• NO_ACCESS:未访问\未修改*/
        @KsYunField(name="OpType")
        private String OpType;

        /**单位小时内，天内，月内
• MIN:分钟
• HOUR:小时
• DAY:天
• MONTH:月*/
        @KsYunField(name="Unit")
        private String Unit;

        /**指定具体时间点 值范围：正整数*/
        @KsYunField(name="Value")
        private Integer Value;

    }

    /**文件删除策略备注信息
（限制）:允许字符长度:0-63，允许包含以下字符:数字 字母 中文 + = . @ _ -*/
    @KsYunField(name="Description")
    private String Description;

}
