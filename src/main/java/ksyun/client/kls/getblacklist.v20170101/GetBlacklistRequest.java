package ksyun.client.kls.getblacklist.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetBlacklistRequest
 * @Description 请求参数
 */
@Data
public class GetBlacklistRequest {
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