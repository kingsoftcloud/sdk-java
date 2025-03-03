package ksyun.client.pdns.deleteprivatedns.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeletePrivateDnsRequest
 * @Description 请求参数
 */
@Data
public class DeletePrivateDnsRequest {
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

    /**
     * 项目ID
     */
    @KsYunField(name = "ProjectId")
    private String ProjectId;


}