package ksyun.client.knad.getblocklocations.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

/**
 * @Classname GetBlockLocationsResponse
 * @Description GetBlockLocations 返回体
 */
@Data
@ToString
public class GetBlockLocationsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
