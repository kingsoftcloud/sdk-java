package ksyun.client.aicp.creatememorysdk.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMemorySdkRequest
* @Description 请求参数
*/
@Data
public class CreateMemorySdkRequest{
    /**运行时Agent id，标签*/
    @KsYunField(name="AgentId")
    private String AgentId;

    /**对话ID，区分多个对话*/
    @KsYunField(name="SessionId")
    private String SessionId;

    /**场景ID，用来区分各个场景，提供精细化记忆提取策略
可选：
"_sys_work_assistant"、"_sys_travel_assistant"、"_sys_ai_chat_assistant"、"_sys_coding_assistant"、 "_sys_general"*/
    @KsYunField(name="SceneId")
    private String SceneId;

    /**input对应的数据类型*/
    @KsYunField(name="DataType")
    private String DataType;

    /**原始数据内容*/
    @KsYunField(name="Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**人机对话列表*/
        @KsYunField(name="Conversation",type=2)
        private List<DataConversationDto> ConversationList;

        @Data
        @ToString
        public static class DataConversationDto {
            /**角色*/
            @KsYunField(name="Role")
            private String Role;

            /**对话时间戳（毫秒）*/
            @KsYunField(name="CreatedAt")
            private Long CreatedAt;

            /**消息ID*/
            @KsYunField(name="MessageId")
            private String MessageId;

            /**数据类型*/
            @KsYunField(name="Content",type=2)
            private List<DataConversationContentDto> ContentList;

            @Data
            @ToString
            public static class DataConversationContentDto {
                /**数据类型：暂仅支持文本数据类型（input_text）*/
                @KsYunField(name="Type")
                private String Type;

                /**文本内容*/
                @KsYunField(name="Text")
                private String Text;

            }

        }

    }

    /**与Agent交互的用户唯一标识*/
    @KsYunField(name="AgentUserId")
    private String AgentUserId;

    /**记忆库ID*/
    @KsYunField(name="MemoryCollectionId")
    private String MemoryCollectionId;

    /**强制提取记忆
> true: 强制当前seesion下的原始对话切分并提取记忆，false: 走默认流程*/
    @KsYunField(name="Flush")
    private Boolean Flush;

}
