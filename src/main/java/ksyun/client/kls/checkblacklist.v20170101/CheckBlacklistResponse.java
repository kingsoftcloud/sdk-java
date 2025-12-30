package ksyun.client.kls.checkblacklist.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CheckBlacklistResponse
* @Description CheckBlacklist 返回体
*/
@Data
@ToString
public class CheckBlacklistResponse extends BaseResponseModel {

    /***/
    @JsonProperty("CheckBlacklistResponse")
    private String CheckBlacklistResponse;

}
