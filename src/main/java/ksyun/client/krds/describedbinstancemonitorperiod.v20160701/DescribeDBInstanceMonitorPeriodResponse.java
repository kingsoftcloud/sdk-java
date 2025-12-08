package ksyun.client.krds.describedbinstancemonitorperiod.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDBInstanceMonitorPeriodResponse
* @Description DescribeDBInstanceMonitorPeriod 返回体
*/
@Data
@ToString
public class DescribeDBInstanceMonitorPeriodResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**单位：秒*/
        @JsonProperty("Period")
        private Integer Period;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
