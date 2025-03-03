package ksyun.client.kce.editeventcollecting.v20190806;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname EditEventCollectingRequest
 * @Description 请求参数
 */
@Data
public class EditEventCollectingRequest {
    /***/
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 是否开启推送
     * <p>
     * - true 开启
     * - false 关闭
     */
    @KsYunField(name = "EnableEventCollecting")
    private Boolean EnableEventCollecting;


}