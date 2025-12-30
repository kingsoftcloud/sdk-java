package ksyun.client.sqlserver.deleteinstancedatabase.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteInstanceDatabaseResponse
* @Description DeleteInstanceDatabase 返回体
*/
@Data
@ToString
public class DeleteInstanceDatabaseResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
