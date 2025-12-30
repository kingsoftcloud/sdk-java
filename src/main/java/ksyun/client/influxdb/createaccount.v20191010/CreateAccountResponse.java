package ksyun.client.influxdb.createaccount.v20191010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAccountResponse
* @Description CreateAccount 返回体
*/
@Data
@ToString
public class CreateAccountResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
