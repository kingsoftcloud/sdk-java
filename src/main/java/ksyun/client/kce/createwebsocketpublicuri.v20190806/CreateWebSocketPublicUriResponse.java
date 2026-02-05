package ksyun.client.kce.createwebsocketpublicuri.v20190806;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateWebSocketPublicUriResponse
* @Description CreateWebSocketPublicUri 返回体
*/
@Data
@ToString
public class CreateWebSocketPublicUriResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**exec公网链接*/
        @JsonProperty("WsURL")
        private String WsURL;

    }

}
