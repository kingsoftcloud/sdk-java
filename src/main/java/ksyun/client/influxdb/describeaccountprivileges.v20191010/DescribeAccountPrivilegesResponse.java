package ksyun.client.influxdb.describeaccountprivileges.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAccountPrivilegesResponse
* @Description DescribeAccountPrivileges 返回体
*/
@Data
@ToString
public class DescribeAccountPrivilegesResponse extends BaseResponseModel {
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
        private List<DataDtoDataDto> Data;

        @Data
        @ToString
        public static class DataDtoDataDto {
            /***/
            @JsonProperty("DatabaseName")
            private String DatabaseName;

            /***/
            @JsonProperty("AccountPrivilege")
            private String AccountPrivilege;

        }

    }

}
