package ksyun.client.kad.deleteforwardsource.v20161122;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteForwardSourceRequest
 * @Description 请求参数
 */
@Data
public class DeleteForwardSourceRequest {
    /**
     * 四层转发源站配置的ID
     */
    @KsYunField(name = "ForwardSourceId")
    private String ForwardSourceId;


}