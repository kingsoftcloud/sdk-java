package ksyun.client.kls.liststreamdurations.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListStreamDurationsRequest
 * @Description 请求参数
 */
@Data
public class ListStreamDurationsRequest {
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