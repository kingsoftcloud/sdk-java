package ksyun.client.sqlserver.describedbinstancerestorabletime.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBInstanceRestorableTimeResponse
* @Description DescribeDBInstanceRestorableTime 返回体
*/
@Data
@ToString
public class DescribeDBInstanceRestorableTimeResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("RestorableTime")
        private RestorableTimeDto RestorableTime;

        @Data
        @ToString
        public static class RestorableTimeDto {
            /**可以备份的时间区间下限

*/
            @JsonProperty("Begin")
            private String Begin;

            /**可以备份的时间区间上限

*/
            @JsonProperty("End")
            private String End;

        }

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
