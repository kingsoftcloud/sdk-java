package ksyun.client.ked.monitorregions.v1;

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
        private List<DataRegionsDto> Regions;

        @Data
        @ToString
        public static class DataRegionsDto {
            /**显示名称*/
            @JsonProperty("name")
            private String Name;

            /**区域 id*/
            @JsonProperty("value")
            private String Value;

        }

    }

}
