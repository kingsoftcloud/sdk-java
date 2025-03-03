package ksyun.client.kls.listrealtimestreamsinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListRealtimeStreamsInfoRequest
 * @Description 请求参数
 */
@Data
public class ListRealtimeStreamsInfoRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

    /**
     * Version
     */
    @KsYunField(name = "Version")
    private String Version;

}