package ksyun.client.kls.listhistorypubstreamserrinfo.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListHistoryPubStreamsErrInfoRequest
 * @Description 请求参数
 */
@Data
public class ListHistoryPubStreamsErrInfoRequest {
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