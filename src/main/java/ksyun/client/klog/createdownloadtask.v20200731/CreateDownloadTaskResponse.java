package ksyun.client.klog.createdownloadtask.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
 * @Classname CreateDownloadTaskResponse
 * @Description CreateDownloadTask 返回体
 */
@Data
@ToString
public class CreateDownloadTaskResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
