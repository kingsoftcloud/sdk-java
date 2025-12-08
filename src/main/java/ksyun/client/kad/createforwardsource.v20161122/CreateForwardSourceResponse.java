package ksyun.client.kad.createforwardsource.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateForwardSourceResponse
* @Description CreateForwardSource 返回体
*/
@Data
@ToString
public class CreateForwardSourceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Response")
    private ResponseDto Response;

    @Data
    @ToString
    public static class ResponseDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("ForwardSource")
        private ResponseDtoForwardSourceDto ForwardSource;

        @Data
        @ToString
        public static class ResponseDtoForwardSourceDto {
            /***/
            @JsonProperty("ForwardConfId")
            private String ForwardConfId;

            /***/
            @JsonProperty("ForwardSourceId")
            private String ForwardSourceId;

            /***/
            @JsonProperty("SourceIp")
            private String SourceIp;

            /***/
            @JsonProperty("SourcePort")
            private String SourcePort;

        }

    }

}
