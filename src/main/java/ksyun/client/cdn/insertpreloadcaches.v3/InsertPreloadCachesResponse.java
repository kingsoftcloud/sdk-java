package ksyun.client.cdn.insertpreloadcaches.v3;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname InsertPreloadCachesResponse
* @Description InsertPreloadCaches 返回体
*/
@Data
@ToString
public class InsertPreloadCachesResponse extends BaseResponseModel {

    /**预热返回的任务ID*/
    @JsonProperty("PreloadTaskId")
    private String PreloadTaskId;

}
