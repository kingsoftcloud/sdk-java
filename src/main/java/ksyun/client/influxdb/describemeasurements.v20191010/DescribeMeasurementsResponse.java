package ksyun.client.influxdb.describemeasurements.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeMeasurementsResponse
* @Description DescribeMeasurements 返回体
*/
@Data
@ToString
public class DescribeMeasurementsResponse extends BaseResponseModel {

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
        @JsonProperty("Total")
        private Integer Total;

        /***/
        @JsonProperty("Offset")
        private Integer Offset;

        /***/
        @JsonProperty("Limit")
        private Integer Limit;

        /***/
        @JsonProperty("Data")
        private List<DataDataDto> Data;

        @Data
        @ToString
        public static class DataDataDto {
            /***/
            @JsonProperty("Name")
            private String Name;

        }

    }

}
