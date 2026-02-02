package ksyun.client.cdn.refreshcaches.v20160901;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RefreshCachesResponse
* @Description RefreshCaches 返回体
*/
@Data
@ToString
public class RefreshCachesResponse extends BaseResponseModel {

    /**RefreshTaskId*/
    @JsonProperty("RefreshTaskId")
    private String RefreshTaskId;

}
