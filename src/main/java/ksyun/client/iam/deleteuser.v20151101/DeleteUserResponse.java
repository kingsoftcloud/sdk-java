package ksyun.client.iam.deleteuser.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteUserResponse
* @Description DeleteUser 返回体
*/
@Data
@ToString
public class DeleteUserResponse extends BaseResponseModel {
    /**返回结果*/
    @JsonProperty("result")
    private Integer Result;

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
