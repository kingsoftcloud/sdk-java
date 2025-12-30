package ksyun.client.influxdb.deletedatabase.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDatabaseResponse
* @Description DeleteDatabase 返回体
*/
@Data
@ToString
public class DeleteDatabaseResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
