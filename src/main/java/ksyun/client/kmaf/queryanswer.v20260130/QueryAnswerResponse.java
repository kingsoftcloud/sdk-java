package ksyun.client.kmaf.queryanswer.v20260130;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname QueryAnswerResponse
* @Description QueryAnswer 返回体
*/
@Data
@ToString
public class QueryAnswerResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Message")
        private DataMessageDto Message;

        @Data
        @ToString
        public static class DataMessageDto {
            /***/
            @JsonProperty("Role")
            private String Role;

            /***/
            @JsonProperty("Content")
            private String Content;

            /***/
            @JsonProperty("ContentType")
            private Integer ContentType;

        }

        /***/
        @JsonProperty("IsFinished")
        private Boolean IsFinished;

        /***/
        @JsonProperty("MsgId")
        private String MsgId;

    }

}
