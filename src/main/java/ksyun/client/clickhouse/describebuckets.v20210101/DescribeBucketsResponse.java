package ksyun.client.clickhouse.describebuckets.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeBucketsResponse
* @Description DescribeBuckets 返回体
*/
@Data
@ToString
public class DescribeBucketsResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<String> Data;

}
