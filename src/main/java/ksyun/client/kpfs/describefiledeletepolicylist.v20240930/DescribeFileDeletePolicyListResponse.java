package ksyun.client.kpfs.describefiledeletepolicylist.v20240930;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeFileDeletePolicyListResponse
* @Description DescribeFileDeletePolicyList 返回体
*/
@Data
@ToString
public class DescribeFileDeletePolicyListResponse extends BaseResponseModel {

    /**记录总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**当前页记录数*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**当前页码*/
    @JsonProperty("PageNumber")
    private Integer PageNumber;

    /***/
    @JsonProperty("FileDeletePolicyList")
    private List<FileDeletePolicyListDto> FileDeletePolicyList;

    @Data
    @ToString
    public static class FileDeletePolicyListDto {
        /**文件系统的实例ID*/
        @JsonProperty("FileSystemId")
        private String FileSystemId;

        /**文件系统的实例名称*/
        @JsonProperty("FileSystemName")
        private String FileSystemName;

        /**文件删除策略ID*/
        @JsonProperty("FileDeletePolicyId")
        private String FileDeletePolicyId;

        /**目录绝对路径*/
        @JsonProperty("DirPath")
        private String DirPath;

        /**执行类型
有效值：
• 周期执行：CycleExecution
• 立即执行：ImmediateExecution
• 默认：CycleExecution*/
        @JsonProperty("ExecutionType")
        private String ExecutionType;

        /**文件删除策略执行频率。
有效值：
• day：按天
• week：按周
• month：按月*/
        @JsonProperty("FrequencyUnit")
        private String FrequencyUnit;

        /**文件删除策略执行日期*/
        @JsonProperty("IndexOfFrequency")
        private List<Integer> IndexOfFrequency;

        /**文件删除策略定期执行时间点，只支持小时（整点）*/
        @JsonProperty("FrequencyTimePoints")
        private List<FileDeletePolicyListFrequencyTimePointsDto> FrequencyTimePoints;

        @Data
        @ToString
        public static class FileDeletePolicyListFrequencyTimePointsDto {
            /**开始时间*/
            @JsonProperty("Start")
            private FileDeletePolicyListFrequencyTimePointsStartDto Start;

            @Data
            @ToString
            public static class FileDeletePolicyListFrequencyTimePointsStartDto {
                /**删除策略执行开始时间（0~23）*/
                @JsonProperty("Hour")
                private Integer Hour;

            }

            /**结束时间*/
            @JsonProperty("End")
            private FileDeletePolicyListFrequencyTimePointsEndDto End;

            @Data
            @ToString
            public static class FileDeletePolicyListFrequencyTimePointsEndDto {
                /**删除策略执行结束时间（0~23）*/
                @JsonProperty("Hour")
                private Integer Hour;

            }

        }

        /**文件大小规则*/
        @JsonProperty("FileSizeRule")
        private FileDeletePolicyListFileSizeRuleDto FileSizeRule;

        @Data
        @ToString
        public static class FileDeletePolicyListFileSizeRuleDto {
            /**文件大小过滤规则:小于等于，大于 介于三种
• LE:小于等于最大值MaxValue
• GT: 大于最小值MinValue
• BT: 介于，左闭右开 [MinValue,MaxValue)*/
            @JsonProperty("Rule")
            private String Rule;

            /**最大值 值范围：正整数*/
            @JsonProperty("MaxValue")
            private Integer MaxValue;

            /**文件大小单位:KB，MB ,GB
• KB: 存储容量单位KB
• MB: 存储容量单位MB
• GB:存储容量单位GB*/
            @JsonProperty("Unit")
            private String Unit;

            /**最小值 值范围：正整数*/
            @JsonProperty("MinValue")
            private Integer MinValue;

        }

        /**时间参数规则*/
        @JsonProperty("TimeRuleParameters")
        private List<FileDeletePolicyListTimeRuleParametersDto> TimeRuleParameters;

        @Data
        @ToString
        public static class FileDeletePolicyListTimeRuleParametersDto {
            /**时间参数的类型:修改时间，访问时间，元素数据修改时间
• UPDATE_TIME:修改时间
• ACCESS_TIME:访问时间
• META_UPDATE_TIME:元数据修改时间*/
            @JsonProperty("Type")
            private String Type;

            /**时间参数字段的操作类型
•   ACCESS:访问\修改
•   NO_ACCESS:未访问\未修改*/
            @JsonProperty("OpType")
            private String OpType;

            /**单位小时内，天内，月内
• MIN:分钟
• HOUR:小时
• DAY:天
• MONTH:月*/
            @JsonProperty("Unit")
            private String Unit;

            /**指定具体时间点 值范围：正整数*/
            @JsonProperty("Value")
            private Integer Value;

        }

        /**删除策略状态值*/
        @JsonProperty("DeletePolicyStatus")
        private String DeletePolicyStatus;

        /**创建删除策略时间*/
        @JsonProperty("CreateTime")
        private Long CreateTime;

        /**件删除策略备注信息
（限制）:允许字符长度:0-63，允许包含以下字符:数字 字母 中文 + = . @ _ -*/
        @JsonProperty("Description")
        private String Description;

        /**文件名过滤规则
格式要求:
• 允许字符长度：0-31 
• 以，分隔
• 支持？和*通配符
• 默认为全部*/
        @JsonProperty("FileNameRule")
        private FileDeletePolicyListFileNameRuleDto FileNameRule;

        @Data
        @ToString
        public static class FileDeletePolicyListFileNameRuleDto {
            /**文件名过滤规则关键字*/
            @JsonProperty("Rule")
            private String Rule;

        }

        /**文件删除策略名称：允许字符长度:1-63
允许包含一下字符:数字 字母 + = . @ _ -
不能以 . 字符开头*/
        @JsonProperty("FileDeletePolicyName")
        private String FileDeletePolicyName;

    }

}
