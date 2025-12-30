package ksyun.client.sqlserver.modifyinstancedatabasename.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyInstanceDatabaseNameResponse
* @Description ModifyInstanceDatabaseName 返回体
*/
@Data
@ToString
public class ModifyInstanceDatabaseNameResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
