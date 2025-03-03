package ksyun.client.kls.checkblacklist.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname CheckBlacklistRequest
 * @Description 请求参数
 */
@Data
public class CheckBlacklistRequest {
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