package ksyun.client.slb.deletealblistenercertgroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAlbListenerCertGroupRequest
* @Description 请求参数
*/
@Data
public class DeleteAlbListenerCertGroupRequest{
    /**证书组的ID*/
    @KsYunField(name="AlbListenerCertGroupId")
    private String AlbListenerCertGroupId;

}