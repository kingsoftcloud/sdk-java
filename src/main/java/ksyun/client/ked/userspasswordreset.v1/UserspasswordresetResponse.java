package ksyun.client.ked.userspasswordreset.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UserspasswordresetResponse
* @Description Userspasswordreset 返回体
*/
@Data
@ToString
public class UserspasswordresetResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("detail")
    private String Detail;

    /***/
    @JsonProperty("data")
    private Boolean Data;

}
