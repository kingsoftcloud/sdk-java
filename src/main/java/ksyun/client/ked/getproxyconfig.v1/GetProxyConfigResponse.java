package ksyun.client.ked.getproxyconfig.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetProxyConfigResponse
* @Description GetProxyConfig 返回体
*/
@Data
@ToString
public class GetProxyConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**固定值*/
        @JsonProperty("name")
        private String Name;

        /**代理创建时间*/
        @JsonProperty("create_time")
        private Integer Create_time;

        /***/
        @JsonProperty("city")
        private String City;

        /***/
        @JsonProperty("isp")
        private String Isp;

        /***/
        @JsonProperty("plan_uuid")
        private String Plan_uuid;

        /***/
        @JsonProperty("province")
        private String Province;

        /***/
        @JsonProperty("version")
        private String Version;

    }

}
