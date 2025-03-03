package ksyun.client.kkms.modifykeystate.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyKeyStateRequest
 * @Description 请求参数
 */
@Data
public class ModifyKeyStateRequest {
    /**
     * 客户主KEY的ID
     */
    @KsYunField(name = "KeyId")
    private String KeyId;

    /**
     * KEY的状态
     */
    @KsYunField(name = "KeyState")
    private String KeyState;


}