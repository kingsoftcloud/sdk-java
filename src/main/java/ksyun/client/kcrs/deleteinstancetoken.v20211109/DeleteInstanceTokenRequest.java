package ksyun.client.kcrs.deleteinstancetoken.v20211109;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceTokenRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceTokenRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例访问凭证的id
     */
    @KsYunField(name = "TokenId")
    private String TokenId;


}