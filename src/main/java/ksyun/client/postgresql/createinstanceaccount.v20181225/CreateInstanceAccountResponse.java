package ksyun.client.postgresql.createinstanceaccount.v20181225;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceAccountResponse
* @Description CreateInstanceAccount 返回体
*/
@Data
@ToString
public class CreateInstanceAccountResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
