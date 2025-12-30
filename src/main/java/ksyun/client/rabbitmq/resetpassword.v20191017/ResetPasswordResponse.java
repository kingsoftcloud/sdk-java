package ksyun.client.rabbitmq.resetpassword.v20191017;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ResetPasswordResponse
* @Description ResetPassword 返回体
*/
@Data
@ToString
public class ResetPasswordResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private String Data;

}
