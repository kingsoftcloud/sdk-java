package ksyun.client.postgresql.deletedbinstance.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDBInstanceResponse
* @Description DeleteDBInstance 返回体
*/
@Data
@ToString
public class DeleteDBInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
