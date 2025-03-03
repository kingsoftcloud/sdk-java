package ksyun.client.kls.listhistorypubstreamsinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListHistoryPubStreamsInfoRequest
 * @Description 请求参数
 */
@Data
public class ListHistoryPubStreamsInfoRequest {
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