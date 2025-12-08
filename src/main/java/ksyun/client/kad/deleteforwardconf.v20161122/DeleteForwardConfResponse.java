package ksyun.client.kad.deleteforwardconf.v20161122;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteForwardConfResponse
* @Description DeleteForwardConf 返回体
*/
@Data
@ToString
public class DeleteForwardConfResponse extends BaseResponseModel {
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
        @JsonProperty("ForwardConfSet")
        private ForwardConfSetDto ForwardConfSet;

        @Data
        @ToString
        public static class ForwardConfSetDto {
            /***/
            @JsonProperty("item")
            private List<ItemDto> Item;

            @Data
            @ToString
            public static class ItemDto {
                /***/
                @JsonProperty("ForwardConfId")
                private String ForwardConfId;

                /***/
                @JsonProperty("Return")
                private String ReturnField;

                /***/
                @JsonProperty("message")
                private String Message;

            }

        }

    }

}
