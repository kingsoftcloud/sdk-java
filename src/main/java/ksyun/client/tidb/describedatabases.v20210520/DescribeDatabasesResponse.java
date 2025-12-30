package ksyun.client.tidb.describedatabases.v20210520;

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

    /**数据库库名列表*/
    @JsonProperty("Data")
    private List<String> Data;

}
