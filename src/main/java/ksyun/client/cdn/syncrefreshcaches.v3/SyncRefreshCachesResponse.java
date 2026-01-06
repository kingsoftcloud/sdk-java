package ksyun.client.cdn.syncrefreshcaches.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SyncRefreshCachesResponse
* @Description SyncRefreshCaches 返回体
*/
@Data
@ToString
public class SyncRefreshCachesResponse extends BaseResponseModel {

    /**刷新返回的任务ID*/
    @JsonProperty("RefreshTaskId")
    private String RefreshTaskId;

}
