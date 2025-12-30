package ksyun.client.kec.premigrateinstance.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname PreMigrateInstanceResponse
* @Description PreMigrateInstance 返回体
*/
@Data
@ToString
public class PreMigrateInstanceResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
