package ksyun.client.aicp.creatememorycollection.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMemoryCollectionRequest
* @Description 请求参数
*/
@Data
public class CreateMemoryCollectionRequest{
    /**记忆库名称；
40位，允许字母、中文、数字、顿号、-、_、
.、\、/、(、)*/
    @KsYunField(name="Name")
    private String Name;

    /**记忆库描述；
200位，允许字母、中文、数字、顿号、-、_、\、/、(、)、.、空格*/
    @KsYunField(name="Description")
    private String Description;

    /***/
    @KsYunField(name="LongTermConfiguration")
    private LongTermConfigurationDto LongTermConfiguration;

    @Data
    @ToString
    public static class LongTermConfigurationDto {
        /***/
        @KsYunField(name="Strategies",type=2)
        private List<LongTermConfigurationStrategiesDto> StrategiesList;

        @Data
        @ToString
        public static class LongTermConfigurationStrategiesDto {
            /**场景ID，用来区分各个场景，提供精细化记忆提取策略
可选：
“_sys_work_assistant”、"_sys_travel_assistant"、"_sys_ai_chat_assistant"、"_sys_coding_assistant"、 “_sys_general”*/
            @KsYunField(name="Type")
            private String Type;

        }

    }

    /**记忆库类型：1-基础版，2-专业版，3-企业版*/
    @KsYunField(name="MemoryType")
    private String MemoryType;

    /**项目ID*/
    @KsYunField(name="ProjectId")
    private String ProjectId;

    /**计费方式*/
    @KsYunField(name="ChargeType")
    private String ChargeType;

}
