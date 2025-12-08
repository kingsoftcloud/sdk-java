package ksyun.client.ked.queryusersinfo.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname QueryUsersinfoResponse
* @Description QueryUsersinfo 返回体
*/
@Data
@ToString
public class QueryUsersinfoResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
