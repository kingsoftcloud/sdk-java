package ksyun.client.sqlserver.createinstancedatabase.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceDatabaseResponse
* @Description CreateInstanceDatabase 返回体
*/
@Data
@ToString
public class CreateInstanceDatabaseResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
