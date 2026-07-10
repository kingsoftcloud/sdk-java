package ksyun.client.aicp.updatememorycollection.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateMemoryCollectionRequest
* @Description 请求参数
*/
@Data
public class UpdateMemoryCollectionRequest{
    /**待修改的记忆库唯一 ID，不可为空*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**记忆库描述；
200位，允许字母、中文、数字、顿号、-、_、\、/、(、)、.、空格
不传则不修改原有描述*/
    @KsYunField(name="Description")
    private String Description;

    /**记忆库名称；
40位，允许字母、中文、数字、顿号、-、_、
.、\、/、(、)*/
    @KsYunField(name="Name")
    private String Name;

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

}
