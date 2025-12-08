package ksyun.client.dmp.describehistorysql.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeHistorySQLResponse
* @Description DescribeHistorySQL 返回体
*/
@Data
@ToString
public class DescribeHistorySQLResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
