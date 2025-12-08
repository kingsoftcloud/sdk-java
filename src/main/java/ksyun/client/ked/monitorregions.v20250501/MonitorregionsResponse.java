package ksyun.client.ked.monitorregions.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname MonitorregionsResponse
* @Description Monitorregions 返回体
*/
@Data
@ToString
public class MonitorregionsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("regions")
        private List<RegionsDto> Regions;

        @Data
        @ToString
        public static class RegionsDto {
            /**显示名称*/
            @JsonProperty("name")
            private String Name;

            /**区域 id*/
            @JsonProperty("value")
            private String Value;

        }

    }

}
