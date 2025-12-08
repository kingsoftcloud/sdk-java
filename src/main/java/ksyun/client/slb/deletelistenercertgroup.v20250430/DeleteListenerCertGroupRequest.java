package ksyun.client.slb.deletelistenercertgroup.v20250430;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteListenerCertGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteListenerCertGroupRequest{
    /**证书组的ID*/
    @KsYunField(name="ListenerCertGroupId")
    private String ListenerCertGroupId;

}
