package ksyun.client.ked.setproxyip.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetProxyIpResponse
* @Description SetProxyIp 返回体
*/
@Data
@ToString
public class SetProxyIpResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**配置id*/
        @JsonProperty("planId")
        private Integer PlanId;

    }

}
