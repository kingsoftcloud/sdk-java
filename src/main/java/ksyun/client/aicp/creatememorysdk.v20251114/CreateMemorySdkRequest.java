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
    /***/
    @KsYunField(name="Namespace")
    private String Namespace;

    /***/
    @KsYunField(name="UserId")
    private String UserId;

    /***/
    @KsYunField(name="AgentId")
    private String AgentId;

    /***/
    @KsYunField(name="SessionId")
    private String SessionId;

    /***/
    @KsYunField(name="SceneId")
    private String SceneId;

    /***/
    @KsYunField(name="DataType")
    private String DataType;

    /***/
    @KsYunField(name="Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @KsYunField(name="Conversation",type=2)
        private List<DataConversationDto> ConversationList;

        @Data
        @ToString
        public static class DataConversationDto {
            /***/
            @KsYunField(name="Role")
            private String Role;

            /***/
            @KsYunField(name="CreatedAt")
            private Long CreatedAt;

            /***/
            @KsYunField(name="MessageId")
            private String MessageId;

            /***/
            @KsYunField(name="Content",type=2)
            private List<DataConversationContentDto> ContentList;

            @Data
            @ToString
            public static class DataConversationContentDto {
                /***/
                @KsYunField(name="Type")
                private String Type;

                /***/
                @KsYunField(name="Text")
                private String Text;

            }

        }

    }

}
