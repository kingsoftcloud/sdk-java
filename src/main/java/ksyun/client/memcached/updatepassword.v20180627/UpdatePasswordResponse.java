package ksyun.client.memcached.updatepassword.v20180627;

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
    @JsonProperty("reqId")
    private String ReqId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
    }

}
