package ksyun.client.dmp.updatedatabasetable.v20240101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateDatabaseTableResponse
* @Description UpdateDatabaseTable 返回体
*/
@Data
@ToString
public class UpdateDatabaseTableResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
