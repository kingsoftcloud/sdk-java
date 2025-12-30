package ksyun.client.clickhouse.listrecycledinstance.v20210101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListRecycledInstanceResponse
* @Description ListRecycledInstance 返回体
*/
@Data
@ToString
public class ListRecycledInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Offset")
    private Integer Offset;

    /***/
    @JsonProperty("Limit")
    private Integer Limit;

    /***/
    @JsonProperty("Total")
    private Integer Total;

    /***/
    @JsonProperty("Data")
    private List<String> Data;

}
