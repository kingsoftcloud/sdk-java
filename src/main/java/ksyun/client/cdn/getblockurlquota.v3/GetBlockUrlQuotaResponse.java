package ksyun.client.cdn.getblockurlquota.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetBlockUrlQuotaResponse
* @Description GetBlockUrlQuota 返回体
*/
@Data
@ToString
public class GetBlockUrlQuotaResponse extends BaseResponseModel {

    /**屏蔽URL的上限条数*/
    @JsonProperty("BlockUrlQuota")
    private Long BlockUrlQuota;

    /**剩余屏蔽 Url的 条数*/
    @JsonProperty("BlockUrlSurplus")
    private Long BlockUrlSurplus;

}
