package ksyun.client.dmp.describedatabaselist.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDatabaseListResponse
* @Description DescribeDatabaseList 返回体
*/
@Data
@ToString
public class DescribeDatabaseListResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
