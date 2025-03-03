package ksyun.client.kls.resumestream.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ResumeStreamRequest
 * @Description 请求参数
 */
@Data
public class ResumeStreamRequest {
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