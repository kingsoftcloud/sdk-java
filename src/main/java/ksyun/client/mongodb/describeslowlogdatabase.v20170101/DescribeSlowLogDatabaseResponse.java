package ksyun.client.mongodb.describeslowlogdatabase.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSlowLogDatabaseResponse
* @Description DescribeSlowLogDatabase 返回体
*/
@Data
@ToString
public class DescribeSlowLogDatabaseResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private List<String> Data;

}
