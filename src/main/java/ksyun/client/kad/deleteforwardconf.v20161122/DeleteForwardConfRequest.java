package ksyun.client.kad.deleteforwardconf.v20161122;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteForwardConfRequest
 * @Description 请求参数
 */
@Data
public class DeleteForwardConfRequest {
    /**
     * 四层转发配置ID
     */
    @KsYunField(name = "ForwardConfId")
    private String ForwardConfId;

}