package ksyun.client.kcs.allocateeip.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AllocateEipResponse
* @Description AllocateEip 返回体
*/
@Data
@ToString
public class AllocateEipResponse extends BaseResponseModel {

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
        @JsonProperty("master")
        private String Master;

        /***/
        @JsonProperty("readonly")
        private String Readonly;

        /***/
        @JsonProperty("proxy")
        private String Proxy;

    }

}
