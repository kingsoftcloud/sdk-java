package ksyun.client.influxdb.describedatabases.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDatabasesResponse
* @Description DescribeDatabases 返回体
*/
@Data
@ToString
public class DescribeDatabasesResponse extends BaseResponseModel {
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
        private List<DataDto> Data;

        @Data
        @ToString
        public static class DataDto {
            /***/
            @JsonProperty("DatabaseName")
            private String DatabaseName;

        }

    }

}
