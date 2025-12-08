package ksyun.client.klog.createdownloadtask.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateDownloadTaskResponse
* @Description CreateDownloadTask 返回体
*/
@Data
@ToString
public class CreateDownloadTaskResponse extends BaseResponseModel {
    /**Res*/
    @JsonProperty("Res")
    private String Res;

}
