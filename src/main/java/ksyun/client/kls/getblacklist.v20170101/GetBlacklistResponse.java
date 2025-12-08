package ksyun.client.kls.getblacklist.v20170101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetBlacklistResponse
* @Description GetBlacklist 返回体
*/
@Data
@ToString
public class GetBlacklistResponse extends BaseResponseModel {
    /***/
    @JsonProperty("GetBlacklistResponse")
    private String GetBlacklistResponse;

}
