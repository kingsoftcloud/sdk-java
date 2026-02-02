package ksyun.client.cdn.submitrefreshcaches.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SubmitRefreshCachesResponse
* @Description SubmitRefreshCaches 返回体
*/
@Data
@ToString
public class SubmitRefreshCachesResponse extends BaseResponseModel {

    /**刷新返回的任务ID*/
    @JsonProperty("RefreshTaskId")
    private String RefreshTaskId;

}
