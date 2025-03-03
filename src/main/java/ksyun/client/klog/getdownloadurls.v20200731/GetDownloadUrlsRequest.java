package ksyun.client.klog.getdownloadurls.v20200731;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetDownloadUrlsRequest
 * @Description 请求参数
 */
@Data
public class GetDownloadUrlsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}