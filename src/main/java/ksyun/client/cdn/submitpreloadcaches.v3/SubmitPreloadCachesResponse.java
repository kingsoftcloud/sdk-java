package ksyun.client.cdn.submitpreloadcaches.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SubmitPreloadCachesResponse
* @Description SubmitPreloadCaches 返回体
*/
@Data
@ToString
public class SubmitPreloadCachesResponse extends BaseResponseModel {

    /**预热返回的任务ID*/
    @JsonProperty("PreloadTaskId")
    private String PreloadTaskId;

}
