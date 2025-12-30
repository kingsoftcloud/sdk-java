package ksyun.client.cdn.getrefreshorpreloadtask.v20211201;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetRefreshOrPreloadTaskResponse
* @Description GetRefreshOrPreloadTask 返回体
*/
@Data
@ToString
public class GetRefreshOrPreloadTaskResponse extends BaseResponseModel {

    /***/
    @JsonProperty("GetRefreshOrPreloadTaskResponse")
    private String GetRefreshOrPreloadTaskResponse;

}
