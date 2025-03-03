package ksyun.client.pdns.modifyzone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyZoneRequest
 * @Description 请求参数
 */
@Data
public class ModifyZoneRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

}