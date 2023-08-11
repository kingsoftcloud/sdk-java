package ksyun.client.klog.getdownloadurls.v20200731;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.Set;

/**
* @Classname GetDownloadUrlsResponse
* @Description GetDownloadUrls 返回体
*/
@Data
@ToString
public class GetDownloadUrlsResponse extends BaseResponseModel {

    /**
     * 请求id
     */
    @JsonProperty("RequestId")
    private String requestId;

    //返回结果，需要按需扩展

}
