package ksyun.client.dmp.describedatabaseschema.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDatabaseSchemaResponse
* @Description DescribeDatabaseSchema 返回体
*/
@Data
@ToString
public class DescribeDatabaseSchemaResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
