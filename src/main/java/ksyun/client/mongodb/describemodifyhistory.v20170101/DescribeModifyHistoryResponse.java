package ksyun.client.mongodb.describemodifyhistory.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeModifyHistoryResponse
* @Description DescribeModifyHistory 返回体
*/
@Data
@ToString
public class DescribeModifyHistoryResponse extends BaseResponseModel {

    /***/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /***/
    @JsonProperty("HistoryInfo")
    private List<String> HistoryInfo;

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

}
