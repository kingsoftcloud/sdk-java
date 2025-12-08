package ksyun.client.kfw.describecfwav.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeCfwAvResponse
* @Description DescribeCfwAv 返回体
*/
@Data
@ToString
public class DescribeCfwAvResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CfwAvs")
    private List<CfwAvsDto> CfwAvs;

    @Data
    @ToString
    public static class CfwAvsDto {
        /***/
        @JsonProperty("AvId")
        private String AvId;

        /***/
        @JsonProperty("Protocol")
        private String Protocol;

        /***/
        @JsonProperty("ProtectType")
        private String ProtectType;

        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
