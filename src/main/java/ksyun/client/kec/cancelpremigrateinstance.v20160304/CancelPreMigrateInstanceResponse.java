package ksyun.client.kec.cancelpremigrateinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CancelPreMigrateInstanceResponse
* @Description CancelPreMigrateInstance 返回体
*/
@Data
@ToString
public class CancelPreMigrateInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
