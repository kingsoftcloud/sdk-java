package ksyun.client.knad.getzonelist.v20230323;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname GetZoneListResponse
 * @Description GetZoneList 返回体
 */
@Data
@ToString
public class GetZoneListResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
