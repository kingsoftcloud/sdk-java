package ksyun.client.mongodb.renamemongodbinstance.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RenameMongoDBInstanceResponse
* @Description RenameMongoDBInstance 返回体
*/
@Data
@ToString
public class RenameMongoDBInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("InstanceId")
    private String InstanceId;

    /***/
    @JsonProperty("name")
    private String Name;

}
