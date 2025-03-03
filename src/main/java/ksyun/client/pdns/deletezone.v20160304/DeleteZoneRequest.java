package ksyun.client.pdns.deletezone.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteZoneRequest
 * @Description 请求参数
 */
@Data
public class DeleteZoneRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;


}