package ksyun.client.kcs.updatepassword.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdatePasswordResponse
* @Description UpdatePassword 返回体
*/
@Data
@ToString
public class UpdatePasswordResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
