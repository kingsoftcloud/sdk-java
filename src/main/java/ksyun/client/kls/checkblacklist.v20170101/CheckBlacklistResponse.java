package ksyun.client.kls.checkblacklist.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname CheckBlacklistResponse
 * @Description CheckBlacklist 返回体
 */
@Data
@ToString
public class CheckBlacklistResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
