package ksyun.client.sqlserver.restoretocurinstance.v20190425;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RestoreToCurInstanceResponse
* @Description RestoreToCurInstance 返回体
*/
@Data
@ToString
public class RestoreToCurInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
