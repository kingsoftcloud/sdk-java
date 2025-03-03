package ksyun.client.memcached.updatepassword.v20180627;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdatePasswordRequest
 * @Description 请求参数
 */
@Data
public class UpdatePasswordRequest {
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